package com.xworkz.dp;

import com.xworkz.dao.LawyerDAO;
import com.xworkz.dto.LawyerDTO;

public class LawyerStater {

	public static void main(String[] args) {

		LawyerDTO lawyerDTO = new LawyerDTO("Sandip", " llb", " male", "havele", 12, 24, 3, 24);
		LawyerDTO lawyerDTO1 = new LawyerDTO("rahule", " llbbb", " female", "hunted", 13, 24, 3, 24);
		LawyerDTO lawyerDTO2 = new LawyerDTO("sharuk", " lllllb", " male", "nana ki chauki", 14, 24, 3, 24);
		LawyerDTO lawyerDTO3 = new LawyerDTO("salman ali", " llllb", " female", "havele", 15, 24, 3, 24);
		LawyerDTO lawyerDTO4 = new LawyerDTO("amir", " lllb", " male", "havele", 16, 24, 3, 24);

		LawyerDAO dtos = new LawyerDAO();
		dtos.save(lawyerDTO);
		dtos.save(lawyerDTO1);
		dtos.save(lawyerDTO2);
		dtos.save(lawyerDTO3);
		dtos.save(lawyerDTO4);

		LawyerDTO[] lawyerDTOs = dtos.getLawyerDTO();
		lawyerDTOs[0] = lawyerDTO;
		lawyerDTOs[1] = lawyerDTO1;
		lawyerDTOs[2] = lawyerDTO2;
		lawyerDTOs[3] = lawyerDTO3;
		lawyerDTOs[4] = lawyerDTO4;

		// dtos.delete(2);
		dtos.delete(3);
		dtos.delete(1);

		for (int i = 0; i < lawyerDTOs.length; i++) {
			LawyerDTO arg = lawyerDTOs[i];
			if (arg != null) {
				System.out.println("lawyer name: " + arg.getName());
				System.out.println("lawyer age:" + arg.getAge());
				System.out.println("lawyer cases lose :" + arg.getCaseLost());
				System.out.println("lawyer cases won:" + arg.getCaseWon());
				System.out.println("lawyer court types:" + arg.getCourtType());
				System.out.println("lawyer experience:" + arg.getExperience());
				System.out.println("lawyer gender" + arg.getGender());
				System.out.println("lawyer qualification:" + arg.getQualification());
			} else {
				System.err.println("index is not pointing any index");
			}
		}
		boolean pName = dtos.searchByName("sharuk");
		System.out.println("searching the same name: " + pName);

		//boolean num = dtos.searchByCasesWon(1);
		System.out.println("searching the same cases won :" +dtos.searchByCasesWon(2));

		//LawyerDAO dtos1 = new LawyerDAO();
		//dtos1.save(new LawyerDAO(),3);
		dtos.save(lawyerDTO, 4);
		dtos.save(lawyerDTO1, 3);
		dtos.save(lawyerDTO2, 2);
		dtos.save(lawyerDTO3, 1);
		dtos.save(lawyerDTO4, 0);
		
		
	}

}
