package com.example.spynotfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class AppInfoAdapter extends ArrayAdapter<AppInfoPair> {
	private Context context;
	private AppInfoPair[] values;
	
	public AppInfoAdapter(Context context, AppInfoPair[] values) {
		super(context, R.layout.appinfo_row, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		//Sets the text for each AppInfo listview
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView;
		//If the application is a top developer, it displays an extra row in the app information
		if (values[position].getLabel().equals("Top Developer") || values[position].getStat().equals("App Name:") ) {
			rowView = inflater.inflate(R.layout.center_row, parent, false);
			TextView textViewLabel = (TextView) rowView.findViewById(R.id.appInfoCenter);
			textViewLabel.setText(values[position].getLabel());
		}
		else {
			rowView = inflater.inflate(R.layout.appinfo_row, parent, false);
			TextView textViewLabel = (TextView) rowView.findViewById(R.id.appInfoLabel);
			TextView textViewStat = (TextView) rowView.findViewById(R.id.appInfoStat);
			
			textViewLabel.setText(values[position].getLabel());
			textViewStat.setText(values[position].getStat());
		}
		
		



		return rowView;
	}
}
