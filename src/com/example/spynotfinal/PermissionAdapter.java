package com.example.spynotfinal;

import java.util.ArrayList;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PermissionAdapter extends ArrayAdapter<Permission> {

	private Context context;
	private ArrayList<Permission> values;
	private SharedPreferences checkedPreferences;
	
	public PermissionAdapter(Context context, ArrayList<Permission> values) {
		super(context, R.layout.permission_row, values);
		this.context = context;
		this.values = values;
		this.checkedPreferences = context.getSharedPreferences(SpyNotApplication.PREF_FILENAME, 0);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.permission_row, parent, false);
		
		//Set the name of the permission for each row
		TextView textView = (TextView) rowView.findViewById(R.id.textPermission);
		textView.setText(values.get(position).toString().replace('_', ' '));
		
		//Set the description of the permission
		textView = (TextView) rowView.findViewById(R.id.textPermissionDesc);
		textView.setText(values.get(position).getDescription());
		
		//Set the warning image to be displayed next to the permission
		ImageView imageView = (ImageView) rowView.findViewById(R.id.imagePermission);
		
		//If statements to change image to a warning image if the 
		//permission in the text matches a user warned permission
		Boolean checked = checkedPreferences.getBoolean(values.get(position).toString(), false);
		if (!checked)
			imageView.setImageResource(R.drawable.l2);
		else
			imageView.setImageResource(R.drawable.l5);
		
		return rowView;
	}
	
	

}
