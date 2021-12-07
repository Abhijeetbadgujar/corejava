package com.xworkz.dp.dpstater;

import com.xworkz.dp.Army;

public class ArmyStater {

	public static void main(String[] args) {
		
		Army army=new Army();
		army.setAircraft(30);
		army.setCountryName("India");
		army.setDresscode("black brown");
		army.setNoOfArmy(49);
		army.setNoOfNuclearBom(89);
		army.setNoOfTank(45);
		army.setPassword("shersha");
		
		Army army1=new Army("south korea","black","O yaa",40,20,10,6);
		Army army2=new Army("gorgia","black blue","dil mange more",40,20,10,6);
		Army army3=new Army("denmark","blue checks","talwar",40,20,10,6);
		Army army4=new Army("somaia","white","raskhi",40,20,10,6);
		Army army5=new Army("taiwan","dal with feta","dil to baccha hai",40,20,10,6);
		Army army6=new Army("vitnam","varun","action reaction",40,20,10,6);
		Army army7=new Army("barmuda","without dress","god bless",40,20,10,6);
		
		Army[] ref=new Army[7];
		ref[0]=army1;
		ref[1]=army2;
		ref[2]=army3;
		ref[3]=army4;
		ref[4]=army5;
		ref[5]=army6;
		ref[6]=army7;
		for(int x=0;x<ref.length;x++) {
			Army result=ref[x];
			//System.out.println("invoked index:"+result);
			if(result!=null) {
				System.out.println("invoked Army country name :"+result.getCountryName());
				System.out.println("invoked Army dress code :"+result.getDresscode()+" "+"Army password:"+result.getPassword());
			}
		}
		
		
		
	}

}
