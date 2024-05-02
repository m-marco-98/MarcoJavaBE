package model;

public class Stagista extends Dipendente{
	
	public Stagista(String nome, String cognome, int matricola) {
		super(nome, cognome, matricola);
		this.ruolo = "Stagista";
		this.moltiplicatore = 0.5;
	}
	
	
}