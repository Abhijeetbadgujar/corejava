package com.xworkz.dao;

import com.xworkz.dto.MetroStationDTO;


public class MetroStationDAO {
	
		private MetroStationDTO[] metroStationDTOs=new MetroStationDTO[50];
		private int x=0;
		
		public MetroStationDAO() {
			//System.out.println("invoked the no-parameterized DAOconstructor");
		}
		public MetroStationDTO[] getMetroStationDTOs() {
			return metroStationDTOs;
		}
		public void save(MetroStationDTO seires1) {
			if(x<metroStationDTOs.length && seires1!=null) {
				this.metroStationDTOs[this.x++]=seires1;
				System.out.println(" name of series is ".concat(seires1.getName()).concat(" we invoked"));
				
			}
			else{
				System.out.println("invoked the full index or not passing the argument");
			}
		}
		
}
