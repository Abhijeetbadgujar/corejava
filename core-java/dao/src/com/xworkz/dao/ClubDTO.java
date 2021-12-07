package com.xworkz.dao;

public class ClubDTO {
	
	 private ClubDTO[] clubdto = new ClubDTO[50];
	 private int pass=0;
	 
	 public ClubDTO() {
		 System.out.println("invoked the non-parameterized constructor");
	 }
	 public ClubDTO[] getClubDTO() {
	 return clubdto;
	 }
	 public void save(ClubDTO club) {
		 if(pass<clubdto.length && club!=null) {
			 this.clubdto[this.pass++]=club;
			 System.out.println("invoked the save: "+club.getRating());
		 }
		 else {
			 System.out.println("error ");
		 }
	 }
	 
}
