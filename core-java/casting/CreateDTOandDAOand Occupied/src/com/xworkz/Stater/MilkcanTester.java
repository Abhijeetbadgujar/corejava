package com.xworkz.Stater;

import com.xworkz.DTO.MilkcanDAO;
import com.xworkz.DTO.MilkcanDTO;

public class MilkcanTester {

	public static void main(String[] args) {
		MilkcanDTO milk1 = new MilkcanDTO(200, "rightangle", 180, "blue", 45);
		MilkcanDTO milk2 = new MilkcanDTO(250, "cylinder", 180, "blue", 45);
		MilkcanDTO milk3 = new MilkcanDTO(280, "circle", 180, "blue", 45);

		MilkcanDAO milk = new MilkcanDAO();
		milk.create(new MilkcanDTO(280, "circle", 180, "blue", 46));
		milk.indexoccupied();
		milk.matchbycolour("black");

		MilkcanDTO[] array = milk.getShape();
		for (int arr = 0; arr < array.length; arr++) {
			MilkcanDTO a = array[arr];
			if(a!=null) {
				System.out.println("milkcan quantity: ".concat(String.valueOf(a.getQuality())));
				System.out.println("milkcan price : "+a.getPrice());
				System.out.println("milkcan shape:".concat(String.valueOf(a.getShape())));
				
			}

		}
	}

}
