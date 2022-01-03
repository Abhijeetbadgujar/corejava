package com.xworkz.allmethod;

import java.io.Serializable;

public class TrainsDTO {
	private int tid;
	private int trainNo;
	private int seatNo;
	private int price;
	private String nameboarding;
	private String destination;
	private String trainClass;
	public TrainsDTO(int tid, int trainNo, int seatNo, int price, String nameboarding, String destination,
			String trainClass) {
		super();
		this.tid = tid;
		this.trainNo = trainNo;
		this.seatNo = seatNo;
		this.price = price;
		this.nameboarding = nameboarding;
		this.destination = destination;
		this.trainClass = trainClass;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getNameboarding() {
		return nameboarding;
	}
	public void setNameboarding(String nameboarding) {
		this.nameboarding = nameboarding;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTrainClass() {
		return trainClass;
	}
	public void setTrainClass(String trainClass) {
		this.trainClass = trainClass;
	}
	@Override
	public String toString() {
		return "TrainsDTO [tid=" + tid + ", trainNo=" + trainNo + ", seatNo=" + seatNo + ", price=" + price
				+ ", nameboarding=" + nameboarding + ", destination=" + destination + ", trainClass=" + trainClass
				+ "]";
	}

}