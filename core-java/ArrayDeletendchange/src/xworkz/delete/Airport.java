package xworkz.delete;

public class Airport {
	String name=new String();
	String planes[]=new String[7];
	int counter=0;
	
	Airport(){
		this("Sambhaji Nagar");
	}
	Airport(String name){
		this.name=name;
	}
	String getName() {
		return name;
	}
	String[] getPlanes() {
		return planes;
	}
	void addplanes(String planes) {
		if(counter<this.planes.length) {
		this.planes[this.counter]=planes;
		counter++;
		}
		else {
			System.err.println("cant be plane:".concat(String.valueOf(planes)));
		}
	}
	/*void displyDetails() {
		for(int x=0;x<planes.length;x++) {
			System.out.println("Display of planes:".(planes)));
		}
	}*/
	void delete(int i) {
		if(0<i &&i<this.planes.length) {
			this.planes[i]=null;
		}
		else {
			System.err.println("cant be delete:".concat(String.valueOf(i)));
		}
	}
	void update(int i,String country) {
		if(0<=i && i<this.planes.length) {
			this.planes[i]=country;
		}
	}
}
