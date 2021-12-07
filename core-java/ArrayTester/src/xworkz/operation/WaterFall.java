package xworkz.operation;

public class WaterFall {
	String name;
	String location[]=new String[5];
	int counter=0;
	
	public WaterFall() {
		this("tamini");
	}
	public WaterFall(String name) {
		this.name=name;
	}
	public String getWaterFall() {
		return name;
	}
	public void addLocation(String stateName) {
		if(counter<location.length) {
			location[counter]=stateName;
			counter++;
		}
	}
	public void dispalyDetails() {
		for(int x=0;x<location.length;x++) {
			String ref=location[x];
			System.out.println(ref);
		}
	}
}
