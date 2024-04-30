package view;

import java.util.Scanner;

import controller.AziendaCtrl;

public class GestioneAzienda {

	public static void main(String[] args) {
		
		AziendaCtrl database = new AziendaCtrl();
		
		Scanner input = new Scanner(System.in);
    	
		String nome = input.nextLine();
    	String cognome = input.nextLine();
    	
    	database.aggiungiDipendente(nome, cognome);
    	

	}

}
