package com.xworkz.methods.collectionEncapsulted;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArmyDTORunner {

	public static void main(String[] args) {

		ArmyDTO armyDTO=new ArmyDTO("india","blue",29393,34);
		ArmyDTO armyDTO1=new ArmyDTO("south korea","brown",2935393,24);
		ArmyDTO armyDTO2=new ArmyDTO("us","black",2349393,54);
		ArmyDTO armyDTO3=new ArmyDTO("russia","lightwhite",29645393,44);
		
		Set<ArmyDTO> armyDTOs=new HashSet<ArmyDTO>();
		armyDTOs.add(armyDTO3);
		armyDTOs.add(armyDTO2);
		armyDTOs.add(armyDTO1);
		armyDTOs.add(armyDTO);
		
		Iterator<ArmyDTO> iterator=armyDTOs.iterator();
		System.out.println(armyDTOs.size());
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

}
