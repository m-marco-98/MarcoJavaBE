package esercitazione1;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		
//		//Acquisisce l'intero
//		System.out.println("Inserisci un numero intero");
//		int numero = input.nextInt();
//		
//		//Converte l'intero in stringa
//		String numeroStringa = (String)""+numero;
//		
//		//Conta i caratteri della stringa
//		int cifre = numeroStringa.length();
//		
//		//Stampa il risultato
//		System.out.println("Il numero "+numero+" è composto da "+cifre+" cifre");
	    
		Scanner input = new Scanner(System.in);
		
		//Acquisisce l'intero
		System.out.println("Inserisci un numero intero");
		int numero = input.nextInt();
	    
		int contatore = 0;
		int i = 1;
		
//		for (i = 1; i <= numero; i = 10*i) {
//			if (numero*i > i){
//				contatore++;
//			}
//		}
		
		while (numero > 0) {
			numero = numero/10;
			contatore++;
		}
		
		System.out.println(contatore);
	
	}

}
