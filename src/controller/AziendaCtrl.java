package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Dipendente;

public class AziendaCtrl {
	
	ArrayList <Dipendente> dipendenti;
	
    public AziendaCtrl() {
    	this.dipendenti = new ArrayList<Dipendente>();
    }
    
    public void aggiungiDipendente(String nome, String cognome, String ruolo) {
    	int matricola = dipendenti.size();
    	Dipendente nuovoAssunto = new Dipendente(nome, cognome, matricola);
    	dipendenti.add(nuovoAssunto);
    	
    }    

}
