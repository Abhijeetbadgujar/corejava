package com.xworkz.dao;

import com.xworkz.dto.ApplicationDTO;
import com.xworkz.dto.FaceBookDTO;
import com.xworkz.dto.InstagramDTO;

public class ApplicationDAO {

	private ApplicationDTO[] applicationDTO = new ApplicationDTO[10];
	private FaceBookDTO[] faceBookDTOs = new FaceBookDTO[5];
	private InstagramDTO[] instagramDTOs = new InstagramDTO[5];
	private int tea = 0;

	public void save(ApplicationDTO dto) {
		if (tea < this.applicationDTO.length && dto != null) {
			this.applicationDTO[tea] = dto;
			System.out.println("Application name : " + dto.getName());
		} else {
			System.err.println("Application name is not save");
		}
	}

	public void DisplayAllAplicationDTO() {
		for (int d = 0; d < 10; d++) {
			ApplicationDTO ref = this.applicationDTO[d];
			if (ref != null) {
				System.out.println("invoked the display all application ");
				System.out.println(ref.getName());
				System.out.println(ref.getFounder());
				System.out.println(ref.getCompany());
				System.out.println("``````````````````````````````");
			} else {
				System.err.println("display is not shown");
			}
		}
	}

	public String getApplicationDTOByName(String name) {
		System.out.println("invoked the application by name");
		for (int i = 0; i < this.applicationDTO.length; i++) {
			ApplicationDTO ref1 = this.applicationDTO[i];
			if (ref1 != null) {

				String ref2 = ref1.getName();
				if (ref2.equals(name)) {
					System.out.println(ref1.getName());
					return ref1.getName();
				}
			}
		}
		return " Application name error";
	}

	public void display() {
		FaceBookDTO[] bookDTO = (FaceBookDTO[]) applicationDTO;
		for (int i = 0; i < faceBookDTOs.length; i++) {
			FaceBookDTO bookDTO2 = this.faceBookDTOs[6];
			if (bookDTO2 != null) {
				System.out.println("facebook ceo:" + bookDTO2.getCeoName());
				System.out.println("facebook founder:" + bookDTO2.getFounder());
			} else {
				System.out.println("face book index is full");

			}
		}
	}

	public FaceBookDTO[] getFaceBookApplicationDTOs() {
		return faceBookDTOs;
	}

	public InstagramDTO[] getInstagramDTOs() {
		return instagramDTOs;
	}

	public ApplicationDTO[] getApplicationDTOs() {
		return applicationDTO;
	}

}
