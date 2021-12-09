package com.xworkz.methods.collectionEncapsulted;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ChocalateDTORunner {

	public static void main(String[] args) {

		ChocalateDTO chocalateDTO=new ChocalateDTO("kaccha mango","green","good", 49);
		ChocalateDTO chocalateDTO1=new ChocalateDTO("kccha mang","gree","goo", 49);
		ChocalateDTO chocalateDTO2=new ChocalateDTO("accha mango","gren","god", 49);
		ChocalateDTO chocalateDTO3=new ChocalateDTO("kccha mango","geen","ood", 49);
	
		Set<ChocalateDTO> chocalateDTOs=new HashSet<ChocalateDTO>();
		chocalateDTOs.add(chocalateDTO3);
		chocalateDTOs.add(chocalateDTO2);
		chocalateDTOs.add(chocalateDTO1);
		chocalateDTOs.add(chocalateDTO);
		Iterator<ChocalateDTO> iterator=chocalateDTOs.iterator();
		System.out.println(chocalateDTOs.size());
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

}
}