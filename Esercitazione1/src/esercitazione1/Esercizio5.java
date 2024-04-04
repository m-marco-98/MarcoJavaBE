package esercitazione1;

import java.util.Scanner;

public class Esercizio5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il primo lato");
		
		int a = input.nextInt();
		
		System.out.println("Inserisci il secondo lato");
		int b = input.nextInt();
		
		System.out.println("Inserisci il terzo lato");
		int c = input.nextInt();
		
		
	    if (c < a+b || b < a+c || a < b+c) {
	    	System.out.println("Il triangolo esiste");
	    } else {
	    	System.out.println("Il triangolo non esiste");
	    }
		

	}

}
