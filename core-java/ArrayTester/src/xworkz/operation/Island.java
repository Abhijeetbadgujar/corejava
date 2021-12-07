package xworkz.operation;

public class Island {
	String location;
	String nameOfIsland[]=new String[5];
	int counter=0;
	
	Island(){
		this("Reo");
	}
	Island(String location){
		this.location=location;
	}
	String getIsland() {
		return location;
	}
	void addNameOfIsland(String name1) {
		if(counter<nameOfIsland.length) {
			nameOfIsland[counter]=name1;
			counter++;
		}
	}
	void displayDetails() {
		for(int x=0;x<nameOfIsland.length;x++) {
		String ref=nameOfIsland[x];
		System.out.println(ref);
		}
	}
	
}
