package esercitazione1;

import java.util.Scanner;

public class Esercizio10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quante numeri vuoi?");
		int numeri = input.nextInt();
		
		int i = 0;
		int j = 0;
		int k = 0;
		

		while (i <= numeri) {
			
			k++;
			while (j < k) {
				i++;
				System.out.print(i);
				j++;
			}
			
			j = 0;
			System.out.println();
		} 
		
	}

}
