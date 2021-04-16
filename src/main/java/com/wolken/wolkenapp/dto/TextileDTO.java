package com.wolken.wolkenapp.dto;

import org.springframework.stereotype.Component;

public class TextileDTO {
	@Override
	public String toString() {
		return "TextileDTO [textileShopID=" + textileShopID + ", textileShopName=" + textileShopName + ", location="
				+ location + ", noOfFloors=" + noOfFloors + "]";
	}
	private int textileShopID;
	public int getTextileShopID() {
		return textileShopID;
	}
	public void setTextileShopID(int textileShopID) {
		this.textileShopID = textileShopID;
	}
	public String getTextileShopName() {
		return textileShopName;
	}
	public void setTextileShopName(String textileShopName) {
		this.textileShopName = textileShopName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfFloors() {
		return noOfFloors;
	}
	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	private String textileShopName;
	private String location;
	private int noOfFloors;

}
