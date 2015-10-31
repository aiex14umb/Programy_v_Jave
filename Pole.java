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
		int pocet = vstup.nextInt();

		int pole[] = new int[pocet];

		for (int i=0; i<pocet; i++){
			pole[i] = randomCeleCislo.nextInt(100);
		}

		System.out.println("Pred zoradenim:");
		for (int i=0; i<pocet; i++){
			System.out.print(pole[i]);
			if ((i+1)==pocet){
				System.out.println("\n");
			}else{
				System.out.print(" ");
			}
		}

		Arrays.sort(pole);

		System.out.println("Po zoradeni:");
		for (int i=0; i<pocet; i++){
			System.out.print(pole[i]);
			if ((i+1)==pocet){
				System.out.println();
			}else{
				System.out.print(" ");
			}
		}
	}
}
