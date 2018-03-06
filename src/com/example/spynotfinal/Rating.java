package com.example.spynotfinal;

public enum Rating {
	HIGH, MEDIUM, LOW;

	@Override
	public String toString() {
		String value;
		
		switch (this) {
		case HIGH:
			value = "HIGH";
			break;
		case MEDIUM:
			value = "MEDIUM";
			break;
		case LOW:
			value = "LOW";
			break;
		default:
			value = null;
			break;
		}
		return value;
	}
	
	
}
