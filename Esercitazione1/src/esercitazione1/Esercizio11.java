package esercitazione1;

import java.util.Scanner;

public class Esercizio11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quante righe vuoi?");
		int righe = input.nextInt();
		
		for (int i = 0; i <= righe; i++) {
			
			for (int j = 0; j < i; j++) {
				
				System.out.print("@");
				
			}
			System.out.println("");			
		}
				
	}

}
