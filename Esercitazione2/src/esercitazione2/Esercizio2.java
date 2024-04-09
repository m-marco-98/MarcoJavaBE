package esercitazione2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class Esercizio2 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
//		Random casuale = new Random(); 
		int numeroEstratto = 0;
		
		
		System.out.println("Quanti numeri vuoi estrarre tra i numeri da 1 a 90?");
		
		int numeroEstrazioni = input.nextInt();
		
		
		ArrayList<Integer> numeriEstratti = new ArrayList<Integer>();
		
		for (int i = 0; i < numeroEstrazioni; i ++) {
			
			double casuale = Math.random()*90;
			numeroEstratto = (int) Math.ceil(casuale);
			if (numeriEstratti.contains(numeroEstratto) == false) {
				numeriEstratti.add(numeroEstratto);
			} else {
				i--;
			}
		}
		
	    System.out.println(numeriEstratti);	
		
	    Collections.sort(numeriEstratti);
	    
	    System.out.println(numeriEstratti);

	}

}
