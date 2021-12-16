package airpods.xworkz.earbuds;

public class StringStater {

	public static void main(String[] args) {
		String name="boat";
		String name1=new String("boat");//
		if(name==name1)//different name and different instance
			{
			System.out.println("String are pointing to same memory");
		}
		else {
			System.out.println("String are pointing to different memory");
		}
		
		String name2="boat";
		if(name1==name2)//different name and different instance
		{
		System.out.println("String are pointing to same memory");
	}
	else {
		System.out.println("String are pointing to different memory");
	}	
		name2="boat";
		System.out.println(name2);
		
		name2="realme";
		System.out.println(name2);
		
		//name2=name1;
		//System.out.println(name2);
		
		if(name2==name2) {
			System.out.println("name1 and name2 are pointing same memory");
			System.out.println(name2);
		}
		else {
			System.out.println("name1 and name2 are pointing different memory");
		}
	
	
	}

}
