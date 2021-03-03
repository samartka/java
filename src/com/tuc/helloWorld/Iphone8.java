package com.tuc.helloWorld;

public class Iphone8 extends MobilePhone {

	public Iphone8(String _brand, String _model) {
		super("APPLE", "IPhone 8");
	}
	public void AppStore() {
		System.out.println("Using App store");
	}
	public void TouchID() {
		System.out.println("Using Touch ID");
	}
}
