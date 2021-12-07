package com.xworkz.dp.dpstater;

import com.xworkz.dp.Season;

public class SeasonTester {

	public static void main(String[] args) {
		Season season=new Season();
		season.setDuration("4 Month");
		season.setSeasonType("winter");
		season.setTemperature("34.4temp");
		season.setTime(12);
		season.setWeater("colder");
		season.setWeatercast("good");
		
		Season season1=new Season("32tem","sunny cold","winter","5month",1,"nic");
		Season season2=new Season("32tem","sunny cold","winter","5month",1,"nic");
		Season season3=new Season("32tem","sunny cold","winter","5month",1,"nic");
		Season season4=new Season("32tem","sunny cold","winter","5month",1,"nic");
		Season season5=new Season("32tem","sunny cold","winter","5month",1,"nic");
		Season season6=new Season("32tem","sunny cold","winter","5month",1,"nic");
		
		Season[] ref=new Season[6];
		ref[0]=season1;
		ref[1]=season2;
		ref[2]=season3;
		//ref[3]=season4;
		ref[4]=season5;
		ref[5]=season6;
		
		for(int x=0;x<6;x++) {
		Season result=ref[x];
		if(result!=null) {
			//System.out.println(+result.getDuration());
			System.out.println(+result.getTime());
			//System.out.println(+result.getSeasonType());
		}else {
			System.err.println("this is error");
		}
		}
		
	}

}
