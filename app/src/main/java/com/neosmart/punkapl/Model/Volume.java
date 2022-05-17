package com.neosmart.punkapl.Model;



public class Volume{
	private int value;
	private String unit;
	public Volume(int value, String unit) {
		this.value = value;
		this.unit = unit;
	}
	public Volume() {
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Volume [value=");
		builder.append(value);
		builder.append(", unit=");
		builder.append(unit);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
