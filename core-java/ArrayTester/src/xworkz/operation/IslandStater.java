package xworkz.operation;

public class IslandStater {

	public static void main(String[] args) {
		
		Island island=new Island();
		String isl=island.getIsland();
		System.out.println(isl);
		System.out.println(island.getIsland());
		
		island.addNameOfIsland("cook islands");
		island.addNameOfIsland("arno Atoll");
		island.addNameOfIsland("kerama");
		island.addNameOfIsland("hawar islands");
		island.addNameOfIsland("okinawa");
		island.displayDetails();
	}

}
