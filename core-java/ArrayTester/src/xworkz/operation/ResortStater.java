package xworkz.operation;

public class ResortStater {

	public static void main(String[] args) {
		
		Resort resort=new Resort();
		System.out.println(resort.getResort());
		
		resort.addLocation("goa");
		resort.addLocation("ali bagh");
		resort.addLocation("mangloare");
		resort.addLocation("mumbai");
		resort.addLocation("mahabaleshar");
		resort.displayDetails();

	}

}
