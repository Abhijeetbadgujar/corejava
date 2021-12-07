package com.xworkz.Stater;

import com.xworkz.DTO.CircusDTO;
import com.xworkz.DTO.TimerDAO;
import com.xworkz.DTO.TimerDTO;

public class TimerTester {

	public static void main(String[] args) {

		TimerDTO timerDTO = new TimerDTO("4hrs", 12, "touch Screen", "leather", "rollex");
		TimerDTO timerDTO1 = new TimerDTO("5hrs", 14, "touch Screen", "plastic", "rollex");
		TimerDTO timerDTO2 = new TimerDTO("6hrs", 16, "touch Screen", "leather", "rollex");

		TimerDAO timer = new TimerDAO();
		timer.create(timerDTO);
		
		timer.create(new TimerDTO("5hrs",24,"touch sensor","plastic","taitan"));
		timer.IndexOccupied();
		timer.matchBydigital("34hrs");
		
		TimerDTO[] array=timer.getDigital();
		for(int arr=0;arr<array.length;arr++) {
			TimerDTO a=array[arr];
			if(a!=null) {
				System.out.println("name of owner: ".concat(String.valueOf(a.getCorrectTime())));
				System.out.println("duartion of circus: "+a.getBrand());
				System.out.println("int of price:".concat(String.valueOf(a.getWorking())));
			}
		}

	}
}
