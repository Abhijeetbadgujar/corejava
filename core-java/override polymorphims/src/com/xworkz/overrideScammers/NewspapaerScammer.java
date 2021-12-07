package com.xworkz.overrideScammers;

import com.xworkz.override.Newspaper;

public class NewspapaerScammer {

	public static void main(String[] args) {

		Newspaper newspaper=new Newspaper();
		Newspaper newspaper1=new Newspaper();
		
		System.out.println(newspaper.toString());
		
		System.out.println(newspaper.hashCode());
		
		newspaper.setName("india of time");
		newspaper1.setName("india of time");
		System.out.println(newspaper.equals(newspaper1));
	}

}
