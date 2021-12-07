package xworkz.operation;

public class Chocolate {

	private String flevour;
	private String brand[]=new String[5];
	private int counter=0;
	
	public Chocolate() {
		this("Dark Chocolate");
		System.out.println("invoked default constructor");
	}
	public Chocolate(String flevour) {
		this.flevour=flevour;
		System.out.println("invoked parameterized constructor");
	}
	public String getFlevour() {
		return flevour;	
	}
	public void addBrand(String name) {
		if(this.counter<5) {
			this.brand[this.counter]=name;
			this.counter++;
		}
	}
	public void displayBrand() {
		System.out.println("invoked displayBrand");
		for(int x=0;x<this.brand.length;x++) {
		String ref1=this.brand[x];
		System.out.println("display value:"+ref1);
		}
	}
	
}
