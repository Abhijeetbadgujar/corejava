package com.xworkz.methods.praticesCollection.tester;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.methods.praticesCollection.Actors;

public class ActorsRunner {

	public static void main(String[] args) {

		Actors actors=new Actors("kareshma", "female", "india", "white",15);
		Actors actors1=new Actors("kareshma", "female", "india", "white",15);
		Actors actors2=new Actors("kareshma", "female", "india", "white",15);
		Actors actors3=new Actors("kareshma", "female", "india", "white",15);
		Actors actors4=new Actors("kareshma", "female", "india", "white",15);
		Actors actors5=new Actors("kareshma", "female", "india", "white",15);
		Actors actors6=new Actors("kareshma", "female", "india", "white",15);
		Actors actors7=new Actors("kareshma", "female", "india", "white",15);
		Actors actors8=new Actors("kareshma", "female", "india", "white",15);
		Actors actors9=new Actors("kareshma", "female", "india", "white",15);
		
		List<Actors> list=new LinkedList<Actors>();
		list.add(actors9);
		list.add(actors8);
		list.add(actors7);
		list.add(actors6);
		list.add(actors5);
		list.add(actors4);
		list.add(actors3);
		list.add(actors2);
		list.add(actors1);
		list.add(actors);
		System.out.println("size:"+list.size());
		list.remove(actors8);
		System.out.println("size:"+list.size());
		//list.clear();
		Iterator<Actors> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
