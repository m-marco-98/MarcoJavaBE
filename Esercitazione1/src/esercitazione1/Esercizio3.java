package esercitazione1;

import java.util.Scanner;

public class Esercizio3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int numero = input.nextInt();
		
		int contatore = 1;
		for (int i = 1; i < numero/2; i++) {
			if (numero%i == 0) {
				System.out.print(i+"  ");
				contatore++;
			}
		}
		System.out.println(numero);
		
		System.out.println("I divisori sono "+contatore);
		
	}

}
