package com.xworkz.access;

public class BeachOperator {
	
	private String country;//=new String();
	private String[] beachName=new String[5];
	//private int noOfBeach;
	private int counter=0;
	
	public BeachOperator() {
		this("india");
		//this(40);
		System.out.println("invoked BeachOperator no-arg constuctor");
	}
	
	public BeachOperator(String country) {
		this.country=country;
		System.out.println("invoked BeachOperator String constructor");
		}
	/*public BeachOperator(int noOfBeach) {
		this.noOfBeach=noOfBeach;
		System.out.println("invoked noofBeach");
	}*/
	public String getCountry() {
		return country;
	}
	public void addBeachName(String name) {
		System.out.println("invoked addBeachName");
		System.out.println("invoked arg:".concat(name));
		if(this.counter<5) {
			this.beachName[this.counter]=name;
			this.counter++;
		}
		
	}
		public void displayBeachName() {
			/*Multiple markers at this line
	- void[] is an invalid type
	- Illegal modifier for parameter displayBeachName; only final is permitted
	- Syntax error, insert "[ ]" to complete Dimension
	- Syntax error on token "displayBeachName", AnnotationName expected after 
	 this token*/
			System.out.println("inkoved displayDetails");
			for(int x=0;x<this.beachName.length;x++) {
			String ref1=this.beachName[x];
			System.out.println(ref1);
			}
		}
	}


