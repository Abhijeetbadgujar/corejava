package com.xworkz.Festival;

public class Festival {
	
	 public String name;
	 public int nofflower;
	 private String beverages="beer";
	 String date;
	

public Festival() {
	
}
 
  Festival(String name,int noofflower)
	{
		this.name=name;
		this.nofflower=nofflower;
	}
 public void setFestival(String name)
 {
	 this.name=name;
	
 }
 	 String getBeverages()
 	{
 		return this.beverages;
 	}
 	 
}
