package com.xworkz.dp;

import com.xworkz.dao.TempleDAO;
import com.xworkz.dto.TempleDTO;

public class TempleTester {

	public static void main(String[] args) {
		
		TempleDTO templedto=new TempleDTO("sai baba","shirdi","baba","roti and sabji",6);
		TempleDTO templedto1=new TempleDTO("maruti","khultabad","baba","roti and sabji",6);
		TempleDTO templedto2=new TempleDTO("balaji","tirupati","baba","roti and sabji",6);
		TempleDTO templedto3=new TempleDTO("mahadev","himachal","baba","roti and sabji",6);
		TempleDTO templedto4=new TempleDTO("guru nank","ambritsar","baba","roti and sabji",6);
		
		TempleDAO templedao=new TempleDAO();
		templedao.save(templedto1);
		TempleDTO[] tem=templedto.gettempleDTO();
		
		for(int x=0;x<tem.length;x++) {
			TempleDTO result=tem[x];
			if(result!=null) {
				System.out.println("name of location: "+result.getLocation());
				System.out.println("name of maingod: "+result.getMainGod());
			}
			else {
				System.err.println("error");
			}
		}
		
	}

}
