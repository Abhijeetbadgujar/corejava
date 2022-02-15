package com.xworkz.beans;

public class Laptop {

	private Camera camera;
	private String store;
	private String retriving;
	public Laptop(String retriving) {
		//System.out.println(this.getClass().getSimpleName().concat("invoked the laptop constructor"));
		this.retriving=retriving;
		System.out.println(retriving);
	}
	public void clickPhoto() {
		System.out.println("invoked the clickPhoto");
	}
	public void setStore(String store) {
		this.store = store;
		System.out.println(store);
	}
	public String getStore() {
		return store;
	}
	public void setCamera(Camera camera) {
		this.camera = camera;
	}
}
