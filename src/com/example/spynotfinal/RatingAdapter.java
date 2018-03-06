package com.example.spynotfinal;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class RatingAdapter extends ArrayAdapter<Rating> {

	private Context context;
	private Rating[] values;
	private SpyNotCalculations calculations;
	
	public RatingAdapter(Context context, Rating[] values, SpyNotCalculations calculations) {
		super(context, R.layout.permission_row, values);
		this.context = context;
		this.values = values;
		this.calculations = calculations;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {	
		//Displays the ratings in the listview
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.rating_row, parent, false);
		
		switch (position) {
		case 0:
			//Rating 1
			setView("Market Score:", calculations.marketScoreRating(), rowView);
			break;
		case 1:
			//Rating 2
			setView("Info Access:", calculations.getInfoAccessRating(), rowView);
			break;
		case 2:
			//Rating 3
			setView("Malware:", calculations.getMalwareRating(), rowView);
			break;
		case 3:
			//Rating 4
			setView("Permissions:", calculations.getCheckedPermissionRating(), rowView);
			break;
		}
		return rowView;
	}
	
	private void setView(String name, Rating rating, View rowView) {
		//Set the name of the rating
		TextView textView = (TextView) rowView.findViewById(R.id.ratingText);
		textView.setText(name);
		
		//Set the value of the rating
		textView = (TextView) rowView.findViewById(R.id.ratingTextValue);
		textView.setText(rating.toString());
		switch (rating) {
		case HIGH:
			textView.setTextColor(Color.RED);
			break;
		case MEDIUM:
			textView.setTextColor(Color.parseColor("#FFA500"));
			break;
		case LOW:
			textView.setTextColor(Color.GREEN);
			break;
		default:
			break;
		}
	}
	
	

}
