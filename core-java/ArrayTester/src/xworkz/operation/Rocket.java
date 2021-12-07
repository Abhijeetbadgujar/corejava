package xworkz.operation;

public class Rocket {
	String SpaceRocketName=new String();
	String rocketName[]=new String[4];
	int counter=0;
	
	 public Rocket() {
		this("meteoroid");
	}
	 public Rocket(String spaceRocketName) {
	this.SpaceRocketName=SpaceRocketName;
	}
	 public String getSpaceRocketName() {
		return SpaceRocketName;
	}
	void RockName(String name) {
		if(counter<5) {
			rocketName[counter]=name;
			counter++;
		}
	}
	void displaydetails() {
		for(int i=0;i<rocketName.length;i++) {
			String ref=rocketName[i];
			System.out.println(ref);
		}
	}
}
