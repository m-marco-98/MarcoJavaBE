package esercitazione1;

import java.util.Scanner;

public class Esercizio13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero = 0;		
		int tempNumero = numero;
		boolean uguali = false;
		
		int vicino = 0;
		
		
		System.out.println("Inserisci dei numeri diversi da 0");
		
		do {
			
			numero = input.nextInt();
			
				//Se entrambi i numeri sono maggiori di 100
				if (numero > 100 && vicino > 100) {
					if (numero < vicino) {
						vicino = numero;
					} else if (numero > vicino) {
						vicino = vicino;
					}
			
				//Se entrambi i numeri sono minori di 100
				} else if (numero < 100 && vicino < 100) {
					if (numero > vicino) {
						vicino = numero;
					} else if (numero < tempNumero) {
						vicino = vicino;
					}
			
				//Se solo il nuvo numero è maggiore di 100
				} else if (numero > 100 && vicino < 100) {
					if (numero - 100 < 100 - vicino) {
						vicino = numero;
					}
					else if (numero - 100 < 100 - vicino) {
						vicino = vicino;
					}
			
				//Se solo il nuovo numero è minore di 100
				} else if (numero < 100 && vicino > 100) {
					if (100 - numero < vicino - 100) {
						vicino = numero;
					}
					else if (100 - numero < vicino - 100) {
						vicino = vicino;
					}
				
				//Questo ancora non fuzniona
				} else if (numero == vicino) {
					uguali = true;
				} else if (numero != vicino) {
					uguali = false;
				}
				
		} while (numero != 0);
		
		System.out.println("Il numero più vicino è " + vicino);
		System.out.println("Uguali è " + uguali);
		
	}

}
