package com.xworkz.inheritancearray;

import com.xworkz.inheritancearray.subClass.Sink;
import com.xworkz.inheritancearray.subClass.SinkColour;
import com.xworkz.inheritancearray.subClass.Washbasin;

public class SinkStater {

	public static void main(String[] args) {

		SinkColour colour = new SinkColour();
		System.out.println(colour.brand);
		System.out.println(colour.colour);
		System.out.println("------------------");

		Washbasin washbasin = new Washbasin();
		System.out.println(washbasin.brand);
		System.out.println(washbasin.noOfSink);
		System.out.println("------------------");

		Sink sink = new Sink();
		System.out.println(sink.gallery);
		System.out.println(sink.styles);
		System.out.println("------------------");

		Sink sink2 = new SinkColour(); // sink parent class and sinkcolour is sub class

		if (sink2 instanceof SinkColour) {
			System.out.println("SinkColour using instance method :" + ((SinkColour) sink2).colour);
			SinkColour sinkColour = (SinkColour) sink2;
			System.out.println("SinkColour using instance ref :" + sinkColour.colour);
		}
		System.out.println("```````````````````");

		Sink sink3 = new Washbasin();
		if (sink3 instanceof Washbasin) {
			System.out.println("washbasin using instance method :" + ((Washbasin) sink3).noOfSink);
			Washbasin washbasin2 = (Washbasin) sink3;
			System.out.println("Washbasin using instance ref:" + washbasin2.noOfSink);
		}
		System.out.println("```````````````````");

		Sink sink4 = new Sink();
		if (sink4 instanceof Sink) {
			System.out.println("sink using instance method :" + (((Sink) sink2).gallery));
			Sink sink5 = (Sink) sink4;
			System.out.println("sink using instance ref :" + sink5.gallery);
		}
		System.out.println("------------------");

		Sink[] sinks = new SinkColour[2];
		sinks[0] = colour;
		//sinks[1] = washbasin;
		for (int tteokbokki = 0; tteokbokki < sinks.length; tteokbokki++) {
			if (sinks[tteokbokki] instanceof SinkColour) {
				System.out.println("sinkcolour using instance array :" + ((SinkColour) sinks[tteokbokki]).colour);
				SinkColour colour2 = (SinkColour) sinks[tteokbokki];
				System.out.println("sinkColour using instance array ref :" + colour2.colour);
			}
		}
		System.out.println("------------------");

		Sink[] sinks2 = new Washbasin[2];
		//sinks2[0] = colour;
		sinks2[1] = washbasin;
		for (int tteokbokki = 0; tteokbokki < sinks.length; tteokbokki++) {
			if (sinks2[tteokbokki] instanceof Washbasin) {
				System.out.println("no of sink using instance array :" + ((Washbasin) sinks2[tteokbokki]).noOfSink);
				Washbasin washbasin2 = (Washbasin) sinks2[tteokbokki];
				System.out.println("no of sink using instance array ref :" + washbasin2.noOfSink);
			}
		}
		System.out.println("------------------");

		Object[] objects = new Object[2];
		objects[0] = colour;
		objects[1] = washbasin;
		for (int tteokbokki = 0; tteokbokki < sinks.length; tteokbokki++) {
			if (objects[tteokbokki] instanceof Sink) {
				System.out.println("Material using instance array :" + ((Sink) objects[tteokbokki]).material);
				Sink sink6 = (Sink) objects[tteokbokki];
				System.out.println("material using instance array ref :" + sink6.material);
			}
		}
		System.out.println("------------------");

		Sink[] sinks3 = new Sink[2];
		sinks3[0] = colour;
		sinks3[1] = washbasin;
		for (int tteokbokki = 0; tteokbokki < sinks.length; tteokbokki++) {
			if (sinks3[tteokbokki] instanceof Sink) {
				System.out.println("Brand using instance array :" + ((Sink) sinks3[tteokbokki]).brand);
				Sink sink7 = (Sink) sinks3[tteokbokki];
				System.out.println("Brand using instance array ref" + sink7.brand);
			}
		}

	}

}
