package xworkz.delete;

public class CoolDrink {
	String colour=new String();
	String brand[]=new String[5];
	int again=0;
	
	CoolDrink(){
		this("brown");
		System.out.println("invoked the default constructor");
	}
	CoolDrink(String colour){
		this.colour=colour;
		System.out.println("invoked the parameterzied constructor");
	}
	
	String getColour() {
		return colour;
	}
	String[] getBrand() {
		return brand ;
	}

	void addBrand(String name) {
		if(again<this.brand.length && again>=0) {
			brand[again]=name;
			again++;
			System.out.println("invoked the add method:".concat(name));
		}
	}
	
	
	void delete(int i) {
		if(i<this.brand.length && i<=0) {
			this.brand[i]=null;
			System.out.println("invoked index is:".concat(String.valueOf(i)));
		}else {
			System.out.println("can't be deleted");
		}
	}
	void change(int no,String update) {
		if(no<=0 && this.brand.length>no) {
			this.brand[no]=update;
			System.out.println("invoked change value:".concat(String.valueOf(no)));
		}
	}
	void displayDetails() {
		for(int i=0;i<this.brand.length;i++) {
			String ref1=brand[i];
			System.out.println("CoolDrink brand:".concat(ref1));
		}
	}
	/*public String getColour() {
		return null;
	}*/

}
