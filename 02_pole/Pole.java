/*
 * 02 Pole
 *
 * version:			1.0
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
		final int pocet = vstup.nextInt();

		int pole[] = new int[pocet];

		vstup.close(); 
		
		for (int i=0; i<pole.length; i++){
			pole[i] = randomCeleCislo.nextInt(100);
		}

		System.out.println("Pred zoradenim:");
		for (int i=0; i<pole.length; i++){
			System.out.print(pole[i] + " ");
		}
		System.out.println();

		Arrays.sort(pole);

		System.out.println("Po zoradeni:");
		for (int i=0; i<pocet.length; i++){
			System.out.print(pole[i] + " ");
		}
		System.out.println();
	}
}
