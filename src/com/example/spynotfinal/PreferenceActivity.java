package com.example.spynotfinal;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class PreferenceActivity extends Activity {

	ListView list;
	Context c;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_preference);
		c = this;
		list = (ListView) findViewById(R.id.listView1);
		list.setAdapter(new CustomAdapter(this, 1));
		this.getActionBar().setDisplayShowTitleEnabled(false);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		super.onOptionsItemSelected(item);
		if (item.getItemId() == R.id.sort_alphabet) {
			list.setAdapter(new CustomAdapter(this, 1));
		} else if (item.getItemId() == R.id.sort_risk) {
			list.setAdapter(new CustomAdapter(this, 2));
		} else if (item.getItemId() == R.id.sort_checked) {
			list.setAdapter(new CustomAdapter(this, 3));
		} else if (item.getItemId() == R.id.select_all) {
			list.setAdapter(new CustomAdapter(this, 5));
		} else if (item.getItemId() == R.id.delete_checked) {
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setTitle("Confirm");
			builder.setMessage("Are you sure?");
			builder.setPositiveButton("YES",
					new DialogInterface.OnClickListener() {

						public void onClick(DialogInterface dialog, int which) {
							list.setAdapter(new CustomAdapter(c, 4));
							dialog.dismiss();
						}

					});

			builder.setNegativeButton("NO",
					new DialogInterface.OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which) {
							dialog.dismiss();

						}
					});

			AlertDialog alert = builder.create();
			alert.show();

		}
		return true;

	}

}

// Store text of one row data
class SingleRow {
	String title;
	String description;
	int image;

	SingleRow(String title, int image, String description) {
		this.title = title;
	//	this.title = this.title.replace("_", " ");
		this.image = image;
		this.description = description;
	}
}

// declare all the views
class MyViewHolder {
	CheckBox myTitle;
	ImageView myImage;
	TextView myDescription;
	View v;

	public MyViewHolder(View v) {
		// TODO Auto-generated constructor stub
		myImage = (ImageView) v.findViewById(R.id.imageView1);
		myTitle = (CheckBox) v.findViewById(R.id.checkBox1);
		myDescription = (TextView) v.findViewById(R.id.textView1);
		this.v = v;
	}

}

class CustomAdapter extends BaseAdapter {
	ArrayList<SingleRow> list;
	Context context;
	static private String filename = "CheckedPermissions";
	SharedPreferences checkPrefs;
	int sortChoice;

	CustomAdapter(Context c, int sortChoice) {
		this.sortChoice = sortChoice;
		context = c;
		list = new ArrayList<SingleRow>();
		checkPrefs = context.getSharedPreferences(filename, 0);
		// Sort by alphabet, or return to sort alphabet after delete/selectall------------
		if (sortChoice == 1 || sortChoice == 4 || sortChoice == 5) {
			SharedPreferences.Editor editor = checkPrefs.edit();
			for (Permission p : Permission.values()) {
				if (sortChoice == 5) {
					editor.putBoolean(p.toString().replace("_", " "), true);
				}
				if (p.getRating() == Rating.HIGH) {
					list.add(new SingleRow(p.toString(), R.drawable.l5, p
							.getDescription()));
				} else if (p.getRating() == Rating.MEDIUM) {
					list.add(new SingleRow(p.toString(), R.drawable.l3, p
							.getDescription()));

				} else if (p.getRating() == Rating.LOW) {
					list.add(new SingleRow(p.toString(), R.drawable.l2, p
							.getDescription()));

				}
			}
			editor.commit();
			// Sort by Rating risk----------------
		} else if (sortChoice == 2) {
			
			list.add(new SingleRow("11111", R.drawable.l1, "HIGH RISK")); // dummy row to separate High/Medium/Low risk
			for (Permission p : Permission.values()) {
				if (p.getRating() == Rating.HIGH) {
					list.add(new SingleRow(p.toString(), R.drawable.l5, p
							.getDescription()));
				}

			}
			list.add(new SingleRow("11111", R.drawable.l1, "MEDIUM RISK")); 
			for (Permission p : Permission.values()) {
				if (p.getRating() == Rating.MEDIUM) {
					list.add(new SingleRow(p.toString(), R.drawable.l3, p
							.getDescription()));
				}

			}
			list.add(new SingleRow("11111", R.drawable.l1, "LOW RISK"));
			for (Permission p : Permission.values()) {
				if (p.getRating() == Rating.LOW) {
					list.add(new SingleRow(p.toString(), R.drawable.l2, p
							.getDescription()));
				}
			}
			// Sort by user checks----------------------
		} else if (sortChoice == 3) {

			for (Permission p : Permission.values()) {
				int tempImg = 0;
				if (p.getRating() == Rating.LOW)
					tempImg = R.drawable.l2;
				else if (p.getRating() == Rating.MEDIUM)
					tempImg = R.drawable.l3;
				else if (p.getRating() == Rating.HIGH)
					tempImg = R.drawable.l5;

				SingleRow temp = new SingleRow(p.toString(), tempImg,
						p.getDescription());
				if (checkPrefs.getBoolean(temp.title.replace("_", " "), false)) {
					list.add(temp);
				}

			}
			for (Permission p : Permission.values()) {
				int tempImg = 0;
				if (p.getRating() == Rating.LOW)
					tempImg = R.drawable.l2;
				else if (p.getRating() == Rating.MEDIUM)
					tempImg = R.drawable.l3;
				else if (p.getRating() == Rating.HIGH)
					tempImg = R.drawable.l5;

				SingleRow temp = new SingleRow(p.toString(), tempImg,
						p.getDescription());
				if (!checkPrefs.getBoolean(temp.title.replace("_", " "), false)) {
					list.add(temp);
				}

			}
		}
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View row = convertView;
		MyViewHolder holder = null;
		if (row == null) {
			LayoutInflater inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.single_row, parent, false);
			holder = new MyViewHolder(row);
			row.setTag(holder);
		} else {
			holder = (MyViewHolder) row.getTag();
		}

