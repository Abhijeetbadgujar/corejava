package xworkz.operation;

public class RocketStater {

	public static void main(String[] args) {
		
		Rocket rocket=new Rocket();
		String roc=rocket.getSpaceRocketName();
		System.out.println("Spaceroket1"+roc);
		
		System.out.println(rocket.getSpaceRocketName());
		
		rocket.RockName("GSAT");
		rocket.RockName("RISAT-2BR1	");
		rocket.RockName("Cartosat");
		rocket.RockName("Chandrayaan2");
		rocket.displaydetails();
		
	}

}
