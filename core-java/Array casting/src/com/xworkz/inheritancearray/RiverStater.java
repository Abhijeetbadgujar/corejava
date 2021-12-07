package com.xworkz.inheritancearray;

import com.xworkz.inheritancearray.subClass.GangaRiver;
import com.xworkz.inheritancearray.subClass.KrishaRiver;
import com.xworkz.inheritancearray.subClass.River;

public class RiverStater {

	public static void main(String[] args) { // river are parent class and ganga and krisha is subclass

		GangaRiver gangaRiver = new GangaRiver();// GangRiver pointing to GangaRiver ,
		System.out.println(gangaRiver.name); // so we can access only the gangaRiver properties
		System.out.println(gangaRiver.colour);
		System.out.println(gangaRiver.flow);
		System.out.println("----------------------------");

		KrishaRiver krishRiver = new KrishaRiver();// KrishRiver pointing to KrishRiver ,
		System.out.println(krishRiver.name); // so we can access only KrishRiver
		System.out.println(krishRiver.colour);
		System.out.println(krishRiver.noOfdames);
		System.out.println("--------------------------");

		River river = new River(); // river pointing to river,
		System.out.println(river.name); // so we can access only river
		System.out.println(river.desination);
		System.out.println(river.born);
		System.out.println("-------------------------");

		/*
		 * Object object = new Object(); System.out.println(river.name);
		 * System.out.println(river.colour); System.out.println(krishRiver.noOfdames);
		 * System.out.println(gangaRiver.flow);
		 * System.out.println("-------------------------");
		 */

		River river2 = new GangaRiver(); // River pointing to Gangariver, so we can access river as well as gangaRiver
											// properties
		System.out.println(river2.name);// 37 line showing only river properties

		if (river2 instanceof GangaRiver) {// if river2 pointing to gangariver, then we can access ganga river
											// properties
			System.out.println("gangaRiver using instance of:" + ((GangaRiver) river2).flow);
			GangaRiver args1 = (GangaRiver) river2;
			System.out.println(args1.flow);
		}

		River river3 = new KrishaRiver(); // River pointing to KrishRiver,
		System.out.println(river3.born); // so we can access river as well as KrishRiver properties

		if (river3 instanceof KrishaRiver) {
			System.out.println("krish river using instance of:" + ((KrishaRiver) river3).born);
			KrishaRiver args2 = (KrishaRiver) river3;
			System.out.println("krish river using instance of but using ref :" + args2.born);
		}

		River[] rivers4 = new River[3]; // river array pointing to river[3(for giving fix memory)] it is similar
										// datytype,
		rivers4[0] = gangaRiver; // so river[] can access only river porperties .
		// rivers4[1] = krishRiver;
		// rivers4[2] = river;

		for (int raman = 0; raman < rivers4.length; raman++) {
			if (rivers4[raman] instanceof GangaRiver) {// river are pointing to gangaRiver
				System.out.println("gangaRiver using instance of array :" + ((GangaRiver) rivers4[raman]).flow
						+ " and the index of".concat(String.valueOf(raman)));
				// System.out.println("krishRiver using instance of array
				// :"+((KrishaRiver)rivers4[raman]).noOfdames);
				GangaRiver gangaRiver2 = (GangaRiver) rivers4[raman];
				System.out.println("ganga river using instance of but using ref :" + gangaRiver2.flow
						+ " and the index of".concat(String.valueOf(raman)));
				// System.out.println("krishRiver using instance of but using ref
				// :"+gangaRiver2.);
			}
			if (rivers4[raman] instanceof KrishaRiver) {// river[] are pointing to krishaRiver
				System.out.println("krishRiver using instance of array :" + ((KrishaRiver) rivers4[raman]).noOfdames);
			}
			if (rivers4[raman] instanceof River) {// river[] are pointing to river
				System.out.println("river using instance of array :" + ((River) rivers4[raman]).colour);
			}
		}
		Object[] rivers5 = new Object[3];
		rivers5[0] = gangaRiver;
		// rivers5[1] = krishRiver;
		// rivers5[2] = river;

		for (int raman = 0; raman < rivers5.length; raman++) {
			if (rivers5[raman] instanceof GangaRiver) {
				System.out.println("gangaRiver using instance of array :" + ((GangaRiver) rivers5[raman]).flow
						+ " and the index of".concat(String.valueOf(raman)));
				GangaRiver gangaRiver2 = (GangaRiver) rivers5[raman];
				System.out.println("ganga river using instance of but using ref :" + gangaRiver2.flow
						+ " and the index of".concat(String.valueOf(raman)));
			}
			if (rivers5[raman] instanceof KrishaRiver) {
				System.out.println("krishRiver using instance of array :" + ((KrishaRiver) rivers5[raman]).noOfdames);
			}
			if (rivers5[raman] instanceof River) {
				System.out.println("river using instance of array :" + ((River) rivers5[raman]).born);
			}
		}
		River[] rivers6 = new GangaRiver[3];
		rivers6[0] = gangaRiver;
		// rivers6[1] = river;
		// rivers6[2] = river;

		for (int raman = 0; raman < rivers6.length; raman++) {
			if (rivers6[raman] instanceof GangaRiver) {
				System.out.println("gangaRiver using instance of array :" + ((GangaRiver) rivers6[raman]).flow
						+ " and the index of".concat(String.valueOf(raman)));
				GangaRiver gangaRiver2 = (GangaRiver) rivers6[raman];
				System.out.println("ganga river using instance of but using ref :" + gangaRiver2.flow
						+ " and the index of".concat(String.valueOf(raman)));
			}
			if (rivers6[raman] instanceof KrishaRiver) {
				System.out.println("krishRiver using instance of array :" + ((KrishaRiver) rivers6[raman]).noOfdames);
			}
			if (rivers6[raman] instanceof River) {
				System.out.println("river using instance of array :" + ((River) rivers6[raman]).colour);
			}
		}
		River[] rivers7 = new GangaRiver[3];
		rivers7[0] = gangaRiver;

		for (int raman = 0; raman < rivers7.length; raman++) {
			if (rivers7[raman] instanceof GangaRiver) {
				System.out.println("gangaRiver using instance of array :" + ((GangaRiver) rivers7[raman]).flow
						+ " and the index of".concat(String.valueOf(raman)));
				GangaRiver gangaRiver2 = (GangaRiver) rivers7[raman];
				System.out.println("ganga river using instance of but using ref :" + gangaRiver2.flow
						+ " and the index of".concat(String.valueOf(raman)));
			}
			if (rivers7[raman] instanceof KrishaRiver) {
				System.out.println("krishRiver using instance of array :" + ((KrishaRiver) rivers7[raman]).noOfdames);
			}
			if (rivers7[raman] instanceof River) {
				System.out.println("river using instance of array :" + ((River) rivers7[raman]).colour);
			}
		}

	}

}
