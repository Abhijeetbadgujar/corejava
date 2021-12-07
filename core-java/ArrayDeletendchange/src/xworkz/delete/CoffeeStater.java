package xworkz.delete;

public class CoffeeStater {

	public static void main(String[] args) {
		
		Coffee coffee=new Coffee();
		String cof=coffee.getcoffee();
		System.out.println("invoked the coffee taste:".concat(cof));
		
		coffee.addCompany("nesle");
		coffee.addCompany("Blue Tokai");
		coffee.addCompany("Davidoff");
		coffee.addCompany("The Indian Bean");
		coffee.addCompany("Nescafe");
		coffee.addCompany("The Flying Squirrel");
		coffee.addCompany("Starbucks");
		
		String[] array=coffee.getCompanyName();
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
	}

}
