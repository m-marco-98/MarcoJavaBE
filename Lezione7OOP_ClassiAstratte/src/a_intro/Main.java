package a_intro;

public class Main {

	public static void main(String[] args) {
		
		//Non posso istanziare una classe astratta
		
		//Creazione di un ticketSoftware
		
		TicketSoftware ts = new TicketSoftware(1, "Veyon non funziona", "Aperto", "Veyon");
		ts.visualizzaInfo();
		
		Ticket ts2 = new TicketSoftware(2, "Problemi durante le chiamate", "Aperto", "Zoom");
		ts2.chiudiTicket();
		ts2.visualizzaInfo();
		
		System.out.println("----------------");
		TicketHardware th = new TicketHardware(3, "Non funziona il tasto 'spazio' della tastiera", "Aperto", "Tastiera", 19.99);
		th.visualizzaInfo();
		
		Ticket th2 = new TicketHardware(4, "Linea nera sul monitor", "Aperto", "Monitor", 179.99);
		th2.chiudiTicket();
		th2.visualizzaInfo();
	}

}
