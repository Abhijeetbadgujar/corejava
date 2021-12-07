package com.xworkz.Stater;

import com.xworkz.DTO.CircusDAO;
import com.xworkz.DTO.CircusDTO;

public class CircusStater {

	public static void main(String[] args) {
		CircusDTO circus=new CircusDTO("gomu",1300,4,5,"2HRS");
		CircusDTO circus1=new CircusDTO("sachin",1500,4,5,"1HRS");
		CircusDTO circus2=new CircusDTO("mahesh",1200,4,5,"4HRS");
		
		CircusDAO cir=new CircusDAO();
		cir.create(circus);
		
		cir.create(new CircusDTO("pappu", 300, 1, 2,"2HRS"),3);
		cir.IndexOccupied();
		cir.matchByowner("3HRS");
		
		CircusDTO[]	array=cir.getDuation();
		for(int arr=0;arr<array.length;arr++) {
			CircusDTO a=array[arr];
			if(a!=null) {
				System.out.println("name of owner: ".concat(String.valueOf(a.getOwner())));
				System.out.println("duartion of circus: "+a.getDuration());
				System.out.println("int of price:".concat(String.valueOf(a.getTiketPrice())));
			}
		}
		
	}

}
