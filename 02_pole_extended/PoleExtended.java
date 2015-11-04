/*
 * 02 Pole_Extended
 *
 * compilation:	javac Pole.java
 * execution:		java Pole
 *
 * purpose:			create an array of user-input size,
 *						fill it with random numbers and print the array out
 *						
 * Ukážka statického importu a optimalizácia programu vďaka metódam. 
 * Chcem ti len ukázať, ako by mal kód vyzerať, aby si sa v ňom ľahšie orientoval
 * a hlavne, aby bol o niečo viac efektívnejší. Statický import je len bonus.
 * 
 * P.S.: Nieje to to naideálnejšie riešenie a tiež to nieje celkom OOP riešenie, ale
 * ideme postupne nie všetko naraz.
 */

import java.util.Scanner;
import java.util.Random;
import static java.util.Arrays.sort; // staticky sme importovali len metódu sort

public class PoleExtended {
	// tieto premenné budú "verejné" a budú spoločné pre cel triedu (vďaka static)
	public static Scanner vstup = new Scanner(System.in);
	public static Random randomCeleCislo = new Random();
	public static int pocet = ini(); // priamo tu zavoláme ini() a nemusíme to robiť v main pretože chceme
	       // veľkosť poľa inicializovať len raz! a nevytvrárame inštancie...
	public static int[] pole = iniPole(); // opäť to isté riešenie čo pri počet. 
	
	/**
	 * Hlavná funkcia main 
	 * 
	 * @param args - parametre vstupného riadku
	 */
	public static void main(String[] args){
		naplnPole(); //naplní pole 
		
		vypis("Pred zoradením:", pole); // vypíše pole pred utriedneím

		sort(pole); // utriedy pole
		// pri jej volaní už neuvádzame Arrays.

		vypis("Po zoradení", pole); //  vypíše pole po utriedení
	}
	
	/**
	 * Inicializuje rozmer poľa 
	 * 
	 * @return - maximálna veľkosť poľa
	 */
	public static int ini() {
		System.out.print("Zadajte pocet cislic: ");
		pocet = vstup.nextInt();
		
		vstup.close(); // už nebudeme čítať preto môžme túto inštanciu uzavrieť 
		
		return pocet;
	}
	
	/**
	 * Inicializácia poľa
	 * 
	 * @return [int[]]- inicializované pole
	 */
	public static int[] iniPole() {
		return pole = new int[pocet];
	}
	
	/**
	 * Naplnenie poľa náhodnými číslami
	 */
	public static void naplnPole() {
		for (int i=0; i<pole.length; i++){
			pole[i] = randomCeleCislo.nextInt(100);
		}
	}
	
	/**
	 * Výpis poľa na terminál
	 * 
	 * @param sprava [String] - informačná správa na zobrazenie
	 * @param pole [int[]] - vstupné pole
	 */
	public static void vypis(String sprava, int[] pole) {
		System.out.println(sprava);
		
		for (int i=0; i<pole.length; i++){
			System.out.print(pole[i] + " ");
		}
		
		System.out.println();
	}
}
