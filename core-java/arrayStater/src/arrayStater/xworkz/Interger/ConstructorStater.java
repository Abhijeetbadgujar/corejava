class ConstructorStater{
	public static void main(String[] args){
	String name="abhi";
	String location="bangloare";
	
	//Constructor ref=new Constructor();
	//System.out.println(ref.name);
	
	Constructor ref1=new Constructor( name,location);
	System.out.println(ref1.name);
	System.out.println(ref1.location);
	}

}