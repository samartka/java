package com.tuc.oop;

final public class topProduct extends AbstractProductFrontPage {
	public int price = 100;	
	public String imgUrl = "https://qwrt.com/asdf.png";
	public String soldText = "150 pcs. was sold";
	final float vat = 0.07f;
	public ProductStatus.Status status = ProductStatus.Status.ACTIVE;
	public ProductStatus.priceStatus priceStatus = ProductStatus.priceStatus.NORMAL;
	
	

	public topProduct() {
		this.title = "IPAD AIR";
		this.describtion = "IPAD AIR 2021 version";		
	}
	
	public static void main(String[] args) {
		topProduct ipad = new topProduct();
		System.out.println(ipad.getTitle());
		System.out.println(ipad.getPrice());
		System.out.println(ipad.status);
		System.out.println(ipad.priceStatus);
	}
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return this.title;
	}

	@Override
	final public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String getImageUrl() {
		// TODO Auto-generated method stub
		return this.imgUrl;
	}

	@Override
	public String getSoldText() {
		// TODO Auto-generated method stub
		return soldText;
	}

}
