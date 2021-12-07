package xworkz.operation;

public class WaterFallStater {

	public static void main(String[] args) {
		
		WaterFall waterfall=new WaterFall();
		System.out.println(waterfall.getWaterFall());
		
		waterfall.addLocation("tamil nadu");
		waterfall.addLocation("karnataka");
		waterfall.addLocation("goa");
		waterfall.addLocation("maharatra");
		waterfall.dispalyDetails();
	}

}
