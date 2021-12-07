package xworkz.delete;

public class StadiumStater {

	public static void main(String[] args) {
		Stadium stadium=new Stadium();
		System.out.println(stadium.getName());
		
		stadium.addlocation("mumbai");
		stadium.addlocation("pune");
		stadium.addlocation("bangalore");
		stadium.addlocation("bhuneshawar");
		stadium.addlocation("ranchi");
		stadium.addlocation("chennai");
		stadium.addlocation("delhi");
		stadium.delete(3);
		stadium.update(5, "football");
		
		String[] array=stadium.getlocation();
		for(int i=0;i<array.length;i++) {
			System.out.println(i);
			System.out.println(array[i]);
		}
	}

}
