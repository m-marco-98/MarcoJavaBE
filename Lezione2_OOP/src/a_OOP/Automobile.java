package a_OOP;

public class Automobile {

	String marca = "Fiat";
	String modello;
	int cilindrata;
	byte ruoteMotrici = 2;
	boolean statoMotore = false;
	
	//Specifico il costruttore di default (sarebbe opzionale se fosse l'unico)
	
	public Automobile() {}
	
	//Specifico un costruttore per una sola caratteristica
	
	public Automobile(String marca) {
		this.marca = marca;
	}
	
	//Costruttore con alcuni campi
	public Automobile(String marca, String modello, int cilindrata) {
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
	}

	//Alt + shift + s = shortcut di eclipse per generare un costruttore da un'interfaccia
	public Automobile(String marca, String modello, int cilindrata, byte ruoteMotrici, boolean statoMotore) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.ruoteMotrici = ruoteMotrici;
		this.statoMotore = statoMotore;
	}

	//Generate toString = il metodo per generare una stringa che contiene i valori delle proprietà dell'oggetto
	@Override
	public String toString() {
		return "Automobile [marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata + ", ruoteMotrici="
				+ ruoteMotrici + ", statoMotore=" + statoMotore + "]";
	}
	
	
	
	
	
	
}
