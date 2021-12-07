package xworkz.delete;

public class LabourStater {

	public static void main(String[] args) {
		Labour labour=new Labour();
		String name=labour.getName();
		System.out.println("invoked the labour name:".concat(name));
		
		labour.addCompanyName("NRB");
		labour.addCompanyName("l&t");
		labour.addCompanyName("simens");
		labour.addCompanyName("bajaj");
		labour.addCompanyName("Indorouns");
		/*labour.displayDetails();
		labour.displayDetails();*/
		
		labour.delete(3);
		labour.update(2, "info");
		//labour.displayDetails();
		
		String[] array=labour.getCompanyname();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
