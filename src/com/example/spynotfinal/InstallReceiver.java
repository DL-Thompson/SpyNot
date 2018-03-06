package com.example.spynotfinal;

import java.util.concurrent.ExecutionException;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;

public class InstallReceiver extends BroadcastReceiver{
	static final String TAG = "InstallReceiver";
	private String packageName;
	
	@Override
	public void onReceive(Context context, Intent intent) {
		//Performs calculations on the downloaded package to decide if a
		//warning should be issued
		packageName = intent.getData().getEncodedSchemeSpecificPart();
		SpyNotCalculations calculations = new SpyNotCalculations(context);
		
		//Launches the RatingActivity if the rating is high enough
		try {
			//Sets a bool if the installed app is flagged
			Boolean flagged = calculations.execute(packageName).get();
			if (flagged) {
				//Launches activity
				Intent i = new Intent(context, RatingActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				i.putExtra("packageName", packageName);
				context.startActivity(i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	private void logData() {
		Log.d(TAG, "InstallReceiver: Install Package: " + packageName );
	}

}
