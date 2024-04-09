package esercitazione2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Esercizio3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		

		int numeroEstratto = 0;
		
		
		System.out.println("Quanti numeri vuoi estrarre tra i numeri da 1 a 90?");
		
		int numeroEstrazioni = input.nextInt();
		
		
		ArrayList<Integer> numeriEstraibili = new ArrayList<Integer>();
		ArrayList<Integer> numeriEstratti = new ArrayList<Integer>();
		
		//Riempie un arrayList con i numeri da 1 a 90
		for (int i = 0; i < 90; i++) {
			numeriEstraibili.add(i+1);
		}
				
//-------------------------------------------PRIMA VERSIONE-----------------------------
		
//		System.out.println(numeriEstraibili);
		
//		//Li mescola
//		Collections.shuffle(numeriEstraibili);
//		
////		System.out.println(numeriEstraibili);
//		
//		//Estrai tanti numeri in posizione 1 quanti sono quelli indicati dall'utente
//		for (int i = 0; i < numeroEstrazioni; i++) {
//			
//			numeriEstratti.add(numeriEstraibili.get(1)); //Copia il numero in posizione 1 nell'array dei numeri estratti
//			numeriEstraibili.remove(1); //Rimuove il numero in posizione 1 dall'array dei numeri estraibili
//		}
//		
//		//Stampa
//		System.out.println(numeriEstratti);
//
//		System.out.println(numeriEstraibili);
		
		
//--------------------------------SECONDA VERSIONE----------------------------------------
		
		for (int i = 0; i < numeroEstrazioni; i++) {
			
			double casuale = Math.random()*(numeriEstraibili.size()-1); //Genera un casuale inferiore a size-1, cioè l'indice superiore dell'array
			numeroEstratto = (int) Math.ceil(casuale);
			
			numeriEstratti.add(numeriEstraibili.get(numeroEstratto)); //Copia il numero in posizione dettata da numeroEstratto nell'array dei numeri estratti
			numeriEstraibili.remove(numeroEstratto); //Rimuove il numero in posizione dettata da numeroEstratto dall'array dei numeri estraibili
		}
		
		//Stampa
		System.out.println(numeriEstratti);
		System.out.println(numeriEstratti.size());

//		System.out.println(numeriEstraibili);
//		System.out.println(numeriEstraibili.size());
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////		
	}

}
