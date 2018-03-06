package com.example.spynotfinal;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class SelectRatingActivity extends Activity{
	
	String[] options = {Rating.HIGH.toString(), Rating.MEDIUM.toString(), 
			Rating.LOW.toString(), "Custom Permission Warnings"};
	SharedPreferences selectedWarning;
	private RadioGroup radioButtons;
	private RadioButton high;
	private RadioButton medium;
	private RadioButton low;
	private TextView custom;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_rating);
		
		//get the user selected warning level from the preferences
		selectedWarning = this.getSharedPreferences(SpyNotApplication.PREF_FILENAME, 0);
		
		//launch the custom preference activity if the user selects the custom permissions options
		custom = (TextView) findViewById(R.id.textCustomPermissions);
		custom.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SelectRatingActivity.this, PreferenceActivity.class);
				startActivity(i);
			}
		});
		
		//sets the user selected warning levels high, medium, or low
		high = (RadioButton) findViewById(R.id.radioHigh);
		medium = (RadioButton) findViewById(R.id.radioMedium);
		low = (RadioButton) findViewById(R.id.radioLow);
		radioButtons = (RadioGroup) findViewById(R.id.radioGroup1);
		radioButtons.setOnCheckedChangeListener(new OnCheckedChangeListener() {	
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				SharedPreferences.Editor editor = selectedWarning.edit();
				if (high.isChecked()) {
					editor.putString("WarningLevel", Rating.HIGH.toString());
				}
				else if (medium.isChecked()) {					
					editor.putString("WarningLevel", Rating.MEDIUM.toString());
				}
				else if (low.isChecked()) {
					editor.putString("WarningLevel", Rating.LOW.toString());
				}
				editor.commit();
			}
		});
		
		
	}


	

}
