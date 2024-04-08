package esercitazione1;

import java.util.Scanner;

public class Esercizio12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero = 0;
		int temp = 0;
		boolean crescente = true;
		boolean decrescente = true;
		
		System.out.println("Inserisci numeri diversi da 0, inserisci 0 per uscire");
		
		//Fa il primo controllo fuori dal ciclo per avere temp != 0 la prima vota, 
		//ma per avere temp = numero dopo il controllo il resto delle volte
		numero = input.nextInt();
		temp = numero;
		
		crescente = numero >= temp;
		decrescente = numero <= temp;
		
		while (temp != 0) {
			
			numero = input.nextInt();
						
			crescente = numero >= temp;
			decrescente = numero <= temp;
			
			temp = numero;
		} 
		
		System.out.println("I numeri erano in ordine crescente? "+ crescente);	
		System.out.println("I numeri erano in ordine decrescente? "+ decrescente);
	
	}

}
