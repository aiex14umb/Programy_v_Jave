/*
 * 02 Pole
 *
 * compilation:	javac Pole.java
 * execution:		java Pole
 *
 * purpose:			create an array of user-input size,
 *						fill it with random numbers and print the array out
 *						
 */

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Pole {
	public static void main(String[] args){
		Scanner vstup = new Scanner(System.in);
		Random randomCeleCislo = new Random();

		System.out.print("Zadajte pocet cislic: ");
		final int pocet = vstup.nextInt(); // final je konštanta, pretože pole by sa malo raz inicializovať a už 
		// by sa táto konštanta pocet nemala dať zmeniť, preto je tam kľúčové slovo final

		int pole[] = new int[pocet];

		vstup.close(); // treba uzavrieť inštanciu skenera, ak si s ňou už dorobil, niekedy to robí problémy alebo len 
		// spomaľuje program 
		
		for (int i=0; i<pole.length; i++){ // nie premenná v ktorej je počet, ale vždy konečná dĺžka poľa
			// môže sa stať, že dĺžku poľa ti zmení nejaká extzerná funkcia ak budeš mať <pole tak máš problém
			// ak <pole.length tak je to v pohode
			pole[i] = randomCeleCislo.nextInt(100);
		}

		System.out.println("Pred zoradenim:");
		for (int i=0; i<pocet; i++){
			System.out.print(pole[i] + " ");
		}
		System.out.println();

		Arrays.sort(pole);

		System.out.println("Po zoradeni:");
		for (int i=0; i<pocet; i++){
			System.out.print(pole[i] + " ");
		}
		System.out.println();
	}
}
