package xworkz.com.patter;


	public class ReverseChar {

		public static void main(String[] args) {
			String str = "hello trinity welcome to xworks";

			char a[] = str.toCharArray(); // [h] [e] [l][l][o]
			int len = a.length; //
			for (int i = len - 1; i >= 0; i--) // i=4-1=3, i=3-1=2, i=2-1=1, i=1-1=0
			{
				System.out.print(a[i]); // o l l e h
			}

		}

	}

