package model;

public class Dipendente {
	
	public int matricola;
	String nome, cognome, ruolo, azienda;
	double moltiplicatore = 1.0;
	
	public Dipendente(String nome, String cognome, int matricola) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}

	public void presentati() {
		System.out.println("Ciao mi chiamo " + nome + " " + cognome + " e sono " + ruolo + " presso " + azienda);
	}	
	
	public double calcoloStipendio() {
		double ore = 40;
		double pagaBase = 10.0;
		double stipendio = ore * pagaBase * this.moltiplicatore;
		return stipendio;
	}

}


