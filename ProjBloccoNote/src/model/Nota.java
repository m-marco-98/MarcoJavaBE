package model;

import java.util.Date;

public class Nota {
	String titolo;
	String descrizione;
	Date dataCreazione = new Date();
	
	public Nota(String titolo, String descrizione) {
		super();
		this.titolo = titolo;
		this.descrizione = descrizione;

	}
	
	public String stampaNota() {
		return (this.titolo + " " + this.descrizione + " " + this.dataCreazione);
	}
}
