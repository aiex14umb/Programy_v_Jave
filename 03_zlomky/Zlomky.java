/*
 * 02 Pole
 *
 * compilation:	javac Zlomky.java
 * execution:		java Zlomky
 *
 * purpose:			addition of two fractions
 *						
 */

import java.util.Scanner;
import java.util.regex.*;

public Zlomok scitaj(Zlomok zlom2) {
		int cit = (citatel * zlom2.menovatel) + (zlom2.citatel * menovatel);
		int menov = (menovatel * zlom2.menovatel);
		
		return new Zlomok(cit, menov);
}


public class Zlomky {
	public static void main(String[] args){
		Scanner vstup = new Scanner(System.in);
		Pattern whitespace=vstup.delimiter();  // set to default (whitespace) delimiter
		
		System.out.print("Zadajte prvy zlomok v tvare a/b: ");
		vstup.useDelimiter("/");  // set delimiter to `/'
		int zlomokCitatelA = vstup.nextInt();
		String t1 = vstup.findWithinHorizon(".",0);  // read delimiter
		vstup.useDelimiter(whitespace);  // set delimiter back to whitespace
		int zlomokMenovatelA = vstup.nextInt();
		vstup.nextLine();

		System.out.print("Zadajte druhy zlomok v tvare a/b: ");
		vstup.useDelimiter("/");
		int zlomokCitatelB = vstup.nextInt();
		String t2 = vstup.findWithinHorizon(".",0);
		vstup.useDelimiter(whitespace);
		int zlomokMenovatelB = vstup.nextInt();
		vstup.close();
		System.out.println();

		// Addition
		int menovatel = zlomokMenovatelA * zlomokMenovatelB;
		int citatel = zlomokCitatelA * zlomokMenovatelB + zlomokCitatelB * zlomokMenovatelA;

		// Reduce to lowest terms
		// using Euclid’s algorithm to find greatest common divisor
		int a = Math.abs (citatel);
		int b = Math.abs (menovatel);
		int zvysok = a % b;
		while (zvysok > 0){
			a = b;
			b = zvysok;
			zvysok = a % b;
		}

		menovatel /= b;
		citatel /= b;

		int integer=0, citatel_new=0;
		// Create mixed numerals
		if (args[0]=="-mixed"){
			integer = citatel/menovatel;
			citatel_new = citatel % menovatel;
			citatel = citatel_new;
		}

		System.out.println(args[0]);
		if (args[0]=="-mixed"){
			if (menovatel == 1){  // e.g., 500/5 + 400/100 = 104
				System.out.println(zlomokCitatelA + "/" + zlomokMenovatelA + " + " + zlomokCitatelB + "/" + zlomokMenovatelB + " = " + integer);
			}else{
				System.out.println(zlomokCitatelA + "/" + zlomokMenovatelA + " + " + zlomokCitatelB + "/" + zlomokMenovatelB + " = " + integer + " " + citatel_new + "/" + menovatel);
			}
		}else{
			System.out.println(zlomokCitatelA + "/" + zlomokMenovatelA + " + " + zlomokCitatelB + "/" + zlomokMenovatelB + " = " + citatel + "/" + menovatel);
		}
	}
}
