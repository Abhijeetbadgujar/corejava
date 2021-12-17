package com.xworkz.methods.funtionInterface;

//import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class EqualsBeerSearch implements BeerSearch{
	@Override
	public boolean expressions(String args3,String args4) {
		return args3.equals(args4);
	}
}
