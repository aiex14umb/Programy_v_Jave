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

		for(int n=1; n<=100; n++){
			System.out.print(" ");
			System.out.print(n);
		}

		System.out.println();
	}
}
