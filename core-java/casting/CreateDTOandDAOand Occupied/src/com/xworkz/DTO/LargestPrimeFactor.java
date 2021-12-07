class LargestPrimeFactor{
	public static void main(String[] args){
	int number=315;
	primeFactors(number);
	}
	private static void primeFactors(int number){
	HashSet<Integer> hashSet=new HashSet();
	for(int i=2;i<=number;i++){
		while(number%i==0){
		hashSet.add(number);
		number=number/i;
		}
	}
	
	
	}
}