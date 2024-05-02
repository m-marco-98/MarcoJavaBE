package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Dipendente;
import model.Manager;
import model.Programmatore;
import model.Stagista;

public class AziendaCtrl {
	
	ArrayList <Dipendente> dipendenti;
	public String nomeAzienda = "Acme";
	
    public AziendaCtrl() {
    	this.dipendenti = new ArrayList<Dipendente>();
    }
    
    public void aggiungiDipendente(String nome, String cognome) {
    	int matricola = dipendenti.size();
    	Dipendente nuovoAssunto = new Dipendente(nome, cognome, matricola);
    	dipendenti.add(nuovoAssunto);    	
    }
    
    public void aggiungiDipendenteConRuolo(String nome, String cognome, String ruolo) {
    	int matricola = dipendenti.size();
    	
    	if (ruolo.equalsIgnoreCase("Stagista")) {
    		Stagista nuovoStagista = new Stagista(nome, cognome, matricola);
    		dipendenti.add(nuovoStagista);
    	} else if (ruolo.equalsIgnoreCase("Programmatore")) {
    		Programmatore nuovoProgrammatore = new Programmatore(nome, cognome, matricola);
    		dipendenti.add(nuovoProgrammatore);
    	} else if (ruolo.equalsIgnoreCase("Manager")) {
    		Manager nuovoManager = new Manager(nome, cognome, matricola);
    		dipendenti.add(nuovoManager);
    	} else {
    		Dipendente nuovoAssunto = new Dipendente(nome, cognome, matricola);
    		dipendenti.add(nuovoAssunto);
    	}
    }

	public String visualizzaDipendenti() {
		return dipendenti.toString();
	} 
    
	public int calcolaDipendenti() {
		return dipendenti.size();
	}
	
	public double leggiStipendio(int i) {
		return dipendenti.get(i).calcoloStipendio();
	}
}