/*
 * 03 Zlomky
 *
 * version:			0.5
 *
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
	// Use public to make it simple (not always the best choice)
	public static Scanner vstup = new Scanner(System.in);  // class variable
	public static Pattern whitespace=vstup.delimiter();  // set to default (whitespace) delimiter
	public int citatel;  // instance (i.e. class variable’s) variable
	public int menovatel;  // instance (i.e. class variable’s) variable
	
	public static void main(String[] args){
		if (args[0] == "-mixed"){
			public static = 1;
		}
		/*
		 * Vytvorenie prvého zlomku 
		 */
		// nová inštancie typu Zlomky, toto je základ
		Zlomky zlomok1 = new Zlomky(); 
		
		// načítanie čitateľa a menovateľa
		System.out.print("Zadajte prvy zlomok v tvare a/b: ");
		vstup.useDelimiter("/");  // set delimiter to `/'
		zlomok1.citatel = vstup.nextInt();
		String t1 = vstup.findWithinHorizon(".",0);  // read delimiter
		vstup.useDelimiter(whitespace);  // set delimiter back to whitespace
		zlomok1.menovatel = vstup.nextInt();
		vstup.nextLine();

		// nová inštancie typu Zlomky, toto je základ
		Zlomky zlomok2 = new Zlomky(); 
		
		// načítanie čitateľa a menovateľa
		System.out.print("Zadajte druhy zlomok v tvare a/b: ");
		vstup.useDelimiter("/");  // set delimiter to `/'
		zlomok2.citatel = vstup.nextInt();
		String t2 = vstup.findWithinHorizon(".",0);  // read delimiter
		vstup.useDelimiter(whitespace);  // set delimiter back to whitespace
		zlomok2.menovatel = vstup.nextInt();
		vstup.close();
		System.out.println();
		
		/*
		 * Teraz konečne použijeme našu metódu sčítaj, ktorej výsledok bude nová inštancia.
		 */
		Zlomky zlom3 = scitaj(zlomok1, zlomok2);

		System.out.print("Zlomok3: " + zlom3.citatel + "/" + zlom3.menovatel);
	}
	
	/*
	 * Podľa zadania máš vytvoriť metódu scitaj() ktorá vráti novú inštanciu typu Zlomky
	 * takže si tú metódu musíme naprogramovať :)
	 */
	// vytvorili sme verejnú funkciu s názvom sčítaj, ktorá vracia typ: Zlomky a berie 
	// ako svoj parameter premennú zlom ktorá je tiež typu Zlomky
	// P.S.: Typ Zlomky je nami vytvorený dátový typ v podstate je to to isté, ako int, char, boolean a pod.
	
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
		
		zlomok.citatel = (zlom.citatel * zlom2.menovatel) 
				+ (zlom2.citatel * zlom.menovatel);
		zlomok.menovatel = (zlom.menovatel * zlom2.menovatel);

		Zlomky vysledok = zjednodus(zlomok);  // priradit hodnotu zjednodus();
		
		// a konečne o čom je celá úloha vrátimue NOVÚ INŠTANCIU typu Zlomky
		return vysledok;
	}

	public static Zlomky zjednodus(Zlomky zlomok){  // Simplify a fraction
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

	public static Zlomky zlozitopis(Zlomky zlomok){  // Create mixed numerals
		Zlomky zloz = new Zlomky();
		int integer = zlomok.citatel / zlomok.menovatel;
		zloz.citatel = zlomok.citatel % zlomok.menovatel;
		zloz.menovatel = zlomok.menovatel;
	}
}
