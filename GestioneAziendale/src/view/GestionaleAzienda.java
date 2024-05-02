package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.AziendaCtrl;
import model.Dipendente;

public class GestionaleAzienda {

	public static void main(String[] args) {
		
		AziendaCtrl ufficio = new AziendaCtrl();
		
		Scanner input = new Scanner(System.in);
    	
		for (int i = 0; i < 2; i++) {
			System.out.println("Inserisci il nome");
			String nome = input.nextLine();
			System.out.println("Inserisci il cognome");
	    	String cognome = input.nextLine();
	    	
	    	ufficio.aggiungiDipendente(nome, cognome);
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Inserisci il nome");
			String nome = input.nextLine();
			System.out.println("Inserisci il cognome");
	    	String cognome = input.nextLine();
	    	System.out.println("Inserisci il ruolo");
	    	String ruolo = input.nextLine();
	    	
	    	ufficio.aggiungiDipendenteConRuolo(nome, cognome, ruolo);
		}
    	
    	System.out.println(ufficio.visualizzaDipendenti());
    	
    	System.out.println("L'azienda " + ufficio.nomeAzienda + " ha " + ufficio.calcolaDipendenti() + " dipendenti");
    	
    	System.out.println("Stipendio del dipendente con matricola 3 " + ufficio.leggiStipendio(3));
    	
//////////////////////////////////////////////////////////////////////////////////////    	
	}
}