package com.example.spynotfinal;

public class AppInfoPair {
	//A pair class to hold the info for the AppInfo listview

	private String label;
	private String stat;
	
	public AppInfoPair(String label, String stat) {
		this.label = label;
		this.stat = stat;
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	
	
}
