package com.xworkz.methods.NameDTODAO;

public class ProductLambdaRunner {

	public static void main(String[] args) {
		
		ProductDAO dao= new ProductDAO(); 
//		ProductDTO dao=new ProductDTO();
//		ProductDTO dao1=new ProductDTO();
//		ProductDTO dao2=new ProductDTO("AB123","abhijeet cargo","airoplane",999);
		ProductDTO dto3=new ProductDTO("AB134","ABHIJEET","airoplane",1200);
		
		boolean match = dao.find((f1,f2)->{
		if(f1.getName().equals(f2.getName())&& f1.getPrice()==f2.getPrice())
		{
			return f1.equals(f2);
		}return false;
		
		},dto3 );
		System.out.println(match);
	}	
}
