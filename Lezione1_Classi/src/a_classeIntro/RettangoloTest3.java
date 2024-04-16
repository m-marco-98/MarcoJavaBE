package a_classeIntro;

public class RettangoloTest3 {

	double altezza;
	double base;
	String nomeFigura;
	
	//ATTENZIONE: Specifico il metodo costruttore di default solo se devo usarlo
	//Per generare un costruttore utilizzando i campi uso Alt+Shift+S --> Generate Constructor with Fields

//	public RettangoloTest3(double altezza, double base) {
//		this.altezza = altezza;
//		this.base = base;
//	}

	public RettangoloTest3(double altezza, double base, String nomeFigura) {
		super();
		this.altezza = altezza;
		this.base = base;
		this.nomeFigura = nomeFigura;
	}
	
	//Costruisco dei metodiper la mia classe.
	//Il double rappresenta il tipo del valore che il metodo mi restituirà con il return
	public double calcolaArea() {
		double area = this.altezza * this.base;
		return area;
	}
	
	public double calcolaVolume(double profondita) {
	
		//double volume = this.altezza * this.base * profondita;
		double volume = calcolaArea() * profondita;
		return volume;
	}
	
	//Metodo toString(), ci fornisce una rappresentazione veloce dell'oggetto in formato stringa+
	@Override
	public String toString() {
		return "RettangoloTest3 [altezza=" + altezza + ", base=" + base + ", nomeFigura=" + nomeFigura + "]";
	}

	public static void main(String[] args) {
		
		RettangoloTest3 rettangolo = new RettangoloTest3(8.5, 6.4, "rettangolino");
		
		System.out.println("L'area del " + rettangolo.nomeFigura + " vale: " + rettangolo.calcolaArea());
		System.out.println(rettangolo);
	}
	
	
	
}
