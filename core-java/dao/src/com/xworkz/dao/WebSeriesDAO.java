package com.xworkz.dao;

//import com.xworkz.dao.*;
import com.xworkz.dto.WebSeriesDTO;
public class WebSeriesDAO {
	
	private WebSeriesDTO[] webSeriesDTOs=new WebSeriesDTO[50];
	private int x=0;
	
	public WebSeriesDAO() {
		//System.out.println("invoked the no-parameterized DAOconstructor");
	}
	public WebSeriesDTO[] getWebSeriesDTOs() {
		return webSeriesDTOs;
	}
	public void save(WebSeriesDTO seires1) {
		if(x<webSeriesDTOs.length && seires1!=null) {
			this.webSeriesDTOs[this.x++]=seires1;
			System.out.println(" name of series is ".concat(seires1.getName()).concat(" we invoked"));
			
		}
		else{
			System.out.println("invoked the full index or not passing the argument");
		}
	}
	
	
}
