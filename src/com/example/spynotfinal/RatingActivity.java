package com.example.spynotfinal;


import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

public class RatingActivity extends Activity implements OnItemClickListener{
	
	//private ArrayList<String> permissions;
	private ArrayList<Permission> permissions;
	private AppInfoPair[] appInfo;
	
	
	
	//default ratings placeholder
	private Rating[] ratings = {Rating.HIGH, Rating.HIGH, Rating.HIGH, Rating.HIGH};
	private SpyNotCalculations calculations;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rating);
		
		//Get the permissions for the installed app
		permissions = ((SpyNotApplication)getApplication()).getInstalledPermissions();
		calculations = ((SpyNotApplication)getApplication()).getCalculations();
		appInfo = calculations.getAppInfo();
		//
		//Set the rating label at the top of the activity
		setAvgRating();
		
		//Initialize the tab section
		TabHost th = (TabHost) findViewById(R.id.tabhost);
		th.setup();
		
		//Add the Rating tab
		TabSpec specs = th.newTabSpec("Ratings");
		specs.setContent(R.id.tab_rating);
		specs.setIndicator("Ratings");
		th.addTab(specs);
		
		//Add the Permission Tab
		specs = th.newTabSpec("Preferences");
		specs.setContent(R.id.tab_permission);
		specs.setIndicator("Permissions");
		th.addTab(specs);
		
		//Add AppInfo Tab
		specs = th.newTabSpec("App Info");
		specs.setContent(R.id.tab_appinfo);
		specs.setIndicator("App Info");
		th.addTab(specs);
		
		//Uninstall Button
		final Button uninstall_button = (Button) findViewById(R.id.uninstall_button);
		uninstall_button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = getIntent();
				String packageName = i.getStringExtra("packageName");
				Uri packageURI = Uri.parse("package:" + packageName);
				Intent ui = new Intent(Intent.ACTION_UNINSTALL_PACKAGE, packageURI);
				startActivityForResult(ui, 1);
				finish();
			}
		});
		
		//Exit Button
		final Button exit_button = (Button) findViewById(R.id.exit_button);
		exit_button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
				System.exit(0);
			}
		});
		
		//ListView for permissions
		ListView permissionList = (ListView) findViewById(R.id.permission_listview);
		PermissionAdapter pAdapter = new PermissionAdapter(this, permissions);
		permissionList.setAdapter(pAdapter);	
		permissionList.setOnItemClickListener(this);
		
		//ListView for Ratings
		ListView ratingList = (ListView) findViewById(R.id.rating_listview);
		RatingAdapter rAdapter = new RatingAdapter(this, ratings, calculations);
		ratingList.setAdapter(rAdapter);
		ratingList.setOnItemClickListener(this);
		
		//ListView for App Info
		ListView appInfoList = (ListView) findViewById(R.id.appinfo_listview);
		AppInfoAdapter aiAdapter = new AppInfoAdapter(this, appInfo);
		appInfoList.setAdapter(aiAdapter);
		appInfoList.setOnItemClickListener(this);
		}

	@Override
	public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
		//If its the rating listview, give the information for that rating
		if (adapter.getId() == R.id.rating_listview) {
			popUpRatingInfo(position);
		}	
	}
	
	public void showPopUp(String msg) {
		//Displays a Ok Popup dialog with the passed message
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage(msg)
		       .setCancelable(false)
		       .setPositiveButton("OK", new DialogInterface.OnClickListener() {
		           public void onClick(DialogInterface dialog, int id) {
		        	   //Does nothing. It's just an alert.
		           }
		       });
		AlertDialog alert = builder.create();
		alert.show();
	}

	private void popUpPermissionInfo(Permission permission) {
		//Sets the message to pop up when a permission is clicked on
		showPopUp(permission.getDescription());
	}
	
	private void popUpRatingInfo(int position) {
		//Sets the message to pop up when a rating is clicked on
		if (position == 0) showPopUp("This rating takes a combination of information from the android market." +
				"It performs the calculation based on values such as number of downloads, average rating, total ratings, etc..");
		else if (position == 1) showPopUp("This rates an apps ability to send and receive your personal information." +
				"If it has the ability to read your data and send any info it has read, it is rated High.");
		else if (position == 2) showPopUp("Often malware apps are repackaged under different names when they are detected." +
				"This rating scans our malware database and compares the installed app to known malware apps.");
		else if (position == 3) showPopUp("This rating is based on your custom checked permissions from the options menu." +
				" If the application contains a permission you asked to be warned about, it returns a High rating.");
	}
	
	private void setAvgRating() {
		//Sets the Rating level at the top of the activity
		Rating rating = calculations.getAvgRating();
		TextView avgRating = (TextView) findViewById(R.id.textAvgRating);
		avgRating.setText(rating.toString());
		if (rating == Rating.HIGH) avgRating.setTextColor(Color.RED);
		else if (rating == Rating.MEDIUM) avgRating.setTextColor(Color.parseColor("#FFA500"));
		else if (rating == Rating.LOW) avgRating.setTextColor(Color.GREEN);
	}

}
