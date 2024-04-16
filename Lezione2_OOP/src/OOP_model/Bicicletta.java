package OOP_model;

public class Bicicletta {

	String marca;
	String modello;
	byte ruote;
	double velocita = 0;
	int frequenza = 0;
	int numMarce;
	
	public Bicicletta(String marca, String modello, byte ruote, int numMarce) {
		
		this.marca = marca;
		this.modello = modello;
		this.ruote = (byte) ruote;
		this.numMarce = numMarce;
	}
	
	//Metodo tipo void non restituisce niente, non ho nessun "return"
	
	// modificatore tipoDiRitorno nomeMetodo (parametri){}
	
	public void accelera (int incFrequenza) {
		frequenza = frequenza + incFrequenza;
		System.out.println("Stai accelerando, la frequenza attuale è: " + frequenza);
		
	}
	
	public void rallenta (int incFrequenza) {
		
		frequenza = frequenza - incFrequenza;
		System.out.println("Stai decelerando, la frequenza attuale è: " + frequenza);
	}
	
	public void calcolaVelocitaMax() {
		velocita = frequenza * numMarce;
		System.out.println("La velocità massima è: " + velocita);
	}

	public String toString() {
		return "Bicicletta [marca=" + marca + ", modello=" + modello + ", ruote=" + ruote + ", velocita=" + velocita
				+ ", frequenza=" + frequenza + ", numMarce=" + numMarce + "]";
	}
	
	
	
	
}
