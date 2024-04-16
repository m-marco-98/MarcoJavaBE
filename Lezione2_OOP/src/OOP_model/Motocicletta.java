package OOP_model;

public class Motocicletta {
	
	String marca = "Kawasaki";
	String modello;
	int cilindrata;
	byte ruoteMotrici;
	boolean isAcceso;
	
	public Motocicletta(String modello, int cilindrata) {
		this.modello = modello;
		this.cilindrata = cilindrata;
	}

	@Override
	public String toString() {
		return "Motocicletta [marca=" + marca + ", modello=" + modello + ", cilindrata=" + cilindrata
				+ ", ruoteMotrici=" + ruoteMotrici + ", isAcceso=" + isAcceso + "]";
	}	
	

}
