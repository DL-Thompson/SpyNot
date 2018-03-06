package com.example.spynotfinal;

public enum Category {
	COMICS, COMMUNICATIONS, FINANCE, HEALTH_AND_FITNESS, MEDICAL,
	LIFESTYLE, MEDIA_AND_VIDEO, MUSIC_AND_AUDIO, PHOTOGRAPHY,
	NEWS_AND_MAGAZINES, WEATHER, PRODUCTIVITY, BUSINESS, BOOKS_AND_REFERENCE,
	EDUCATION, SHOPPING, SOCIAL, SPORTS, PERSONALIZATION, TOOLS, TRAVEL_AND_LOCAL,
	LIBRARIES_AND_DEMO, GAMES;

	@Override
	public String toString() {
		String value;
		switch (this) {
		case COMICS:
			value = "Comics";
			break;
		case COMMUNICATIONS:
			value = "Communications";
			break;
		case FINANCE:
			value = "Finance";
			break;
		case HEALTH_AND_FITNESS:
			value = "Health and Fitness";
			break;
		case MEDICAL:
			value = "Medical";
			break;
		case LIFESTYLE:
			value = "Lifestyle";
			break;
		case MEDIA_AND_VIDEO:
			value = "Media and Video";
			break;
		case MUSIC_AND_AUDIO:
			value = "Music and Audio";
			break;
		case PHOTOGRAPHY:
			value = "Photography";
			break;
		case NEWS_AND_MAGAZINES:
			value = "News and Magazines";
			break;
		case WEATHER:
			value = "Weather";
			break;
		case PRODUCTIVITY:
			value = "Productivity";
			break;
		case BUSINESS:
			value = "Business";
			break;
		case BOOKS_AND_REFERENCE:
			value = "Books and Reference";
			break;
		case EDUCATION:
			value = "Education";
			break;
		case SHOPPING:
			value = "Shopping";
			break;
		case SOCIAL:
			value = "Social";
			break;
		case SPORTS:
			value = "Sports";
			break;
		case PERSONALIZATION:
			value = "Personalization";
			break;
		case TOOLS:
			value = "Tools";
			break;
		case TRAVEL_AND_LOCAL:
			value = "Travel and Local";
			break;
		case LIBRARIES_AND_DEMO:
			value = "Libraries and Demos";
			break;
		case GAMES:
			value = "Games";
			break;
		default:
			value = "";
			break;
		}
		return value;
	}
	
	
}
