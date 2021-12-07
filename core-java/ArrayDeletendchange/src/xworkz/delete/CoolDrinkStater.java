package xworkz.delete;

public class CoolDrinkStater {

	public static void main(String[] args) {
		CoolDrink cooldrink=new CoolDrink();
		System.out.println("CoolDrink colour:"+cooldrink);
		String cool=cooldrink.getColour();
		System.out.println("CoolDrink colour ref through:"+cool/*.concat(cool)*/);
		
		cooldrink.addBrand("pepsi");
		cooldrink.addBrand("7up");
		cooldrink.addBrand("cococola");
		cooldrink.addBrand("sprite");
		cooldrink.addBrand("thumsup");
		cooldrink.displayDetails();
		
		cooldrink.delete(3);
		cooldrink.change(4, "7up");
		cooldrink.displayDetails();;
		
		/*String[] Array=cooldrink.getBrand();
		for(int x=0;x<Array.length;x++) {
			System.out.println(x);
			System.out.println(Array[x]);
		}*/
		
		
	}

}