		SingleRow temp = list.get(position);

		holder.myImage.setImageResource(temp.image);
		holder.myTitle.setText(temp.title.replace("_", " "));
		holder.myDescription.setText(temp.description);

		// Print dummy row, hide CheckBox, Image, color Text BLACK
		if (holder.myTitle.getText() == "11111") {
			holder.myImage.setVisibility(View.INVISIBLE);
			holder.myTitle.setVisibility(View.INVISIBLE);
			holder.myDescription.setGravity(1);
			holder.myDescription.setTextSize(20);
			holder.myDescription.setTextColor(Color.WHITE);
			holder.v.setBackgroundResource(R.drawable.risk_background);
			if (holder.myDescription.getText() == "HIGH RISK") {
				holder.v.setBackgroundResource(R.drawable.high_risk);
				holder.myDescription.setBackgroundColor(Color.RED);
			}
			else if (holder.myDescription.getText() == "MEDIUM RISK") {
				holder.v.setBackgroundResource(R.drawable.medium_risk);
				holder.myDescription.setBackgroundColor(Color.parseColor("#FFA500"));
			}
			else if (holder.myDescription.getText() == "LOW RISK") {
				holder.v.setBackgroundResource(R.drawable.low_risk);
				holder.myDescription.setBackgroundColor(Color.GREEN);
			}

		} else {
			holder.myImage.setVisibility(View.VISIBLE);
			holder.myTitle.setVisibility(View.VISIBLE);
			holder.myDescription.setBackgroundColor(Color.parseColor("#E7EAEB"));
			holder.v.setBackgroundResource(R.drawable.rating_top_background);
			holder.myDescription.setTextColor(Color.BLACK);
			holder.myDescription.setTextSize(15);
			holder.myDescription.setGravity(0);
		}

		if (sortChoice == 4) {
			SharedPreferences.Editor editor = checkPrefs.edit();
			editor.clear();
			editor.commit();
		} else
		if (sortChoice == 5) {
			holder.myTitle.setChecked(checkPrefs.getBoolean(temp.title, true));
		} else 	
			holder.myTitle.setChecked(checkPrefs.getBoolean(holder.myTitle.getText().toString(), false));

		

		holder.myTitle
				.setOnCheckedChangeListener(new OnCheckedChangeListener() {
					@Override
					public void onCheckedChanged(CompoundButton buttonView,
							boolean isChecked) {
						SharedPreferences.Editor editor = checkPrefs.edit();
						editor.putBoolean(buttonView.getText().toString(),
								isChecked);
						editor.commit();
					}

				});

		return row;
	}
}
