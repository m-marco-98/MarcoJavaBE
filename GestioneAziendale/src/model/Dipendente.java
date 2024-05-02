package model;

public class Dipendente {
	
	public int matricola;
	String nome, cognome;
	String ruolo = "Non ancora assegnato";
    public double moltiplicatore = 1.0;
    
	public Dipendente(String nome, String cognome, int matricola) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
		this.ruolo = "Ruolo non ancora assegnato";
		this.moltiplicatore = 1.0;
	}

	public void presentati() {
		System.out.println("Ciao mi chiamo " + nome + " " + cognome + " e sono " + ruolo);
	}	
	
	public double calcoloStipendio() {
		double ore = 40;
		double pagaBase = 10.0;
		double stipendio = ore * pagaBase * moltiplicatore;
		return stipendio;
	}

	@Override
	public String toString() {
		return "Dipendente [matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome + ", ruolo=" + ruolo
				+ "]";
	}

	
	

}

