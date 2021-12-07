package xworkz.operation;

public class Resort {
	
	private String name=new String();
	private String location[]=new String[5];
	int counter=0;
	
	public Resort() {
		this("7Apple");
	}
	public Resort(String name) {
		this.name=name;
	}
	public String getResort() {
		return name;
	}
	public void addLocation(String address) {
		if(counter<5) {
			location[counter]=address;
			counter++;
		}
	}
	public void displayDetails() {
		for(int x=0;x<location.length;x++) {
			String ref=location[x];
			System.out.println(ref);
		}
	}
}
