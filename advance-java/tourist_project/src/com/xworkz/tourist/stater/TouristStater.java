package com.xworkz.tourist.stater;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.tourist.dao.TouristDAO;
import com.xworkz.tourist.dao.TouristDAOImpl;
import com.xworkz.tourist.entity.TouristEntity;

/*public class TouristStater {

	public static void main(String[] args) {

	//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz.tourist");
	//	System.out.println(entityManagerFactory);
		TouristEntity touristEntity=new TouristEntity(2, "goga baba", 45,"hills", 20, "winter");
		TouristEntity touristEntity1=new TouristEntity(3, "ajintha", 45,"caves", 20, "any season");

		TouristDAO dao=new TouristDAOImpl();
		//dao.put(touristEntity);
		dao.put(touristEntity1);
	}

}*/

public class TouristStater {

	public static void main(String[] args) {

		List<TouristEntity> tourEntities=new ArrayList<TouristEntity>();
//		tourEntities.add(new TouristEntity(111, "Switzerland", 4000, "mountain", 50000, "Winter"));
//		tourEntities.add(new TouristEntity(22, "Singapore", 3000, "Food", 4000, "Summer"));
//		tourEntities.add(new TouristEntity(33, "Shimoga", 2000, "Jog Falls", 150, "Rainy"));
//		tourEntities.add(new TouristEntity(4, "Mysore", 1000 , "Palace", 200, "Winter"));
//		tourEntities.add(new TouristEntity(5, "Ballary", 0, "Fort", 0, "Winter"));
//		tourEntities.add(new TouristEntity(6, "Chitradurga", 0, "Kallina kote", 0, ""));
//		tourEntities.add(new TouristEntity(7, "Dandeli", 0, "Kalli river", 0, ""));
//		tourEntities.add(new TouristEntity(8, "Gokarna", 0, "Om Beach", 0, ""));
//		tourEntities.add(new TouristEntity(9, "Sirsi", 0, "Marikamba", 0, ""));
//		tourEntities.add(new TouristEntity(10, "Rameshwaram", 0, "Temple", 0, ""));
//		tourEntities.add(new TouristEntity(11, "Kanyakumari", 0, "Vivekananda Statue", 0, ""));
//		tourEntities.add(new TouristEntity(12, "Dood Sagar", 0, "Water Fall", 0, ""));
//		tourEntities.add(new TouristEntity(13, "Palani", 0, "Murugan Temple", 0, ""));
//		tourEntities.add(new TouristEntity(14, "Ajantha", 0, "Caves", 0, ""));
//		tourEntities.add(new TouristEntity(15, "Ellora", 0, "Caves", 0, ""));
//		tourEntities.add(new TouristEntity(16, "Soneri Mahal", 0, "Mahal", 0, ""));
//		tourEntities.add(new TouristEntity(17, "Aurangabad-Panchakki", 0, "temple", 0, ""));
//		tourEntities.add(new TouristEntity(18, "Aurangabad-KokanKada", 0, "Fort", 0, ""));
//		tourEntities.add(new TouristEntity(19, "Aurangabad-Devagiri", 0, "Fort", 0, ""));
//		tourEntities.add(new TouristEntity(20, "Aurangabad-BibiMagBara", 0, "Monument", 0, ""));
//		tourEntities.add(new TouristEntity(21, "Aurangabad-Sardhar vallahbhayi Patel", 0, "Monument", 0, ""));
//		tourEntities.add(new TouristEntity(22, "Aurangabad-Boudh Caves", 0, "Caves", 0, ""));
//		tourEntities.add(new TouristEntity(23, "Pune-Simha Gadh", 0, "Fort", 0, ""));
//		tourEntities.add(new TouristEntity(24, "Pune-RayGad", 0, "Fort", 0, ""));
//		tourEntities.add(new TouristEntity(26, "Rajasthan", 0, "Hawa Mahal", 0, ""));
//		tourEntities.add(new TouristEntity(27, "Hydrabad", 0, "Char Minar", 0, ""));
//		tourEntities.add(new TouristEntity(28, "wayanad", 0, "camping and trekking trails", 0, ""));
//		tourEntities.add(new TouristEntity(29, "Aurangabad-Gautala Autramghat", 0, "Buddhist cave temples", 0, ""));
//		tourEntities.add(new TouristEntity(30, "Shiradi", 0, "Sai Baba Mandir", 0, ""));
//		tourEntities.add(new TouristEntity(31, " Odisha", 0, "Konark Sun Temple", 0, ""));
//		tourEntities.add(new TouristEntity(32, "Delhi", 0, "Qutb Minar", 0, ""));
//		tourEntities.add(new TouristEntity(33, "jammu and kashmir", 0, "carpet weaving, silks", 0, ""));
//		tourEntities.add(new TouristEntity(34, "Panjab", 0, "Golden Temple", 0, ""));
//		tourEntities.add(new TouristEntity(35, "Amritsar", 0, "wagah border", 0, ""));
//		tourEntities.add(new TouristEntity(36, "Amritsar", 0, "jallianwala bagh", 0, ""));
//		tourEntities.add(new TouristEntity(37, "Mangalore", 0,"Panambur Beach", 0, ""));
//		tourEntities.add(new TouristEntity(38, "Mysore", 0, "Chamundi Betta", 0, ""));
//		tourEntities.add(new TouristEntity(39, "Kundapur", 0, "Maravanthe", 0, ""));
//		tourEntities.add(new TouristEntity(40, "Goa", 0, "Baga Beach and juice", 0, ""));
//		tourEntities.add(new TouristEntity(41, "Badami", 0, "", 0, ""));
//		tourEntities.add(new TouristEntity(42, "Baali", 0, "Ice lands", 0, ""));
//		tourEntities.add(new TouristEntity(43, "Thailand", 0, "Snake spa", 0, ""));
//		tourEntities.add(new TouristEntity(44, "Maldieves", 0, "Ice lands", 0, ""));
//		tourEntities.add(new TouristEntity(45, "ukraine chernobyl", 0, "worst nuclear disaster in history", 0, ""));
//		tourEntities.add(new TouristEntity(46, "turkish", 0, "turkish tea", 0, ""));
//		tourEntities.add(new TouristEntity(47, "Germany", 0, "Beer", 0, ""));
//		tourEntities.add(new TouristEntity(48, "Greenland", 0, "vast tundra and immense glaciers", 0, ""));
//		tourEntities.add(new TouristEntity(49, "afghanistan", 0, "fine fruits", 0, ""));
//		tourEntities.add(new TouristEntity(50, "venice", 0, "City of Canals", 0, ""));
//		tourEntities.add(new TouristEntity(51, "Nashik", 0, "Harihar fort ", 0, ""));
//		tourEntities.add(new TouristEntity(52, "Nashik", 0,"harishchandragad" , 0, ""));
//		tourEntities.add(new TouristEntity(53, "coimbatore", 0, "Adiyogi Shiva statue", 0, ""));
//		tourEntities.add(new TouristEntity(54, "uttarakhand ", 0, "Kedarnath", 0, ""));
//		tourEntities.add(new TouristEntity(19, "Aurangabad-Devagiri", 0, "Fort", 0, ""));
//		tourEntities.add(new TouristEntity(202, "Aurangabad-BibiMagBara", 0, "Monument", 0, ""));
//		tourEntities.add(new TouristEntity(213, "Aurangabad-Sardhar vallahbhayi Patel", 0, "Monument", 0, ""));
//		tourEntities.add(new TouristEntity(224, "Aurangabad-Boudh Caves", 0, "Caves", 0, ""));
//		tourEntities.add(new TouristEntity(237, "Pune-Simha Gadh", 0, "Fort", 0, ""));
//		tourEntities.add(new TouristEntity(245, "Pune-RayGad", 0, "Fort", 0, ""));
//		tourEntities.add(new TouristEntity(261, "Rajasthan", 0, "Hawa Mahal", 0, ""));
//		tourEntities.add(new TouristEntity(272, "Hydrabad", 0, "Char Minar", 0, ""));
//		tourEntities.add(new TouristEntity(283, "wayanad", 0, "camping and trekking trails", 0, ""));
//		tourEntities.add(new TouristEntity(296, "Aurangabad-Gautala Autramghat", 0, "Buddhist cave temples", 0, ""));
//		tourEntities.add(new TouristEntity(309, "Shiradi", 0, "Sai Baba Mandir", 0, ""));
//		tourEntities.add(new TouristEntity(318, " Odisha", 0, "Konark Sun Temple", 0, ""));
//		tourEntities.add(new TouristEntity(327, "Delhi", 0, "Qutb Minar", 0, ""));
//		tourEntities.add(new TouristEntity(335, "jammu and kashmir", 0, "carpet weaving, silks", 0, ""));
//		tourEntities.add(new TouristEntity(348, "Panjab", 0, "Golden Temple", 0, ""));
//		tourEntities.add(new TouristEntity(357, "Amritsar", 0, "wagah border", 0, ""));
		tourEntities.add(new TouristEntity(366, "Amritsar", 0, "jallianwala bagh", 0, ""));
//		tourEntities.add(new TouristEntity(374, "Mangalore", 0,"Panambur Beach", 0, ""));
//		tourEntities.add(new TouristEntity(381, "Mysore", 0, "Chamundi Betta", 0, ""));
//		tourEntities.add(new TouristEntity(392, "Kundapur", 0, "Maravanthe", 0, ""));
//		tourEntities.add(new TouristEntity(403, "Goa", 0, "Baga Beach and juice", 0, ""));
//		tourEntities.add(new TouristEntity(413, "Badami", 0, "", 0, ""));
//		tourEntities.add(new TouristEntity(423, "Baali", 0, "Ice lands", 0, ""));
//		tourEntities.add(new TouristEntity(433, "Thailand", 0, "Snake spa", 0, ""));
//		tourEntities.add(new TouristEntity(444, "Maldieves", 0, "Ice lands", 0, ""));
//		tourEntities.add(new TouristEntity(455, "ukraine chernobyl", 0, "worst nuclear disaster in history", 0, ""));
//		tourEntities.add(new TouristEntity(464, "turkish", 0, "turkish tea", 0, ""));
//		tourEntities.add(new TouristEntity(472, "Germany", 0, "Beer", 0, ""));
//		tourEntities.add(new TouristEntity(483, "Greenland", 0, "vast tundra and immense glaciers", 0, ""));
//		tourEntities.add(new TouristEntity(494, "afghanistan", 0, "fine fruits", 0, ""));
//		tourEntities.add(new TouristEntity(506, "venice", 0, "City of Canals", 0, ""));
//		tourEntities.add(new TouristEntity(515, "Nashik", 0, "Harihar fort ", 0, ""));
//		tourEntities.add(new TouristEntity(524, "Nashik", 0,"harishchandragad" , 0, ""));
//		tourEntities.add(new TouristEntity(533, "coimbatore", 0, "Adiyogi Shiva statue", 0, ""));
		
		TouristDAO dao=new TouristDAOImpl();
		dao.putAll(tourEntities);
		
	}

}
