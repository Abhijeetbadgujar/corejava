package com.xworkz.dao;

import com.xworkz.dto.CameraDTO;

public class CameraDAO {

	private CameraDTO[] cameraDTO=new CameraDTO[50];
	private int delta=0;
	
	public CameraDAO() {
		System.out.println("invoked non-parameterized constructor");
	}
	public CameraDTO[] getCameraDTOs() {
		return cameraDTO;
	}
	public void save(CameraDTO camera) {
		if(this.delta<50 && camera!=null) {
			this.cameraDTO[this.delta]=camera;
			System.out.println("Invoked company"+camera.getCompany());
			System.out.println("Invoked camera type: "+camera.getType());
		}
		else {
			System.err.println("index is full");
		}
	}
}
