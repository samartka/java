package com.tuc.helloWorld;

public class IphoneX extends MobilePhone {

	public IphoneX(String _brand, String _model) {
		super("Apple", "IPhoneX");
	}
	public void AppStore() {
		System.out.println("Using App store");
	}
	public void FaceID() {
		System.out.println("Using Face ID");
	}

}
