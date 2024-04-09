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

		//Esegue il ciclo fino a quando i è minore del numero inserito, 
		//a ogni cilco aumenta k, ciò fa in modo che ogni riga abbia un elemento in più della precedente
		//in quanto il while figlio stampa numeri (i) sulla stessa riga fino a quando j è minore di k
		
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
		//N.B. Stampa numeri uguali a i e non uguali a j poichè j indica solo quanti numeri stampare su quella riga
		//ma la serie deve continuare a scorrere a ogni rga, e non riiniziare, j invece si azzera all afine del ciclo
		//in modo da stampare tanti numeri uanto è k, che aumenta ogni ciclo superiore
		
	}

}
