package com.xworkz.methods.praticesCollection.tester;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.methods.praticesCollection.States;

public class StatesRunner {

	public static void main(String[] args) {

		States states=new States("maharashtra", "mumbai", 47392,35,true);
		States states1=new States("dilhi", "dilhi", 43392,3,true);
		States states2=new States("rajastan", "jaypur", 63392,50,true);
		States states3=new States("karnatak", "bangalore", 45392,25,true);
		States states4=new States("bangal", "kolkatta", 34392,25,true);
		States states5=new States("telangana", "hydrabad", 53392,35,true);
		States states6=new States("andra", "ambravati", 42392,34,false);
		States states7=new States("keral", "kerla", 47342,20,false);
		States states8=new States("gujrat", "gandhi nagar", 65392,55,true);
		States states9=new States("punjab", "amrutsar", 77632,25,false);
		
		Set<States> set=new HashSet<States>();
		set.add(states9);
		set.add(states8);
		set.add(states7);
		set.add(states6);
		set.add(states5);
		set.add(states4);
		set.add(states3);
		set.add(states2);
		set.add(states1);
		set.add(states);
		//set.clear();
		System.out.println(" size:"+set.size());
		set.remove(states7);
		System.out.println(" size:"+set.size());
		Iterator<States> iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
