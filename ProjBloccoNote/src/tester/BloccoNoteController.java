package tester;

import java.util.Scanner;

import model.BloccoNote;

public class BloccoNoteController {
	
	public static void main(String[] args) {
		//Creo un blocco note
		BloccoNote blocco = new BloccoNote();
		
		System.out.println("Benvenuto nel tuo pessimo bloccoNote " + blocco.nome);
		System.out.println("Aggiungi una nuova nota");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Titolo");
		String titolo = input.nextLine();
		
		System.out.println("Descrizione");
		String descrizione = input.nextLine();
		
		System.out.println("Posizione");
		int posizione = input.nextInt();
		
		//Aggiungo una nota
		blocco.addNota(titolo, descrizione, posizione);
		
		//Stampa la nota
		blocco.stampaBloccoNote();
	}

}
