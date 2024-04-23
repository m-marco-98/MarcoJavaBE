package model;

public class Canzone {
	
	public String titolo;
	public String cantante;
	
	public Canzone(String titolo, String cantante) {
		super();
		this.titolo = titolo;
		this.cantante = cantante;
	}
	
	public String suona() {
		return "Stai ascoltando " + this.titolo + " - " + this.cantante;
		
	}

	@Override
	public String toString() {
		return "Canzone [titolo=" + titolo + ", cantante=" + cantante + "]";
	}
	
	
	
	

}
