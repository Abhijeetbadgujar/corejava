package xworkz.delete;

public class Stadium {
	String name;
	String location[]=new String[7];
	int counter=0;
	
	Stadium(){
		this("motera stadium");
	}
	Stadium(String name){
		this.name=name;
	}
	String getName() {
		return name;
	}
	String[] getlocation() {
		return location;
	}
	void addlocation(String state) {
		if(counter<this.location.length) {
			this.location[counter]=state;
			counter++;
		}
		else {
			System.err.println("location cant invoked:");
		}
	}
	void delete(int index) {
		if(index<this.location.length) {
			this.location[index]=null;
		}
		else {
			System.err.println("deleted value cant invoked");
		}
	}
	void update(int index,String sportplay) {
		if(index<this.location.length) {
			this.location[index]=sportplay;
		}
	}
	
}
