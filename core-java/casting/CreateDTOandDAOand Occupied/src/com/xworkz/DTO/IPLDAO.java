package com.xworkz.DTO;
import com.*;


public class IPLDAO {
	
	private IPLDTO[] ipldtos=new IPLDTO[10];
	private int i=0;
	// no-paramerterized constructor
	public IPLDAO(){
		System.out.println("invoked by no-paramrterized constructor");
	}
	//save name in String 
	public void save(IPLDTO name) {
		System.out.println("Invoked method save");
	if(i<this.ipldtos.length && name!=null) {
		this.ipldtos[i++]=name;
		System.err.println("save IPL teamowner: ".concat(name.getOwner()));
	}else {
		System.err.println("index is full");
	}
}
	// create the name and no
	public void create(IPLDTO name,int no) {
		
		System.out.println("invoked overloaded method");
		if(name!=null && no<=0 && i<this.ipldtos.length) {
			this.ipldtos[no]=name;
			i++;
		}else {
			System.err.println("index is full in update memory");
		}
	}
	//index no
	public void noOfIndexFull() {
		System.out.println("invoked method index"+i);
		
	}
	//matching the name with name
	public boolean matchTeamByName(String teamName) {
		System.out.println("invoked search method");
		for(int x=0;x<this.ipldtos.length;x++) {
		IPLDTO ref=ipldtos[x];
		if(ref!=null) {
			System.out.println("ref in index is not null: ".concat(String.valueOf(x)));
			String ref1=ref.getOwner();
			if(teamName.equals(ref1)) {
				System.out.println("team name is found");
				return true;
			}
		}
		}
		return false;
	}

	public  IPLDTO[] getIpldtos() {
		return ipldtos;
	}
	


}
