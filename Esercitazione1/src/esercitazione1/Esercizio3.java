package esercitazione1;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int numero = input.nextInt();
		
		int contatore = 1;

		//Calcolo il resto del numero / i, se è uguale a 0 allora è un divisore e lo conta. Arriva fino alla metà del numero, perchè perchè essa è il suo divisore massimo
		for (int i = 1; i <= numero/2; i++) {
			if (numero%i == 0) {
				System.out.print(i+"  ");
				contatore++;
			}
		}
		System.out.println(numero);
		
		System.out.println("I divisori sono "+contatore);
		
	}

}
