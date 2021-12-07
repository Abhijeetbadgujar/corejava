package com.xworkz.dao;

import com.xworkz.dto.BucketDTO;

public class BucketDAO {
	private BucketDTO[] bucketdto=new BucketDTO[5];
	private int b=0;
	private int index;
	
public BucketDTO[] getBucketdto() {
	return bucketdto;
}
	
	public void save(BucketDTO dto) {
		if(this.b<this.bucketdto.length && dto!=null) {
			this.bucketdto[this.b]=dto;
			System.out.println("create method :"+dto);
		}
		else {
			System.out.println("create method invoked");
		}
	}
	
	public void delete(int index) {
		if(this.index<this.bucketdto.length && index>=0) {
			this.bucketdto[this.index]=null;
			System.out.println("delete method invoked:".concat(String.valueOf(index)));
		}else {
			System.out.println("delete method error");
		}	
	}
	
	public void update(int index,String name) {
		if(index<this.bucketdto.length && name!=null) {
			this.bucketdto[index]=null;
			System.out.println("update method :".concat(String.valueOf(index)));
		}else {
			System.out.println("update method");
		}
	}

	public BucketDTO[] getBucketdto1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
