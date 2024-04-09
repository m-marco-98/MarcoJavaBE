package esercitazione1;

import java.util.Scanner;

public class Esercizio6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Inserisci una frase");
		String frase = input.nextLine();

		System.out.println("Inserisci un carattere");
		char carattere = input.nextLine().charAt(0);
		
		String carattereConvertito = Character.toString(carattere);
		
		boolean appartiene = frase.contains(carattereConvertito);
		
		System.out.println(appartiene);
	}

}
