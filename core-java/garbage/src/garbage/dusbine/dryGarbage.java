package garbage.dusbine;

public class dryGarbage {

	public static void main(String[] args) {
		
		String place=new String("near to mysor");
		boolean Place=place.contentEquals("near to bandra");
		System.out.println("different place with dif name:"+Place);
		String Plane=new String("near to bandra");
		boolean Plane1=Plane.contentEquals("near to bandra");
		System.out.println("convert to before place:"+Plane1);
		
		Integer num1=new Integer(10);
		Integer num2=new Integer(20);
		System.out.println(num1.equals(num2));
		Integer num3=new Integer(30);
		Integer num4=new Integer(30);
		System.out.println(num3.equals(num4));
		
		Float f1=40.4f;
		System.out.println(f1);
		System.out.println(f1.floatValue());
		Float f2=new Float(40.4f);
		System.out.println("result after being into float value:"+f2.floatValue());
		
		Boolean b1=true;
		System.out.println(b1.booleanValue());
		Boolean b2=new Boolean(false);
		System.out.println(b2.booleanValue());
		
		Double d1=700d;
		Double d2=new Double(d1);
		Long val1=d2.longValue();
		System.out.println(d2+"="+val1);
		Double d3=new Double(23049823042d);
		Long val2=d3.longValue();
		System.out.println(d3+"="+val2);
		
		String x="300";
		short s1=Short.parseShort(x);
		System.out.println(s1);
		        
				
	}

}
