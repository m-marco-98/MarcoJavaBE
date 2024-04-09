package esercitazione1;

import java.util.Scanner;

public class Esercizio4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numero = 0;
		int maggiore = 0;
		int minore = 0;
		
		System.out.println("Inserire una serie di numeri, inserire '0' per uscire");

		//Acquisisce un numero e pone il maggiore e il minore uguali a esso
		numero = input.nextInt();
		minore = numero;
		maggiore = numero;

		//Ogni volta che viene inserito un numero controlla se è maggiore del maggiore, 
		//e se è maggiore di 0 controlla anche se è minore del minore. 
		//Alla fine stampa il contenuto di maggiore e di minore
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
