package model;

public class Barca {
	
	private static int generatoreMatricola = 1;
	
	private int matricola;
	private int cilindrata;
	private double prezzo;
	private int stato;
	private String modello;
	private int posti;
	
	//Getters and setters
	public int getMatricola() {
		return matricola;
	}
	public void setMatricola() {
		this.matricola = generatoreMatricola++;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getStato() {
		return stato;
	}
	public void setStato(int stato) {
		this.stato = stato;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public int getPosti() {
		return posti;
	}
	
	public void setPosti(int posti) {
		this.posti = posti;
	}
	
	//toString
	@Override
	public String toString() {
		return "Barca [matricola=" + matricola + ", cilindrata=" + cilindrata + ", prezzo=" + prezzo + ", stato="
				+ stato + ", modello=" + modello + "]";
	}

	
		

}
