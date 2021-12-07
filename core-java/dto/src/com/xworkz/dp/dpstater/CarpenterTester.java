package com.xworkz.dp.dpstater;

import com.xworkz.dp.Carpenter;

public class CarpenterTester {

	public static void main(String[] args) {
		
		Carpenter carpenter=new Carpenter();;
		carpenter.setDegree("Engineer");
		carpenter.setExperance("20,year");
		carpenter.setMadeThings("door");
		carpenter.setName("pappu");
		carpenter.setPrice(6000);
		carpenter.setRatting(3);
		carpenter.setTrust(true);
		
		Carpenter carpenter1=new Carpenter("ramu","4 year","nothing","bed",4,6500,false);
		Carpenter carpenter2=new Carpenter("gimmy","6 year","pesedent","box",4,6500,true);
		Carpenter carpenter3=new Carpenter("rakesh","7 year","Doctor","caburd",4,6500,false);
		Carpenter carpenter4=new Carpenter("chotu","8 year","PDF","counter",4,6500,true);
		Carpenter carpenter5=new Carpenter("gampu","2 year","IIT","dianning table ",4,6500,false);
		Carpenter carpenter6=new Carpenter("rahul","3 year","12ve","t-poy",4,6500,true);
		Carpenter carpenter7=new Carpenter("raj","14 year","bcom","bed",4,6500,false);
		
		Carpenter[] ref=new Carpenter[7];
		ref[0]=carpenter1;
		ref[1]=carpenter2;
		ref[2]=carpenter3;
		//ref[3]=carpenter4;
		ref[4]=carpenter5;
		ref[5]=carpenter6;
		ref[6]=carpenter7;
		for(int i=0;i<ref.length;i++) {
		Carpenter result=ref[i];
		if(result!=null) {
			System.out.println("Carpenter name: "+result.getName()+"  "+"degree : "+result.getDegree());
		}
		else {
			System.err.println("invoked by null");
		}
		}
	}

}
