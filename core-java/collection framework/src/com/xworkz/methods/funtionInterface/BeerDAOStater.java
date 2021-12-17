package com.xworkz.methods.funtionInterface;

public class BeerDAOStater {

	public static void main(String[] args) {

		
				BeerDAO beerDAO = new BeerDAO();
				
				BeerSearch beerSearch = new EqualsBeerSearch();
				boolean result=beerDAO.find(beerSearch, "Astol");
				System.out.println(result);
				
				BeerSearch beerSearch1 = new EqualsIgnoreCaseBeerSearch();
				boolean result1=beerDAO.find(beerSearch1, "beer1");
				System.out.println(result1);

			}

		
	}


