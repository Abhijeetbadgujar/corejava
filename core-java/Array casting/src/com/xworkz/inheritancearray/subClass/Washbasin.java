package com.xworkz.inheritancearray.subClass;

public class Washbasin extends Sink{
	public int noOfSink=5;
	
	public Washbasin() {
		this(6);
		System.out.println("invoked the no-arg constructor in washbasin");
	}
	public Washbasin(int noOfSink) {
		System.out.println(super.brand);
		System.out.println(super.gallery);
		System.out.println(super.styles);
		System.out.println(noOfSink);
	}
	
}
