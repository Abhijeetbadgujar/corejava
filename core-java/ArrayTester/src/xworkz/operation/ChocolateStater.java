package xworkz.operation;

public class ChocolateStater {

	public static void main(String[] args) {
		Chocolate chocolate=new Chocolate();
		
		String choco=chocolate.getFlevour();
		System.out.println(choco);
		
		//chocolate displayBrand();
		chocolate.addBrand("parle");
		//chocolate displayBrand();
		chocolate.addBrand("nesle");
		chocolate.addBrand("Dairy Milk");
		chocolate.addBrand("Fuse");
		chocolate.addBrand("5 star");
		chocolate.addBrand("perk");
		chocolate.displayBrand();
	}

}
