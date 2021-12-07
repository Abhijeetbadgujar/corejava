package xworkz.operation;

public class Restaurant1 {
	String name;//=new String();
	String branch_name[]=new String[5];
	int counter=0;
	
	public Restaurant1() {
		this("taj");
		System.out.println("invoked default constructor");
	}
	public Restaurant1(String name) {
		this.name=name;
		System.out.println("invoked parameterized constructor");
	}
	public String getName() {
		return name;
	}
	void Branchadd(String address) {
		if(counter<5) {
			branch_name[counter]=address;
			counter++;
		}
	}
	public void displaydetails() {
		for(int i=0;i<branch_name.length;i++) {
		String ref=branch_name[i];
		System.out.println(ref);
		}
	
	}
	
}
