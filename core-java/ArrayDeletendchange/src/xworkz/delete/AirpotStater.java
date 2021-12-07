package xworkz.delete;

public class AirpotStater {

	public static void main(String[] args) {
		Airport airport=new Airport();
		System.out.println(airport.getName());
		
		airport.addplanes("Hawker Hurricane");
		airport.addplanes("U-2 spy plane");
		airport.addplanes("B-52 Stratofortress ");
		airport.addplanes("F-16 Fighting Falcon");
		airport.addplanes("MiG-21 fighter");
		airport.addplanes("Tupolev Tu-95 bomber");
		airport.addplanes("Bf 109 fighter");
		airport.delete(3);
		airport.update(2, "AirIndia");
		String[] array=airport.getPlanes();
		for(int i=0;i<array.length;i++) {
			System.out.println(i);
			System.out.println(array[i]);
		}
		}

}
