package xworkz.operation;

public class Gin {
	String colour;
	String brand[]=new String[4];
	int counter=0;
	public Gin() {
		this("brown");
		System.out.println("invoked default constructor");
	}
	public Gin(String colour) {
		this.colour=colour;
		System.out.println("invoked paraterized constructor");
	}
	public String getColour() {
		return colour;
	}
	public void Newbrand(String name) {
		if(counter<4) {
			brand[counter]=name;
			counter++;
		}
	}
	public void displaydetails() {
		System.out.println("invoked displaydetails");
		for(int g=0;g<brand.length;g++) {
		String result=brand[g];
		System.out.println("brand name:"+result);
		}
	}
	
}
