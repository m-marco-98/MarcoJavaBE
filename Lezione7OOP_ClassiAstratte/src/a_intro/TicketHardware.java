package a_intro;

public class TicketHardware extends Ticket {
	
	private String nomeComponente;
	private double prezzo;
	
	public TicketHardware(int numeroTicket, String descrizioneProblema, String stato, String nomeComponente, double prezzo) {
		super(numeroTicket, descrizioneProblema, stato);
		this.nomeComponente = nomeComponente;
		this.prezzo = prezzo;
	}
	
	@Override
	void visualizzaInfo() {
		System.out.println("Numero ticket: " + super.getNumeroTicket()); //super indica che il metodo è preso dalla classe genitrice
		System.out.println("Descrizione problema: " + getDescrizioneProblema()); //super può essere omesso
		System.out.println("Nome software: " + this.nomeComponente);
		System.out.println("Stato: " + super.getStato());		
		System.out.println("Costi: " + calcolaCosti(this.prezzo));
	}
	
}
