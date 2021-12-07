package com.xworkz.dp.dpstater;

import com.xworkz.dp.BusDriver;

public class BusDriverStater {

	public static void main(String[] args) {
		
		BusDriver busDriver=new BusDriver();
		busDriver.setName("pankaj");
		busDriver.setBusColour("yellow");
		busDriver.setExperience("3 year");
		busDriver.setLicense(true);
		busDriver.setTypeOfBus("tampotrival");
		busDriver.setTypeOfDriver("school");
		busDriver.setPermitted(false);
		
		BusDriver busDriver1=new BusDriver("kumar","truck","transpoter","red","5 year",true,false);
		BusDriver busDriver2=new BusDriver("pandit","truck","transpoter","red","5 year",true,false);
		BusDriver busDriver3=new BusDriver("paji","truck","transpoter","red","5 year",true,false);
		BusDriver busDriver4=new BusDriver("chigam","truck","transpoter","red","5 year",true,false);
		BusDriver busDriver5=new BusDriver("tappu","truck","transpoter","red","5 year",true,false);
		BusDriver busDriver6=new BusDriver("taimur","tampo","transpoter","red","5 year",true,false);
		BusDriver busDriver7=new BusDriver("subod","minibus","transpoter","red","5 year",true,false);
		
		BusDriver[] ref=new BusDriver[7];
		ref[0]=busDriver1;
		ref[1]=busDriver2;
		ref[2]=busDriver3;
		//ref[3]=busDriver4;
		ref[4]=busDriver5;
		ref[5]=busDriver6;
		ref[6]=busDriver7;
		for(int r=0;r<7;r++) {
		BusDriver result=ref[r];
		if(result!=null) {
			System.out.println("BusDriver name:"+result.getName());
			System.out.println("type of bus name:"+result.getTypeOfBus());
		}else {
				System.err.println("this is error");
		}
	}

	
		
	}

	
	

}
