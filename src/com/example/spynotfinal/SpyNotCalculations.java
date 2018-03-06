package com.example.spynotfinal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import android.util.Log;

public class SpyNotCalculations extends AsyncTask<String, Integer, Boolean>{
	
	private static final String TAG = "SpyNotCalculations";
	
	private Context ratingContext;
	private Context context;
	
	//Info on the apps
	private ArrayList<Permission> permissions;
	private int numRatings;
	private double avgScore;
	private int installCount;
	private String category;
	private String packageName;
	private String appName;
	private boolean interrupted;
	private int star5, star4, star3, star2, star1;
	private boolean topDeveloper;
	
	
	public SpyNotCalculations(Context context) {
		this.context = context;
		this.permissions = new ArrayList<Permission>();
		//Sets the calculation class so it can be accessed globally
		((SpyNotApplication)context.getApplicationContext()).setCalculations(this);
	}
	
	public AppInfoPair[] getAppInfo() {
		//Returns the App information to be loaded into a viewlist
		int td = 0;
		if (topDeveloper) td = 1;
		AppInfoPair[] appInfo = new AppInfoPair[10+td];
		appInfo[0] = new AppInfoPair(appName, "App Name:");
		appInfo[1] = new AppInfoPair("Top Developer", "");
		appInfo[1+td] = new AppInfoPair("Category:", category);
		appInfo[2+td] = new AppInfoPair("Install Count:", String.valueOf(installCount));
		appInfo[3+td] = new AppInfoPair("Total Ratings:", String.valueOf(numRatings));
		appInfo[4+td] = new AppInfoPair("Avg Score:", String.valueOf(avgScore));
		appInfo[5+td] = new AppInfoPair("5 Star Ratings:", String.valueOf(star5));
		appInfo[6+td] = new AppInfoPair("4 Star Ratings:", String.valueOf(star4));
		appInfo[7+td] = new AppInfoPair("3 Star Ratings:", String.valueOf(star3));
		appInfo[8+td] = new AppInfoPair("2 Star Ratings:", String.valueOf(star2));
		appInfo[9+td] = new AppInfoPair("1 Star Ratings:", String.valueOf(star1));		
		return appInfo;
	}
	
