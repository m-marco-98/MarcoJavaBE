package OOP_model;

import java.util.ArrayList;

public class Libro {

	public String titolo;
	String autore;
	ArrayList<String> generi;
	int numPagine;
	String casaEditrice;
	boolean isNuovo;
	double prezzo;
	
	//Costruttore
	public Libro(String titolo, String autore, ArrayList<String> generi, int numPagine, String casaEditrice, boolean isNuovo,
			double prezzo) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.generi = generi;
		this.numPagine = numPagine;
		this.casaEditrice = casaEditrice;
		this.isNuovo = isNuovo;
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		
		String condizione;
		
		if (isNuovo) {
			condizione = "nuovo";
		}
		else {
			condizione = "usato";
		}
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", generi=" + generi + ", numPagine=" + numPagine
				+ ", casaEditrice=" + casaEditrice + ", condizione=" + condizione + ", prezzo=" + prezzo + "]\n";
	}
	
	
	
	
	
}
