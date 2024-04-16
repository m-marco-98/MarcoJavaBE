package OOP_tester;

import java.util.ArrayList;
import java.util.Scanner;

import OOP_model.Libro;

public class Libreria {
	public static void main(String[] args) {
		
		ArrayList<Libro> scaffale= new ArrayList<Libro> ();
		
		//Creo un nuovo libro e lo inserisco nello scaffale
		
		ArrayList<String> generiLibro1 = new ArrayList<String>();
		generiLibro1.add("Fantasy");
		generiLibro1.add("Avventura");
		
		Libro libro1 = new Libro("Il signore degli anelli", "J.R.Tolkien", generiLibro1, 1200, "Bompiani", false, 16.80);
		
		scaffale.add(libro1);		
		
		ArrayList<String> generiLibro2 = new ArrayList<String>();
		generiLibro2.add("Fantastico");
		generiLibro2.add("Avventura");
		
		Libro libro2 = new Libro("Il visconte dimezzato", "I. Calvino", generiLibro2, 150, "Feltrinelli", true, 12.50);
		scaffale.add(libro2);
		
		System.out.println("Comandi utente: digita t per stampare le info di un titolo, s per stampare tutti i libri dello scaffale, 0 per uscire");
		
		Scanner input = new Scanner(System.in);
		
		String comando = input.nextLine();
		
		while (!comando.equals("0")) {
			
			if (comando.equals("t")) {
				System.out.println("Inserisci il titolo: ");
				String titolo = input.nextLine();
				
				for (Libro libro : scaffale) {
					if (libro.titolo.equals(titolo)) {
						System.out.println("Libro trovato");
						System.out.println(libro.toString());
					} else {
						System.out.println("Il libro richiesto non esiste");
					}
						
				}
				
			} else if (comando.equals("s")) {
				System.out.println("Stampo tutti i libri");
				
				System.out.println(scaffale.toString());
				
			} 
			break;			
		}
		
	
///////////////////////////////////////////////////////////////	
	}
}


