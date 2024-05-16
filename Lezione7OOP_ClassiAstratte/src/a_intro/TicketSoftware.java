package a_intro;

public class TicketSoftware extends Ticket {

	private String nomeSoftware;
	
	public TicketSoftware(int numeroTicket, String descrizioneProblema, String stato, String nomeSoftware) {
		super(numeroTicket, descrizioneProblema, stato);
		this.nomeSoftware = nomeSoftware;
	}

	//Solo nell'override vado a implementare il corpo del metodo abstract della classe madre
	@Override
	public void visualizzaInfo() {
		System.out.println("Numero ticket: " + super.getNumeroTicket()); //super indica che il metodo è preso dalla classe genitrice
		System.out.println("Descrizione problema: " + getDescrizioneProblema()); //super può essere omesso
		System.out.println("Nome software: " + this.nomeSoftware);
		System.out.println("Stato: " + super.getStato());
	}

}
