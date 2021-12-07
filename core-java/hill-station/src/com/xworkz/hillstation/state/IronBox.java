package com.xworkz.hillstation.state;

public class IronBox {
	private String brand;
	private String type;
	private boolean working;
	private double minTem;
	private double maxTem;

	public IronBox() {
		super();
		System.out.println("invoked the no-arg constructor in IronBox");
	}

	protected IronBox(String brand, String type, boolean working, double minTem, double maxTem) {
		super();
		this.brand = brand;
		this.type = type;
		this.working = working;
		this.minTem = minTem;
		this.maxTem = maxTem;
	}

	public void produceHeat() {
		System.out.println("invoked the produceHeat");
	}
	
	protected void turnOn() {
		System.out.println("invoked the turnON");
	}

	protected void turnOf() {
		System.out.println("invoked the turnOf");
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public boolean isWorking() {
		return working;
	}

	public double getMinTem() {
		return minTem;
	}

	public double getMaxTem() {
		return maxTem;
	}

}
