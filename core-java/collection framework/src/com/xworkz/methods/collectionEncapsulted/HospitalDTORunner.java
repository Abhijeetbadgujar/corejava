package com.xworkz.methods.collectionEncapsulted;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HospitalDTORunner {

	public static void main(String[] args) {

		HospitalDTO hospitalDTO=new HospitalDTO("duut","aubad",600,3);
		HospitalDTO hospitalDTO1=new HospitalDTO("erruu","auba",60,3);
		HospitalDTO hospitalDTO2=new HospitalDTO("dut","aubd",00,3);
		HospitalDTO hospitalDTO3=new HospitalDTO("duuut","ubad",600,3);
		
		Set<HospitalDTO> hospitalDTOs=new HashSet<HospitalDTO>();
		hospitalDTOs.add(hospitalDTO3);
		hospitalDTOs.add(hospitalDTO2);
		hospitalDTOs.add(hospitalDTO1);
		hospitalDTOs.add(hospitalDTO);
		
		Iterator<HospitalDTO> iterator=hospitalDTOs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(hospitalDTOs.size());
	}

}
