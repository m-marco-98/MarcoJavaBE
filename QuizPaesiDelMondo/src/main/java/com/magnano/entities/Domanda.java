package com.magnano.entities;

public class Domanda {
	
	private final String TESTO_DOMANDA= "Qual è la capitale dello Stato: ";
	private String nation;
	private String ripostaVera;
	private String rispostaFalsa1;
	private String rispostaFalsa2;
	
	private String domandaCompleta;
	
	public String getDomandaCompleta() {
		return domandaCompleta;
	}
	public void setDomandaCompleta(String domandaCompleta) {
		this.domandaCompleta = this.TESTO_DOMANDA + nation;
	}
	//Getters and setters
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getRipostaVera() {
		return ripostaVera;
	}
	public void setRipostaVera(String ripostaVera) {
		this.ripostaVera = ripostaVera;
	}
	public String getRispostaFalsa1() {
		return rispostaFalsa1;
	}
	public void setRispostaFalsa1(String rispostaFalsa1) {
		this.rispostaFalsa1 = rispostaFalsa1;
	}
	public String getRispostaFalsa2() {
		return rispostaFalsa2;
	}
	public void setRispostaFalsa2(String rispostaFalsa2) {
		this.rispostaFalsa2 = rispostaFalsa2;
	}
	public String getTESTO_DOMANDA() {
		return TESTO_DOMANDA;
	}
	
	
	
}