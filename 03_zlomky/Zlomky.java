/*
 * 03 Zlomky
 *
 * version:			0.5.1
 *
 * compilation:	javac Zlomky.java
 * execution:		java Zlomky
 *
 * purpose:			addition of two fractions
 *
 */

import java.util.Scanner;
import java.util.regex.*;
import static java.lang.Math.abs;

public class Zlomky {
	// The use of public datatypes makes it simple, but it is not always the best choice
	public static Scanner vstup = new Scanner(System.in);  // class variable
	public static Pattern whitespace=vstup.delimiter();  // set to default (whitespace) delimiter
	public int citatel;  // instance (i.e. class variable’s) variable
	public int menovatel;  // instance (i.e. class variable’s) variable

	// Set options
	public static void main(String[] args){
		if (args[0] == "-mixed"){
			public static int option = 1;
		}

		// First fraction
		Zlomky zlomok1 = new Zlomky();
		System.out.print("Zadajte prvy zlomok v tvare a/b: ");
		vstup.useDelimiter("/");  // set delimiter to `/'
		zlomok1.citatel = vstup.nextInt();
		String t1 = vstup.findWithinHorizon(".",0);  // read delimiter
		vstup.useDelimiter(whitespace);  // set delimiter back to whitespace
		zlomok1.menovatel = vstup.nextInt();
		vstup.nextLine();

		// Second fraction
		Zlomky zlomok2 = new Zlomky();
		System.out.print("Zadajte druhy zlomok v tvare a/b: ");
		vstup.useDelimiter("/");  // set delimiter to `/'
		zlomok2.citatel = vstup.nextInt();
		String t2 = vstup.findWithinHorizon(".",0);  // read delimiter
		vstup.useDelimiter(whitespace);  // set delimiter back to whitespace
		zlomok2.menovatel = vstup.nextInt();
		vstup.close();
		System.out.println();

		Zlomky zlom3 = scitaj(zlomok1, zlomok2);

		// Integer in mixed numerals
		int integer = zlomok.citatel / zlomok.menovatel;

		System.out.print("Zlomok3: " + zlom3.citatel + "/" + zlom3.menovatel);

		if (args[0]=="-mixed"){
			if (menovatel == 1){  // e.g., 500/5 + 400/100 = 104
				System.out.println(zlom1.citatel + "/" + zlom1.menovatel + " + " + zlom2.citatel + "/" + zlom2.menovatel + " = " + integer);
			}else{
				System.out.println(zlom1.citatel + "/" + zlom1.menovatel + " + " + zlom2.citatel + "/" + zlom2.menovatel + " = " + integer + " " + citatel_new + "/" + menovatel);
			}
		}else{
			System.out.println(zlom1.citatel + "/" + zlom1.menovatel + " + " + zlom2.citatel + "/" + zlom2.menovatel + " = " + citatel + "/" + menovatel);
		}
	}

	/**
	 * Sčíta dva zlomky
	 *
	 * @param zlom - prvý zlomok
	 * @param zlom2 - druhý zlomok
	 *
	 * @return - inštancia obsahujúca súčet zlomkov
	 */
	public static Zlomky scitaj(Zlomky zlom, Zlomky zlom2) {
		Zlomky zlomok = new Zlomky();

		zlomok.citatel = zlom.citatel * zlom2.menovatel + zlom2.citatel * zlom.menovatel;
		zlomok.menovatel = zlom.menovatel * zlom2.menovatel;

		Zlomky vysledok = zjednodus(zlomok);

		return vysledok;
	}

	// Simplify the fraction
	public static Zlomky zjednodus(Zlomky zlomok){
		Zlomky zlom_pom = new Zlomky();
		zlom_pom.citatel = abs(zlomok.citatel);
		zlom_pom.menovatel = abs(zlomok.menovatel);
		int zvysok = zlom_pom.citatel % zlom_pom.menovatel;
		while (zvysok > 0){
			zlom_pom.citatel = zlom_pom.menovatel;
			zlom_pom.menovatel = zvysok;
			zvysok = zlom_pom.citatel % zlom_pom.menovatel;
		}

		zlomok.menovatel /= zlom_pom.menovatel;
		zlomok.citatel /= zlom_pom.menovatel;

		if (option==1){
			Zlomky zlozity = zlozitopis(zlom_pom);
			return zlozity;
		}else{
			return zlom_pom;
		}
	}

	// Create mixed numerals
	public static Zlomky zlozitopis(Zlomky zlomok){
		Zlomky zloz = new Zlomky();
		zloz.citatel = zlomok.citatel % zlomok.menovatel;
		zloz.menovatel = zlomok.menovatel;
	}
}
