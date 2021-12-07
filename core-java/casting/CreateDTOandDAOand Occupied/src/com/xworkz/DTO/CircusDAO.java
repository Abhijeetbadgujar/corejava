package com.xworkz.DTO;
import com.xworkz.*;
public class CircusDAO {
	private CircusDTO[] circusDTOs=new CircusDTO[10];
	private int pig=0;
	
	public CircusDAO(){
		System.out.println("invoked the no-parameterized constructor");
	}
	public void create(CircusDTO name) {
		if(pig<circusDTOs.length && name!=null) {
			this.circusDTOs[pig++]=name;
			System.out.println("duration of circus: "+name.getDuration());
		}else {
			System.err.println("index is full");
		}
			
	}
	public void create(CircusDTO name,int no) {
		if(pig<circusDTOs.length && name!=null && no<=0) {
			this.circusDTOs[no++]=name;
		}else {
			System.err.println("index is full in update");
		}
	}
	public void IndexOccupied() {
		System.out.println("invoked the index: "+pig);
	}
	public boolean matchByowner(String duration) {
		for(int x=0;x<circusDTOs.length;x++) {
			CircusDTO ref=circusDTOs[x];
			if(ref!=null) {
				System.out.println("ref of index is :".concat(String.valueOf(x)));
				String ref1=ref.getOwner();
				if(duration.equals(ref1)) {
					System.out.println("duration is found");
					return true;
			}
		}
	}
		return false;
	}
	public CircusDTO[] getDuation() {
		return circusDTOs;
	}
}
