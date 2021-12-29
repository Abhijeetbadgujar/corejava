package com.xworkz.methods.praticesCollection.tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.methods.praticesCollection.Palace;

public class PalaceTester {

	public static void main(String[] args) {
	
		Palace palace=new Palace("sonere mahal","aurangabad", "yellow","gjanan", 300);
		Palace palace1=new Palace("sonere ","amhadanagar", "green","gjanan", 240);
		Palace palace2=new Palace("mysor palace","mysor", "red","nan", 400);
		Palace palace3=new Palace("bangalore palace","bangalore", "yellow","gjana", 230);
		Palace palace4=new Palace("dilhi palace","dilhi", "yellow","pappu", 340);
		Palace palace5=new Palace("agra mahal","agra", "white","gjn", 300);
		Palace palace6=new Palace("raypur palace","raypur", "yellow","digabar", 400);
		Palace palace7=new Palace("kotkpur","kotkpur", "white","nikam", 300);
		Palace palace8=new Palace("palace","jaypur", "yellow","rajarajjani", 400);
		Palace palace9=new Palace("churu palace","churu", "white","kakde", 230);
		
		Set<Palace> set=new HashSet<Palace>();
		set.add(palace9);
		set.add(palace8);
		set.add(palace7);
		set.add(palace6);
		set.add(palace5);
		set.add(palace4);
		set.add(palace3);
		set.add(palace2);
		set.add(palace1);
		set.remove(palace);
		//set.clear();
		Iterator<Palace> iterator=set.iterator();
		System.out.println("size of palace:"+set.size());
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
