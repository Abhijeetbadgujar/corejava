package com.xworkz.dto;

import com.xworkz.dto.ApplicationDTO;

public class FaceBookDTO extends ApplicationDTO{
	private String ceoName;
	private String headQuater;
	
	public FaceBookDTO(String name, String company, String version, String founder, String ceoName, String headQuater) {
		super(name, company, version, founder);
		ceoName = ceoName;
		headQuater = headQuater;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		ceoName = ceoName;
	}

	public String getHeadQuater() {
		return headQuater;
	}

	public void setHeadQuater(String headQuater) {
		headQuater = headQuater;
	}
	
}
