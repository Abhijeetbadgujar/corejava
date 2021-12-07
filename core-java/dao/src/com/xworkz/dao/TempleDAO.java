package com.xworkz.dao;

import com.xworkz.dto.TempleDTO;

public class TempleDAO {

	private TempleDTO[] templeDTO=new TempleDTO[40];
	private int pass=0;
	
	private void tem() {
		System.out.println("Invoked the no-parameterzied constructor");
	}
	public TempleDTO[] gettempleDTO() {
		return templeDTO;
	}
		
	
	public void save(TempleDTO temples) {
	if(this.pass<templeDTO.length && temples!=null) {
		this.templeDTO[this.pass++]=temples;
		System.out.println("invoked save :"+temples.getName()+"   "+temples.getLocation());
	}else {
		System.err.println("index is full");
	}
	}	
}
