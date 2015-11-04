/*
 * 02 Pole
 *
 * compilation:	javac Zlomky.java
 * execution:		java Zlomky
 *
 * purpose:			addition of two fractions
 * 
 * Toto ti viem "spraviť" len tak, že to takmer celé prepíšem, lebo ty vôbec nerobíš OOP.
 * Opäť sa budem snažiť o najjednoduhšie riešenie nie o najlepšie.			
 */

import java.util.Scanner;
import java.util.regex.*;
import java.lang.Math.abs;

public class Zlomky {
	// pre jednoduchosť dávam všade public...
	public static Scanner vstup = new Scanner(System.in); // prem. triedy
	public static Pattern whitespace=vstup.delimiter();  // set to default (whitespace) delimiter
	public int citatel; // prem. inštancie
	public int menovatel; // prem. inštancie
	
	public static void main(String[] args){
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
		String t1 = vstup.findWithinHorizon(".",0);  // read delimiter
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

		Zlomok vysledok = zjednodus(zlomok);
		
		// a konečne o čom je celá úloha vrátimue NOVÚ INŠTANCIU typu Zlomky
		return zlomok;
	}

	public static Zlomky zjednodus(Zlomky zlomok){
		int a = Math.abs (zlomok.citatel);
		int b = Math.abs (zlomok.menovatel);
		int zvysok = a % b;
		while (zvysok > 0){
			a = b;
			b = zvysok;
			zvysok = a % b;
		}

		zlomok.menovatel /= b;
		zlomok.citatel /= b;

		Zlomky zjednoduseny = new Zlomky();

		return (zjednoduseny);
	}
}
