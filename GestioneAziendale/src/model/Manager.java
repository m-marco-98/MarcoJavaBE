package model;

public class Manager extends Dipendente {
	
	public Manager(String nome, String cognome, int matricola) {
		super(nome, cognome, matricola);
		this.ruolo = "Manager";
		this.moltiplicatore = 2.0;
	}
	
	
	
}