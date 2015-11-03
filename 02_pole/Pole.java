/*
 * 02 Pole
 *
 * compilation:	javac Pole.java
 * execution:		java Pole
 *
 * purpose:			create an array of user-input size,
 *						fill it with random numbers and print the array out
 *				
 * Až na tú drobnosť čo vidíš je to v podstate dobre spravný program. 
 * Iné možno trochu lepšie riešenie máš v PoleExtended. Ani to ešte nieje OOP prístup,
 * ale ak pochopíš PoleExtended a naučíš sa takto programovať si na dobrej ceste 
 * aby sme prešli na čisto OOP riešenie.
 * 
 * Ešte jedna vec: (to je len a len dobrá rada, ak nechceš neriaď sa ňou):
 * nauč sa písať komentáre do programu, aj v takýchto krátkych ... čo tým myslým vidíš dole
 *		
 */

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Pole {
	public static void main(String[] args){
		Scanner vstup = new Scanner(System.in);
		Random randomCeleCislo = new Random();

		// inicializácia poľa
		System.out.print("Zadajte pocet cislic: ");
		final int pocet = vstup.nextInt();

		int pole[] = new int[pocet];

		vstup.close(); 
		
		// naplnenie poľa náhodnými číslami
		for (int i=0; i<pole.length; i++){ // tu pristupuješ namiesto pocet k pole.length
			pole[i] = randomCeleCislo.nextInt(100);
		}
		
		// vypísanie poľa pred utriedením 
		System.out.println("Pred zoradenim:");
		for (int i=0; i<pole.length; i++){ // prečo TU a ...
			System.out.print(pole[i] + " ");
		}
		System.out.println();

		// utriedenie poľa
		Arrays.sort(pole);

		// vypísanie poľa po utriedení
		System.out.println("Po zoradeni:");
		for (int i=0; i<pole.length; i++){ // ... a TU už nie?
			System.out.print(pole[i] + " ");
		}
		System.out.println();
	}
}
