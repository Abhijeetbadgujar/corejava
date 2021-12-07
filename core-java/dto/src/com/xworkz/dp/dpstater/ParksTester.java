package com.xworkz.dp.dpstater;
import com.xworkz.dp.*;
public class ParksTester {

	public static void main(String[] args) {
		Parks parks=new Parks();
		parks.setArea(1000.3f);
		parks.setLocation("BTM");
		parks.setName("timbk");
		parks.setNoOfFlower(600);
		parks.setPrice("101");
		
		Parks parks1=new Parks("power","lal bhag","120",30,1222.4f);
		Parks parks2=new Parks("power","lal bhag","120",30,1222.4f);
		Parks parks3=new Parks("power","lal bhag","120",30,1222.4f);
		Parks parks4=new Parks("power","lal bhag","120",30,1222.4f);
		Parks parks5=new Parks("power","lal bhag","120",30,1222.4f);
		Parks parks6=new Parks("power","lal bhag","120",30,1222.4f);
		Parks parks7=new Parks("power","lal bhag","120",30,1222.4f);
		
		Parks[] ref=new Parks[7];
		ref[0]=parks1;
		ref[1]=parks2;
		ref[2]=parks3;
		//ref[3]=parks4;
		ref[4]=parks5;
		ref[5]=parks6;
		ref[6]=parks7;
		
		for(int x=0;x<ref.length;x++) {
			Parks result=ref[x];
			if(result!=null) {
				System.out.println(+result.getArea()+"   "+result.getLocation()+"  "+result.getPrice());
			}
			else {
				System.err.println("invoked the error");
			}
		}
	}

}
