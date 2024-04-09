package esercitazione2;

import java.util.ArrayList;
import java.util.Collections;

public class Esercizio1 {

	public static void main(String[] args) {

		ArrayList<String> nomi = new ArrayList<String>();
		
		nomi.add("Fabrizio");
		nomi.add("Marco");
		nomi.add("Alessio");
		nomi.add("Luca");
		nomi.add("Alessandro");
		nomi.add("Giulia");
		nomi.add("Anna");
		nomi.add("Sara");
		nomi.add("Carlo");
		nomi.add("Leonardo");
		
		Collections.sort(nomi);
		
		for (int i = 0; i < nomi.size(); i++) {
			System.out.println(nomi.get(i) + " " + i);
		}
		
		System.out.println("\n");
		
		int j = 0;
		for (String nome : nomi) {
			System.out.println(nome + " " + j);			
			j++;
		}
		
		System.out.println("\n" + nomi.size());
		
		nomi.removeAll(nomi);
		for (int i = 0; i < nomi.size(); i++) {
			System.out.println(nomi.get(i) + " " + i);
		}
		
		System.out.println("\n" + nomi.size());
		
		System.out.println("è vuoto? " + nomi.isEmpty());
		
///////////////////////////////////////////////////////////////////////////////////////////////		
	}

}
