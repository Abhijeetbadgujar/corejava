package com.xworkz.inheritance.Stater;

import com.xworkz.inheritance.Snake;
import com.xworkz.inheritance.cobraSnake;

public class snakeStater {

	public static void main(String[] args) {

		Snake snake=new Snake();
		Snake snake1=new cobraSnake();
		cobraSnake snake2=new cobraSnake();
		//snake2.Hide(true);
		snake2.Hide(true,"black pick");
		//System.out.println();
	}

}
