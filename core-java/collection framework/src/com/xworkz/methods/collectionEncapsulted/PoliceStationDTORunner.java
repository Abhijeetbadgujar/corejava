package com.xworkz.methods.collectionEncapsulted;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PoliceStationDTORunner {

	public static void main(String[] args) {

	PolicStationDTO policStationDTO=new PolicStationDTO("BTM","BTM","civil",12);
	PolicStationDTO policStationDTO1=new PolicStationDTO("marathalli","BTM","crime",152);
	PolicStationDTO policStationDTO2=new PolicStationDTO("patanjali","BTM","enjoy",122);
	PolicStationDTO policStationDTO3=new PolicStationDTO("jay nagar","BTM","black",14);
		
	Set<PolicStationDTO> set=new HashSet<PolicStationDTO>();
	set.add(policStationDTO);
	set.add(policStationDTO3);
	set.add(policStationDTO2);
	set.add(policStationDTO1);
	System.out.println(set.size());
	Iterator<PolicStationDTO> iterator=set.iterator();
	//iterator.hasNext();
	//System.out.println(iterator.next());

	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	}
}
