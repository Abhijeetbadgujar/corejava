package com.xworkz.dp;

import com.xworkz.dao.WebSeriesDAO;
import com.xworkz.dto.WebSeriesDTO;

public class WebSeriesStater {

	public static void main(String[] args) {
		
		WebSeriesDTO dto=new WebSeriesDTO();
		dto.setCast(500);
		dto.setGenre("documentary");
		dto.setName("narcous");
		dto.setNoOfCharacters(3);
		dto.setRating(3);
		dto.setTotalEpisode(8);
		dto.setTotalSeason(2);
		
		WebSeriesDTO ref1=new WebSeriesDTO("descendant of the sun","kdrama",499,3,4,1,16);
		WebSeriesDTO ref2=new WebSeriesDTO("flames","romantic",499,3,4,2,7);
		WebSeriesDTO ref3=new WebSeriesDTO("note revenge","kdrama",499,3,4,2,8);
		WebSeriesDTO ref4=new WebSeriesDTO("String things","futuristic",499,3,4,3,9);
		WebSeriesDTO ref5=new WebSeriesDTO("education","romantic",499,3,4,3,8);
		WebSeriesDTO ref6=new WebSeriesDTO("pinnochu","kdrama",499,3,4,1,14);
		WebSeriesDTO ref7=new WebSeriesDTO("charnobly","documentry",499,3,4,1,8);
		
		
		WebSeriesDAO seriesDAO=new WebSeriesDAO();
		seriesDAO.save(ref1);
		
		
		
		/*WebSeriesDTO[] series=new WebSeriesDTO[50];
		series[0]=ref1;
		series[1]=ref2;
		series[2]=ref3;
		series[3]=null;
		series[4]=ref5;
		series[5]=ref6;
		series[6]=ref7;*/
		
		WebSeriesDTO[] series=seriesDAO.getWebSeriesDTOs();
		
		
		
		for(int i=0;i<series.length;i++) {
			WebSeriesDTO result=series[i];
			if(result!=null) {
				//System.out.println("ratting of series :".concat.dto.getRating());
				System.out.println("name of series :"+result.getGenre());
			}
			else {
				System.err.println("index is not pointing ".concat(String.valueOf(result)));
			}
		}	
	}	
}
