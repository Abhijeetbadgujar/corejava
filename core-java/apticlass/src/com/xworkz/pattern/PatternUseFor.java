package com.xworkz.pattern;

public class PatternUseFor {

	int r = 6;
	int c = 6;
	int col,row;
	{
		for (int row = 0; row < r; row++) {
			for (int col = 0; col < c; col++) {
				System.out.print("\t"+"*");
			}
			System.out.println();
		}

		for (int row = 0; row <= r; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print("\t"+"*");
			}
			System.out.println();
		}
		for (int row = 0; row <= r; row++) {
			for (int col = 6; col >= row; col--) {
				System.out.print("\t"+ "*");
			}
			System.out.println();
		}	
		for(int row= 0;row<=r;row++) {
			for(int col= 6;col>=row;col--) {
				System.out.print("/t"+"*");
			}
			System.out.println();
		}
		}
	
}
