package com.xworkz.DTO;

public class MilkcanDAO {

	private static final String Teeth = null;
	private MilkcanDTO[] milkcanDTO=new MilkcanDTO[20];
	private int teeth=0;
	
	public MilkcanDAO() {
		// TODO Auto-generated constructor stub
	}
	public void create(MilkcanDTO name) {
		if(teeth<20 && Teeth!=null) {
			MilkcanDTO ref=this.milkcanDTO[this.teeth];
			System.out.println("the quantity: "+ref.getQuality());
		}else {
			System.out.println("index is full");
		}
	}
	public void create(MilkcanDTO name,int no) {
		if(teeth<20 && no<=0 && name!=null) {
			 this.milkcanDTO[no++]=name;
		}else {
			System.out.println("index is full");
		}
	}
	public void indexoccupied() {
		System.out.println("indix is occupied : "+teeth);
	}
	public boolean matchbycolour(String colour) {
		for(int x=0;x<this.milkcanDTO.length;x++) {
			MilkcanDTO res=this.milkcanDTO[x];
			if(res!=null) {
				System.out.println("the index invoked : "+x);
			String result=res.getShape();
			if(colour.equals(result)) {
				System.out.println("matching the value of :"+result);
				return true;
			}
			}
		}
		return false;
	}
	public MilkcanDTO[] getShape() {
	return milkcanDTO;
}
}