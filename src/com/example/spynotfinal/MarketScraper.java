package com.example.spynotfinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.util.Log;

public class MarketScraper {
	
	private static final String TAG = "MarketScraper";
	private ArrayList<String> html = new ArrayList<String>();
	private String url;
	
	private String numRatings;
	private String avgScore;
	private String installCount;
	private String category;
	private boolean topDeveloper;
	private String star5, star4, star3, star2, star1;
	
	public MarketScraper(String packageName) throws IOException {
		this.url = "https://play.google.com/store/apps/details?id=" + packageName;
		retrieveData();	
	}
	
	private void retrieveData() throws IOException{
		//Connects to the android market and scrapes the following data
		//Number of Ratings, Average Rating, Number of Downloads, and
		//App Category
		try {
			//Make the connection to the market and gets the page
			Log.d(TAG, "Opening URL: " + this.url);
			HttpClient client = new DefaultHttpClient();
			HttpGet request = new HttpGet(url);
			HttpResponse response = client.execute(request);
			
			//Cycles through the page and scrapes the needed data
			InputStream in = response.getEntity().getContent();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] lines = line.split("</div>");
				for (int i = 0; i < lines.length; i++) {
					html.add(lines[i]);
					
					//Number of Downloads
					if (lines[i].contains("numDownloads"))
						installCount = lines[i].substring(46).trim();
					
					//Total number of ratings
					if (lines[i].contains("reviewers-small") && lines[i].contains("reviews-stats"))
					{
						numRatings = lines[i].substring(93);
						numRatings = numRatings.substring(0, numRatings.length()-14).trim();
					}
					
					//Average Rating Score
					if (lines[i].contains("class=\"score\""))
						avgScore = lines[i].substring(lines[i].length()-3).trim();
					
					//App Category
					if (lines[i].contains("itemprop=\"genre\""))
					{
						category = lines[i].substring(73).trim();
						for (int j = 0; j < category.length(); j++) {
							if (category.charAt(j) == '"') {
								
								category = category.substring(0, j).trim();
							}
						}
					}
					//number of 1-5 star ratings
					if (lines[i].contains("rating-bar-container five")) {
						star5 = stripStarRating(star5, lines[i]);
					}
					if (lines[i].contains("rating-bar-container four")) {
						star4 = stripStarRating(star4, lines[i]);
					}
					if (lines[i].contains("rating-bar-container three")) {
						star3 = stripStarRating(star3, lines[i]);
					}
					if (lines[i].contains("rating-bar-container two")) {
						star2 = stripStarRating(star2, lines[i]);
					}
					if (lines[i].contains("rating-bar-container one")) {
						star1 = stripStarRating(star1, lines[i]);
					}
					//save if the app is a top developer
					if (lines[i].contains("Top Developer")) {
						topDeveloper = true;
					}
				}
			}
			in.close();
			
		} 
		catch (ClientProtocolException e) {
			Log.e(TAG, "ClientProtocolException thrown. Scraper not loaded.");
		} 
	}
	

	
	public int getRatings() {
		//Converts the Rating from String to int
		return Integer.parseInt(stripComma(numRatings));
	}
	

	
	public double getScore() {
		//Convert Average Score from string to double
		return Double.parseDouble(avgScore);
	}
	
	public int getCount() {
		//Download counts are stored as # - #, such as between 1 - 100
		//The first number is the minimum, so it has definitely been reached
		//The second number is just an upper bound, so it isn't exact
		//The first number is removed from the string and converted to an int
		StringBuilder tmp = new StringBuilder();
		for (int i = 0; i < installCount.length(); i++) {
			char c = installCount.charAt(i);
			if (c == ' ')
				break;
			else if (c == ',')
				continue;
			tmp.append(c);
		}
		return Integer.parseInt(tmp.toString());
	}
	
	public String getCategory() {
		//Makes sure the category is in all upper case
		return category.toUpperCase();
	}
	
	private void logData() {
		Log.d(TAG, "MarketScraper HTML Size: " + html.size());
		for (int i = 0; i < html.size(); i++) {
			Log.d(TAG, "MarketScraper: HTML Line: " + html.get(i));
		}
		Log.d(TAG, "MarketScraper: Count: " + installCount);
		Log.d(TAG, "MarketScraper: Ratings: " + numRatings);
		Log.d(TAG, "MarketScraper: Score: " + avgScore);
		Log.d(TAG, "MarketScraper: Category: " + category);
	}
	
	public int get5Star() {
		//returns the number of 5 star ratings
		return Integer.parseInt(stripComma(star5));
	}
	
	public int get4Star() {
		//returns the number of 4 star ratings
		return Integer.parseInt(stripComma(star4));
	}
	
	public int get3Star() {
		//returns the number of 3 star ratings
		return Integer.parseInt(stripComma(star3));
	}
	
	public int get2Star() {
		//returns the number of 2 star ratings
		return Integer.parseInt(stripComma(star2));
	}
	
	public int get1Star() {
		//returns the number of 1 star ratings
		return Integer.parseInt(stripComma(star1));
	}
	
	public boolean getTopDeveloper() {
		return topDeveloper;
	}
	
	private String stripStarRating(String star, String line) { 
		//Strips the star rating number from a html line
		star = line.substring(0,line.length()-8);
		for (int j = star.length()-1; j > 0; j--) {
			if (star.charAt(j) == '>') {
				star = star.substring(j+1, star.length());
				break;
			}
		}
		return star;
	}

	private String stripComma(String s) {
		//strips comma from a string
		StringBuilder tmp = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ',')
				continue;
			tmp.append(c);
		}
		return tmp.toString();
	}
}
