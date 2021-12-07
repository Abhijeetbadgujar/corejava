package com.xworkz.dp.dpstater;

import com.xworkz.dp.Eleveter;
public class EleveterStater {

	//private static Object result;

	public static void main(String[] args) {
		
		Eleveter eleveter=new Eleveter();
		eleveter.setBrand("lakxmi");
		eleveter.setCapacity(500);
		eleveter.setColour("black");
		eleveter.setDigital(false);
		eleveter.setHeight(40.0f);
		eleveter.setNoOfStier(60);
		eleveter.setSafety(false);
		
		Eleveter eleveterStater1=new Eleveter("pawar",450,"brown",35.4f,55,true,false);
		Eleveter eleveterStater2=new Eleveter("pawar",430,"brown",33.4f,55,true,false);
		Eleveter eleveterStater3=new Eleveter("pawar",420,"brown",54.4f,55,true,false);
		Eleveter eleveterStater4=new Eleveter("pawar",450,"brown",33.4f,55,true,false);
		Eleveter eleveterStater5=new Eleveter("pawar",650,"brown",44.4f,55,true,false);
		Eleveter eleveterStater6=new Eleveter("pawar",340,"brown",55.4f,55,true,false);
		Eleveter eleveterStater7=new Eleveter("pawar",760,"brown",30.4f,55,true,false);

		Eleveter[] ref=new Eleveter[7];
		ref[0]=eleveterStater1;
		ref[1]=eleveterStater2;
		ref[2]=eleveterStater3;
		ref[3]=eleveterStater4;
		ref[4]=eleveterStater5;
		ref[5]=eleveterStater6;
		ref[6]=eleveterStater7;
		//System.out.println("elever name:"+eleveter.getBrand());
		for(int x=0;x<ref.length;x++) {
		Eleveter result=ref[x];
		}
		if(ref!=null){
			System.out.println("elever name:"+eleveter.getCapacity()+"     "+"eleveter capacity:"+eleveter.getHeight());
		}
		else {
			System.err.println("this is error");
		}
	}

}