	@Override
	protected Boolean doInBackground(String... params) {
		//Loads the market scraper in a background thread so it can retrieve
		//the app info from the market.
		String packageName = params[0];
		getAppInfo(packageName);
		try {
			MarketScraper scraper = new MarketScraper(packageName);
			numRatings = scraper.getRatings();
			avgScore = scraper.getScore();
			installCount = scraper.getCount();
			category = scraper.getCategory();
			star5 = scraper.get5Star();
			star4 = scraper.get4Star();
			star3 = scraper.get3Star();
			star2 = scraper.get2Star();
			star1 = scraper.get1Star();
			topDeveloper = scraper.getTopDeveloper();
		} catch (IOException e) {
			//If the market scraper can't get an internet connection it throws this exception.
			Log.d(TAG, "Market scraper failed to make a connection.");
			interrupted = true;
			return false;
		}
		
		//if the avg rating is >= the user defined ratings, return true and launch
		//the ratings activity
		//Gets the user option warning rating to decide if the warning should
		//be launched
		SharedPreferences prefs = context.getSharedPreferences(SpyNotApplication.PREF_FILENAME, 0);
		String r = prefs.getString("WarningLevel", null);
		if (Rating.valueOf(r) == Rating.LOW) {
			return true;
		}
		else if (Rating.valueOf(r) == Rating.MEDIUM && (getAvgRating() != Rating.LOW)) {
			return true;
		}
		else if (Rating.valueOf(r) == Rating.HIGH && getAvgRating() == Rating.HIGH) {
			return true;
		}
		else if (getCheckedPermissionRating() == Rating.HIGH) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	protected void onPostExecute(Boolean result) {
		super.onPostExecute(result);
		if (interrupted) {
			//The activity was interrupted because it couldn't make an internet connection.
			//Show a popup informing the user the rating activity will not show.
			//A popup must be sent through an activity, and no activity is active. 
			//Needs an alternate solution. Currently just closes the app. Fix later.
		}
		
	}
	
	private void getAppInfo(String packageName) {
		try {
			//Collect the permissions and name from the installed app
			PackageManager pm = context.getPackageManager();
			ApplicationInfo ai;
			ai = pm.getApplicationInfo(packageName, 0);
			appName = (String) pm.getApplicationLabel(ai);
			PackageInfo pi = pm.getPackageInfo(packageName, PackageManager.GET_PERMISSIONS);
			for (int i = 0; i < pi.requestedPermissions.length; i++) {
				String[] permSplit = pi.requestedPermissions[i].toString().split("\\.");
				String perm = permSplit[2].trim();
				try {
					//Try to add the permission to the list. Will only be added if the permission
					//is a valid standard permission type. Otherwise, it throws an error which is caught.
					permissions.add(Permission.valueOf(perm));
				} 
				catch (Exception e) {
					Log.d(TAG, "Invalid Permission Type: " + perm);
					e.printStackTrace();
				}
			}
			//Store the permissions in the global Application
			((SpyNotApplication)context.getApplicationContext()).setInstalledPermissions(permissions);
		} catch (NameNotFoundException e) {
			Log.e(TAG, "NameNotFoundException thrown. Invalid package name passed to PackageManager");
		}	
	}
	
	public Rating marketScoreRating() {
		//Returns a market score rating. The avg score rating is weighted depending on
		//the total number of downloads. An app with a rating of 4.5 with > 10 million 
		//downloads is most likely safe. An app with a rating of 4.5 with only 10 downloads
		//is still questionable.
		if (topDeveloper)
			return Rating.LOW;
		else if (installCount >= 10000000 && avgScore >= 3.5)
			return Rating.LOW;
		else if (installCount >= 10000000 && avgScore < 3.5 && avgScore >= 2.5)
			return Rating.MEDIUM;
		else if (installCount >= 10000000 && avgScore < 2.5)
			return Rating.HIGH;
		else if (installCount < 10000000 && installCount >= 1000000 && avgScore >= 4.0)
			return Rating.LOW;
		else if (installCount < 10000000 && installCount >= 1000000 && avgScore >= 3.0 && avgScore < 4.0)
			return Rating.MEDIUM;
		else if (installCount < 10000000 && installCount >= 1000000 && avgScore < 3.0)
			return Rating.HIGH;
		else if(installCount < 1000000 && installCount >= 100000 && avgScore >= 4.5)
			return Rating.LOW;
		else if(installCount < 1000000 && installCount >= 100000 && avgScore < 4.5 && avgScore >= 3.5)
			return Rating.MEDIUM;
		else if(installCount < 1000000 && installCount >= 100000 && avgScore < 3.5)
			return Rating.HIGH;
		else if (installCount < 100000 && installCount >= 10000 && avgScore >= 4.5)
			return Rating.LOW;
		else if (installCount < 100000 && installCount >= 10000 && avgScore >= 4.0 && avgScore < 4.5)
			return Rating.MEDIUM;
		else if (installCount < 100000 && installCount >= 10000 && avgScore < 4.0)
			return Rating.HIGH;
		else return Rating.HIGH;
	} 
	
	public Rating getInfoAccessRating() {
		//If the app has access to a combination of dangerous permissions such as the ability to
		//read your private info and the ability to send that info, it is flagged as dangerous. This
		//is combined with other ratings to determine if the app should be warned as a threat.
		boolean accessInfo = false;
		boolean sendInfo = false;
		//Checks to see if the app has the ability to read your personal private info
		if (
				permissions.contains(Permission.READ_CALENDAR) ||
				permissions.contains(Permission.READ_CALL_LOG) ||
				permissions.contains(Permission.READ_CONTACTS) ||
				permissions.contains(Permission.READ_EXTERNAL_STORAGE) ||
				permissions.contains(Permission.READ_HISTORY_BOOKMARKS) ||
				permissions.contains(Permission.READ_LOGS) ||
				permissions.contains(Permission.READ_PROFILE) ||
				permissions.contains(Permission.READ_SMS) ||
				permissions.contains(Permission.READ_SOCIAL_STREAM) ||
				permissions.contains(Permission.SUBSCRIBED_FEEDS_READ) 
				) {
			accessInfo = true;
		}
		//Checks to see if the app has the ability to send any info it has gathered
		if (
				permissions.contains(Permission.INTERNET) ||
				permissions.contains(Permission.SEND_RESPOND_VIA_MESSAGE) ||
				permissions.contains(Permission.SEND_SMS) ||
				permissions.contains(Permission.CALL_PHONE) ||
				permissions.contains(Permission.CALL_PRIVILEGED)
				) {
			sendInfo = true;
		}
		
		if (accessInfo && sendInfo) return Rating.HIGH;
		else return Rating.LOW;
	}
	
	public Rating getMalwareRating() { 
		//When malware apps are detected, they are often repackaged under different names. This 
		//rating scans the malware database to see if the installed app matches any stored malware apps
		//Todo: Query malware databse and return a HIGH/LOW rating.
		
		//Placeholder rating. Database still needs to be added.
		return Rating.LOW;
	}
	
	public Rating getCheckedPermissionRating() {
		//Checks to see if the app contains any of the permissions the user asked to be warned about.
		boolean checkedPermissions = false;
		SharedPreferences prefs = context.getSharedPreferences(SpyNotApplication.PREF_FILENAME, 0);
		for (Permission p : Permission.values()) {
			if (prefs.getBoolean(p.toString(), false) == true && permissions.contains(p)) {
				checkedPermissions = true;
				break;
			}
		}
		if (checkedPermissions) return Rating.HIGH;
		else return Rating.LOW;
	}
	
	public Rating getAvgRating() {
		//Returns the overall rating of the spynot application. If the app matches a known malware
		//apps permissions, there is a chance it could be a copy of that malware, and a high rating
		//is automatically thrown. If the getInfoAccess rating is low, the app can't retrieve and send
		//your personal information, so there is a good chance it is safe. If the app has access to your data
		//and has the ability to send that data, the score is based on the market score rating which takes
		//downloads and ratings into account.
		if (getMalwareRating() == Rating.HIGH)
			return Rating.HIGH;
		else if (getInfoAccessRating() == Rating.LOW)
			return Rating.LOW;
		else if (getInfoAccessRating() == Rating.HIGH)
			return marketScoreRating();
		return Rating.HIGH;
	}

	
	private void logData() {
		Log.d(TAG, "SpyNotCalculations Rating: " + numRatings);
		Log.d(TAG, "SpyNotCalculations Score: " + avgScore);
		Log.d(TAG, "SpyNotCalculations Count: " + installCount);
		Log.d(TAG, "SpyNotCalculations Category: " + category);
		Log.d(TAG, "SpyNotCalculations Permission Length: " + permissions.size());
		int i = 0;
		for (Permission p : permissions) {
			Log.d(TAG, "SpyNotCalculations Permission: " + p.toString() + "  " + i);
			i++;
		}
	}
}
