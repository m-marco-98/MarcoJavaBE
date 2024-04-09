package esercitazione1;

import java.util.Scanner;

public class Esercizio12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero = 0;
		int temp = 0;
		
		boolean crescente = true;
		boolean decrescente = true;
		boolean ordinato = true;
		
		int k = 0;
		boolean crescenteTemp = crescente;
		boolean decrescenteTemp = decrescente;
		
		String risultato = "";
		
		System.out.println("Inserisci almeno due numeri diversi da 0, inserisci 0 per uscire");
		
		numero = input.nextInt();
		temp = numero;
		
		
		while (numero != 0) { //prende numeri in ingresso fin quando non viene inserito 0
			
			numero = input.nextInt();
			
			if (numero != 0) {
				
				crescente = numero >= temp; //crescente e decrescente confrontano il numero inserito con il numero del ciclo precedente
				decrescente = numero <= temp;
			
			}
			
			if (crescente != crescenteTemp || decrescente != decrescenteTemp) {
				k++; //se crescente o decrescente è diversa rispetto al giro precedente (crescenteTemp  e decrescenteTemp conservano il valore) allora un contatore ne tiene traccia
			}
			
			crescenteTemp = crescente; //crescenteTemp prende il valore di crescente
			decrescenteTemp = decrescente;
			temp = numero; //temp prende il valore di numero
			
		} 
		
		//Se l'ordine è cambiato più di una volta la serie non è ordinata.
		//(Questa operazione è necessaria perchè crescente e decrescente contrallano l'ordine solo 
		//rispetto all'ultimo numero. Una serie crescente il cui ultimo numero fosse invece decrescente verrebbe 
		//riconosciuta come decrescente, invece è semplicemente disordinata)
		
		if (k > 1) {
			ordinato = false;
		}		
		
		//Assegnazione stringa
		
		if (ordinato == true && crescente == true) {
			risultato = "La serie è in ordine crescente";
		} else if (ordinato == true && decrescente == true) {
			risultato = "La serie è in ordine decrescente";
		} else  {
			risultato = "La serie non è ordinata";
		}
		
		System.out.println(risultato);
	
	}

}
