package xworkz.operation;

public class RestaurantStater1 {

	public static void main(String[] args) {
		
		Restaurant1 restaurant=new Restaurant1();
		String res=restaurant.getName();
		System.out.println("Restaurant name:"+res);
		System.out.println(restaurant.getName());
		
		restaurant.Branchadd("mumbai");
		restaurant.Branchadd("bangalore");
		restaurant.Branchadd("pune");
		restaurant.Branchadd("delhi");
		restaurant.Branchadd("jaypur");
		restaurant.displaydetails();
	}
	
	//Restaurant1 restaurant1=new Restaurant1("abhi", 89, 'D');
	
	

}
