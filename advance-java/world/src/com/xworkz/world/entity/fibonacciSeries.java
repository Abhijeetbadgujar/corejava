package com.xworkz.world.entity;

public class fibonacciSeries {

//	public static void main(String[] args) {
//		fibonacci
//		int x=0,y=1;
//		//System.out.println(x+" "+y);
//		int z;
//		for(int i=0;i<=10;i++) {
//			z=x+y;
//			System.out.println(z);
//			x=y;
//			y=z;
//			
//		}
//	}	reverse string
//	public static void main(String[] args) {
//		int no=5432,rem,rev=0;
//		while(no!=0) {
//			rem=no%10;
//			rev=rev*10+rem;
//			no=no/10;
//		}
//		System.out.println(rev);
//	}2nd number
	public static void main(String[] args) {
		int[] a= {5,2,6,1,2,7};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[1]);
	}
}
