package xworkz.delete;

public class Coffee {
	String teste=new String();
	String company[]=new String[7];
	int counter=0;
	
	Coffee(){
		this("bitter");
	}
	Coffee(String teste){
		this.teste=teste;
	}
	String getcoffee() {
		return teste;
	}
	String[] getCompanyName(){
		return company;
	}
	void addCompany(String company) {
		if(counter<this.company.length) {
			this.company[this.counter]=company;
			this.counter++;
		}
		else {
			System.err.println("array index is full".concat(String.valueOf(counter)));
		}
	}
	void delete(int index) {
		if(0<=index && index<this.company.length) {
			this.company[index]=null;
		}
		else{
			System.out.println("name cant deleted:".concat(String.valueOf(index)));
		}
	}
	void update(int index,String nickname) {
		if(0<=index && index<this.company.length) {
			this.company[index]=nickname;
		}
	}
}
