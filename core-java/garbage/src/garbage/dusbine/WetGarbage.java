package garbage.dusbine;

public class WetGarbage {

	public static void main(String[] args) {
		
		//wraper class using int
		int weight=50;// A variable with int means primitive
		Integer moreWeight=100;// A varible with Interger means referance
		String ref1=new String("2 bood jindgeke");// A referance with type string
			
		System.out.println("garbage weight:"+weight);
		System.out.println("garbage moreweight:"+moreWeight.intValue());
		System.out.println("how to garbage:"+ref1);	
		
		//wraper class using float
		float metalweight=40.4f;
		Float moreMetalWeight=40.5f;
		String ref2=new String("savdhan rhe surakshit rhe");
		
		System.out.println("garbage metal weight:"+metalweight);
		System.out.println("garbage more Metal weight:"+moreMetalWeight.floatValue());
		System.out.println("type of metal:"+ref2);
		
		//wrapper class using char
		char ch='x';
		Character CH='x';
		//String ref3=new String(ch.equal(CH));
		boolean same=CH.equals(ch); //Ask a question?
		String ref3=new String("bate padao bate bachao");
		
		System.out.println("ch:"+ch);
		System.out.println("CH:"+CH);
		System.out.println(" "+same);
		
		//wraper class using long
		long ton=28000L;
		Long moreTon=35000L;
		String ref4=new String("Always garbage put in dusbine");
		
		System.out.println("garbage small ton:"+ton);
		System.out.println("garbage large ton:"+moreTon);
		System.out.println(ref4);
		
		//wraper clss using short
		short price=199;
		Short VIPprice=399;
		String ref5=new String("jeb ktrose bche");
		
		System.out.println("garbage price:"+price);
		System.out.println("garbage VIPprice"+VIPprice);
		System.out.println(ref5);
		
		//wraper class using double
		double money=13333000;
		Double moreMoney=1777000d;
		String ref6= new String("unyat bharat abhiyan");
		
		System.out.println("karnataka waste money on garbage:"+money);
		System.out.println("Karnataka more waste money on garbage:"+moreMoney);
		System.out.println(ref6);
		
				
		//wrapper class using boolean
		boolean b1=true;
		Boolean b2=false;
		Boolean b3=b2.booleanValue();
		String convert=b3+"is"+b1;
		System.out.println(convert);
		System.out.println(b3);
	
		//wrapper class using string
		String non_desolve="plastic";
		String desolve=new String("vegitable");
		 same=non_desolve.equals(desolve);
		System.out.println(""+same);
		
		String type="drygarbage";
		String Type=type.valueOf('a');
		System.out.println(type);
		System.out.println(Type);
		
		

	}

}
