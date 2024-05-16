package a_intro;

public abstract class Ticket {
	
	private int numeroTicket;
	private String descrizioneProblema;
	private String stato;
	
	public Ticket(int numeroTicket, String descrizioneProblema, String stato) {
		super();
		this.numeroTicket = numeroTicket;
		this.descrizioneProblema = descrizioneProblema;
		this.stato = stato;
	}
	
	public void chiudiTicket() {
		stato = "Chiuso";
	}
	
	public double calcolaCosti(double prezzo) {
		double costoTotale = prezzo * 1.22;
		return costoTotale;
	}

	//Definisco un metodo astratto. Nel momento in cui una mia classe definirà una classe astratta questo mio metodo dovrà andare in override
	abstract void visualizzaInfo();
	
	//Getters and setters
	public int getNumeroTicket() {
		return numeroTicket;
	}

	public void setNumeroTicket(int numeroTicket) {
		this.numeroTicket = numeroTicket;
	}

	public String getDescrizioneProblema() {
		return descrizioneProblema;
	}

	public void setDescrizioneProblema(String descrizioneProblema) {
		this.descrizioneProblema = descrizioneProblema;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}	
	
}
