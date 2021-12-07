package xworkz.com.apt;

import com.sun.java_cup.internal.runtime.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {

		int num = 0;
		int i=1;
		double rst=0.0;
		//Scanner in=new Scanner;
		System.out.println("Enter the number for length of series");
		//num=in.nextInt();
		while(i<=num) {
			System.out.println("1/"+i+"+");
			rst=rst+(double)1/i;
			i++;
		}
		System.out.println("Sum of harmonic Series is"+rst);
	}

}
