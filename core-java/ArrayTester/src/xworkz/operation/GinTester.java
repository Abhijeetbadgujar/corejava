package xworkz.operation;

public class GinTester {

	public static void main(String[] args) {
		
		Gin gin=new Gin();
		String gin1=gin.getColour();
		System.out.println("colour name:"+gin1);
		
		gin.Newbrand("gakarti");
		gin.Newbrand("rollay Stack");
		gin.Newbrand("imperial blue");
		gin.Newbrand("black dog");
		gin.displaydetails();
	}

}
