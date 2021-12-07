package com.xworkz.extend.shop;

public class Factory extends Object{
	private String name;
	private int since;
	private String location;
	private String product;
	private int timing;
	
	public Factory() {
		this(1993);
	}

	public Factory(int since) {
		//super();
		this.since = since;
		System.out.println("invoked the Factory since");
		System.out.println("factory since: "+since);
	}
	
}
