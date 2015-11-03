/*
 * 02 HelloWorldExtended in Java
 *
 * compilation:	javac HelloWorldExtended.java
 * execution:		java HelloWorldExtended
 *
 * purpose:			prints ‘Hello, World!’ and
 *						space-separated sequence of numbers {1..100}
 *
 */

public class HelloWorldExtended {
	public static void main(String[] args){
		System.out.println("Hello, World!\n");

		// Zrejme si nepochopil úplne presne čo som ti chcel ukázať o operátore "+" v metóde System.out.print().
		// Tvoj kód volá 2x metódu System.out.print() a v podstate vždy vytlačí medzeru a potom číslo a toto sa opakuje.
		// Dá sa to napísať do jedného volania funkcie, tak ako ukazujem:
		for(int n=1; n<=100; n++){
			System.out.print(" " + n);
		}
		
		System.out.println();
	}
}