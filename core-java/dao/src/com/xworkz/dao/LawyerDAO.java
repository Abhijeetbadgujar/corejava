package com.xworkz.dao;

import com.xworkz.dto.LawyerDTO;

public class LawyerDAO {

	private LawyerDTO[] lawyerDTO = new LawyerDTO[6];
	private int rice = 0;
	private String name;
	//save the same 
	public void save(LawyerDTO dto) {
		if (this.rice < this.lawyerDTO.length && dto != null) {
			this.lawyerDTO[this.rice] = dto;
			System.out.println("the lawyer name is :" + dto.getName());
		} else {
			System.out.println("index is full");
		}
	}
	// delete the name or not pointing any address
	public void delete(int index) {
		if (this.rice < this.lawyerDTO.length) {
			this.lawyerDTO[index++] = null;
			System.out.println("invoked the delete no: ".concat(String.valueOf(index)));
		}
	}
	//seaching the name with in the index 
	public boolean searchByName(String name) {
		System.out.println("invoked the search name");
		for (int x = 0; x < this.lawyerDTO.length; x++) {
			LawyerDTO ref = this.lawyerDTO[x];
			if (ref != null) {
				String ref1 = ref.getName();
				System.out.println("selecting the name:" + ref1);
				if (ref1.equals(name)) {
					System.out.println("name found " + ref1);
					return true;
				} else {
					System.out.println("name is not found");
				}

			}
		}
		return false;
	}
	// check the index num with in the index if it same it show true while false
	public boolean searchByCasesWon(int index) {
		System.out.println("invoked the search index");
		for (int w = 0; w < this.lawyerDTO.length; w++) {
			LawyerDTO ref3 = this.lawyerDTO[index];
			if (ref3 != null) {
				int ref4 = ref3.getCaseWon();
				// System.out.println("number the cases won :" + ref4);
				if (ref4 == (index)) {
					System.out.println("number of cases won: " + ref4);
					return true;
				} else {
					System.err.println("no cases won");
				}
			}

		}

		return false;
	}
	// create the name and index 
	public void save(LawyerDTO dto, int index) {
		if (this.rice < this.lawyerDTO.length && index >= 0 && dto != null) {
			this.lawyerDTO[index] = dto;
			System.out.println("the gender is" + dto.getGender() + " as to index is " + index);
		} else {
			System.out.println("index and dto are not pointing ");
		}
	}
	
	// In num check the layer experience
	
	/*public int getLawyerWithMaxExperience() {
		for(int i=0;i<lawyerDTO.length;i++) {
		LawyerDTO ref=lawyerDTO[i];
		if(ref!=null) {
			int temp=ref.getExperience();
			//if(temp!=null) {
				System.out.println("143");
				
			}
		}
		}
	}*/
	//
	public String getQualiicationByName(String name) {
		for (int i = 0; i < lawyerDTO.length; i++) {
			LawyerDTO ref = this.lawyerDTO[i];
			if (ref != null) {
				String tName = ref.getName();
				if (tName.equals(name)) {
					return ref.getQualification();
				}
					
			}
		}
		return "qualification not found";
	}

	public String getExperienceByName(String name) {
		for(int i = 0;i<lawyerDTO.length;i++) {
			LawyerDTO ref=this.lawyerDTO[i];
			if(ref!=null) {
				String tName=ref.getName();
				if(tName!=null) {
					System.out.println("experience :");
					return String.valueOf(ref.getExperience());
				}
			}
		}
		return "experience not found";
	}

	public LawyerDTO[] getLawyerDTO() {
		return lawyerDTO;
	}

}
