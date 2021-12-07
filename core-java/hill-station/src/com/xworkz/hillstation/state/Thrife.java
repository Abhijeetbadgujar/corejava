package com.xworkz.hillstation.state;

public class Thrife {
	public String name;
	public String specilization;
	public String area;
	public int experience;
	public int age;

	public Thrife() {
		System.out.println("invoked the thrife");
	}

	public Thrife(String name, String specilization, String area, int experience, int age) {
		super();
		this.name = name;
		this.specilization = specilization;
		this.area = area;
		this.experience = experience;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getSpecilization() {
		return specilization;
	}

	public String getArea() {
		return area;
	}

	public int getExperience() {
		return experience;
	}

	public int getAge() {
		return age;
	}

	public void runningThrife(String specilization) {
		// this.specilization=specilization;
		System.out.println("invoked the running thrife");
		System.out.println("the specilization :".concat(specilization));
	}

	public String sellItem() {
		
		System.out.println("invoked the sellItem");
		return area;
		
	}
	/*protected String sellItem() {
		
		System.out.println("invoked the sellItem");
		return specilization;
	}*/
	
	public void displayDetails() {
		System.out.println(this.age);
		System.out.println(this.area);
		System.out.println(this.experience);
		System.out.println(this.name);
		System.out.println(this.specilization);
		//System.out.println(.nativePlace);
		
	}
}
