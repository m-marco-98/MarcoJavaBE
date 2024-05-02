package model;

public class Programmatore extends Dipendente{
	
	public Programmatore(String nome, String cognome, int matricola) {
		super(nome, cognome, matricola);	
		this.ruolo = "Programmatore";
		this.moltiplicatore = 1.0;
	}

	
}


