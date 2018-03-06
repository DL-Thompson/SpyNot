package com.example.spynotfinal;

import java.util.ArrayList;

import android.app.Application;

public class SpyNotApplication extends Application{
	//Stores global values for the SpyNot app
	
	public static final String PREF_FILENAME = "CheckedPermissions";
	private ArrayList<Permission> permissions;
	private SpyNotCalculations calculations;
	
	
	public void setInstalledPermissions(ArrayList<Permission> permissions) {
		this.permissions = permissions;
	}
	
	public ArrayList<Permission> getInstalledPermissions() {
		return permissions;
	}
	
	public void setCalculations(SpyNotCalculations calculations) {
		this.calculations = calculations;
	}
	
	public SpyNotCalculations getCalculations() {
		return calculations;
	}
}