package com.xworkz.DTO;

public class DoctorDAO {
	private DoctorDAO[] doctorDAOs = new DoctorDAO[30];
	private int paste = 0;

	public DoctorDAO() {
		// TODO Auto-generated constructor stub
	}

	public void create(DoctorDAO name) {
		if (paste < this.doctorDAOs.length && name != null) {
			this.doctorDAOs[paste++] = name;
			System.out.println("the create method" + name);
			System.out.println("doctor qualification in create :" + name.getSpecilization());
		} else {
			System.out.println("index is full");
		}
	}

	public void create(DoctorDAO name, int no) {
		if (paste < 30 && name != null && no >= 0) {
			this.doctorDAOs[no++] = name;
			System.out.println("the update method" + name);
			System.out.println("the update index: ".concat(String.valueOf(no)));
		} else {
			System.err.println("the index is full");
		}
	}

	public void indexOccupied() {
		System.out.println(" the index is occupied :" + paste);
	}

	public boolean matchbyname(String name) {
		for (int x = 0; x < this.doctorDAOs.length; x++) {
			DoctorDAO ref = this.doctorDAOs[x];
			if (ref != null) {
				System.out.println("the index is match : " + x);
				String ref1=ref.getSpecilization();
				if(name.equals(ref1)) {
					System.out.println("team name is found");
					return true;
			}
		}
	}
		return false;
	}
	private String getSpecilization() {
		// TODO Auto-generated method stub
		return null;
	}
}
