package com.xworkz.dp;

public class CraneStater {

	public static void main(String[] args) {
			
		Crane crane=new Crane();
		crane.setColour("yellow");
		crane.setLength(400.4f);
		crane.setLocation("Goa");
		crane.setName("toshiba");
		crane.setNoOfCrane(12);
		crane.setSpeed(1200);
		crane.setWeight(600.5f);
		
		Crane crane1=new Crane("Carry Deck Crane","pune","black",1800,13,700.5f,500.6f);
		Crane crane2=new Crane("Carry Deck Crane","bangalore","black",1800,13,700.5f,500.6f);
		Crane crane3=new Crane("Carry Deck Crane","channei","black",1800,13,700.5f,500.6f);
		Crane crane4=new Crane("Carry Deck Crane","mumbai","black",1800,13,700.5f,500.6f);
		Crane crane5=new Crane("Carry Deck Crane","aurangabad","black",1800,13,700.5f,500.6f);
		Crane crane6=new Crane("Carry Deck Crane","hubali","black",1800,13,700.5f,500.6f);
		Crane crane7=new Crane("Carry Deck Crane","mangalore","black",1800,13,700.5f,500.6f);
		
		Crane[] ref=new Crane[7];
		ref[0]=crane1;
		ref[1]=crane2;
		ref[2]=crane3;
		//ref[3]=crane4;
		ref[4]=crane5;
		ref[5]=crane6;
		ref[6]=crane7;
		System.out.println("invoked set value:"+crane.getLocation());
		for(int x=0;x<7;x++) {
			Crane result=ref[x];
			if(result!=null) {
				System.out.println("show the crane:"+result.getColour()+" "+result.getLocation());
			}
			else {
				System.err.println("index is null");
			}
		}
	}

}
