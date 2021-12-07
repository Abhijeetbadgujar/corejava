package com.xworkz.dp;

public class BraceletDTOStater {

	public static void main(String[] args) {
		
		BraceletDTO dto=new BraceletDTO();
		dto.setColour("black");
		dto.setGifted(false);
		dto.setMaterial("plastic");
		dto.setPrice(21);
		dto.setTaken(true);
		
		BraceletDTO ref1=new BraceletDTO(11,"iron","blue",false,true);
		BraceletDTO ref2=new BraceletDTO(11,"iron","red",false,true);
		BraceletDTO ref3=new BraceletDTO(11,"iron","black",false,true);
		BraceletDTO ref4=new BraceletDTO(11,"iron","white",false,true);
		BraceletDTO ref5=new BraceletDTO(11,"iron","pink",false,true);
		
		BraceletDTO[] dto1=dto.getLawyerDTO();
		dto1[0]=ref1;
		dto1[1]=ref2;
		//dto1[2]=ref3;
		dto1[3]=ref4;
		dto1[4]=ref5;
		dto1[5]=ref3;
		for(int x=0;x<dto1.length;x++) {
			BraceletDTO result=dto1[x];
			if(result!=null) {
				System.out.println("show the dto: "+result.getColour()+" "+result.getMaterial());

			}
			else {
				System.err.println("index is null");
			}
		}
		
	}

}
