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
		
		
		for (int i = 0; i < 5; i++) {
			
			somma = somma + numeri[i];
			
		}
		
		media = somma / numeri.length;
		
		System.out.println("La somma è " + somma + ", la media è " + media);
		
		

	}

}
