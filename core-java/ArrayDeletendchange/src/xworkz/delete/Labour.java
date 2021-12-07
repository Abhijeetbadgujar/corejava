package xworkz.delete;

public class Labour {
	String name=new String();
	String companyname[]=new String[5];
	int counter=0;
	
	Labour(){
		//System.out.println("invoked default 1st");
		this("Om Sai");
		System.out.println("invoked default constructor");
	}
	Labour(String name){
		System.out.println("");
		this.name=name;
		System.out.println("invoked parameterized constructor");
	}
	String getName() {
		return name;
	}
	public String[] getCompanyname() {
		return companyname;
	}
	void addCompanyName(String groupname) {
		if(counter<this.companyname.length) {
			System.out.println("addCompanyname:".concat(groupname));//it is for 0 index;
			this.companyname[this.counter]=groupname;
			this.counter++;
			//System.out.println("addCompanyname:".concat(String.valueOf(this.counter)));//it is for 1
		}	
		else {
			System.err.println("array is full".concat(String.valueOf(this.counter)));
		}
	}
	/*void displayDetails() {
		for(int i=0;i<this.companyname.length;i++) {
			String ref=companyname[i];
			System.out.println("companyName:".concat(ref));
		}
	}*/
	void delete(int i) {
		if(0<=i && i<companyname.length) {
			this.companyname[i]=null;
			//System.out.println("index is deleted:".concat(String.valueOf(index)));
		}else {
			System.err.println("index is greater than zero and less than:".concat(String.valueOf(this.companyname)));
		}
	}
	
	public void update(int i,String nickname) {
		if(0<=i && i<companyname.length) {
			this.companyname[i]=nickname;
			//System.out.println("name is change:");
		}
}
	/*void displayDetails() {
		for(int i=0;i<this.companyname.length;i++) {
			String ref=companyname[i];
			System.out.println("companyName:".concat(ref));
		}
	}*/
}
