package esercitazione1;

import java.util.Scanner;

public class Esercizio9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quante righe vuoi?");
		int righe = input.nextInt();

		//Auemnta i di uno per ogni ciclo, fino a quando non arriva al numero di righe desiderato, alla fine di ogni riga va a capo
		for (int i = 0; i <= righe; i++) {

			//Stampa i numeri da j (a inizio ciclo è sempre 1) fino a i (che aumenta di uno alla fine di ogni ciclo padre)
			//sulla stessa riga.
			for (int j = 1; j <= i; j++) {
				
				System.out.print(j);
				
			}
			System.out.println("");	//va a capo per la riga successiva		
		}
		
		
		
	}

}
