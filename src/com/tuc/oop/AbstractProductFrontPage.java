package com.tuc.oop;

public abstract class AbstractProductFrontPage {
	public String title = "";
	public String describtion = "";

	public abstract String getTitle();

	public abstract int getPrice();

	public abstract String getImageUrl();

	public abstract String getSoldText();

	public void printTitle() {
		System.out.println(this.title);
		
	}
	public void printDesc() {
		System.out.println(this.describtion);
	}
}
