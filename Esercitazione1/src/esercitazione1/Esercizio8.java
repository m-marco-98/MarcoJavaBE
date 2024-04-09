package esercitazione1;

import java.util.Scanner;

public class Esercizio8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numeri[] = new int[5];
		int somma = 0;
		int media = 0;
		int k = 0;
		String numOrd = "";
		
		System.out.println("Inserisci 5 numeri");

		//Acquisizione dei numeri inutilmente complicata, solo prove di switch
		for (int i = 0; i < 5; i++) {
			
			switch (k){
				case (0):
					numOrd = "primo";
				break;
				case (1):
					numOrd = "secondo";
				break;
				case (2):
					numOrd = "terzo";
				break;
				case (3):
					numOrd = "quarto";
				break;
				case (4):
					numOrd = "quinto";
				break;
				
			
			}
			
			System.out.println("Inserisci il " + numOrd + " numero");
			numeri[i] = input.nextInt();
			k++;
			
		}
		

		//Esegue sequenzzialmente la somma man mano che i numeri vengono inseriti
		for (int i = 0; i < 5; i++) {
			
			somma = somma + numeri[i];
			
		}

		//Calcola la media dividendo la somma per il numero di elementi dell'array
		media = somma / numeri.length;
		
		System.out.println("La somma è " + somma + ", la media è " + media);
		
		

	}

}
