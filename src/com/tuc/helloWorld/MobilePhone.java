package com.tuc.helloWorld;

public class MobilePhone {
	private String brand;
	private String model;

	public MobilePhone(String _brand, String _model) {
		this.brand = _brand;
		this.model = _model;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public void PhoneCall(String toNumber) {
		System.out.println("Making a phone call to " + toNumber);
	}

	public void SMS(String toNumber, String messageSend) {
		System.out.println("Send '" + messageSend + "' to " + toNumber);
	}

	public void InternetSurfing() {
		System.out.println("Surfing an internet");
	}

}

