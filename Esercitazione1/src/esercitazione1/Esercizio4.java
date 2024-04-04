package esercitazione1;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numero = 0;
		int maggiore = 0;
		int minore = 0;
		
		System.out.println("Inserire una serie di numeri, inserire '0' per uscire");
		
		numero = input.nextInt();
		minore = numero;
		maggiore = numero;
		
		do {
			
			numero = input.nextInt();
			if (numero > maggiore) {
				maggiore = numero;
			}
			if (numero > 0 && numero < minore) {
				minore = numero;
			}

		} while (numero != 0);
		
		System.out.println("Il maggiore è "+maggiore);
		System.out.println("Il minore è "+minore);

	}

}
