package a_classeIntro;

public class RettangoloTest2 {

	double altezza;
	double base;
	
	//Il costruttore deve avere il nome della classe
	//Attenzione, esiste un costruttore di default:
	//il seguente metodo costruttore è a firma vuota. 
	//La frima di un metodo è l'insieme del nome e dei parametri passati in ingresso
	
	public RettangoloTest2() {
		super();
	}
	
	//Creo adesso il costruttore con firma piena
	public RettangoloTest2(double altezza, double base) {
		
		//this.altezza (fa riferimento alla proprietà di classe) = altezza (fa riferimento al parametro passato al costruttore)
		this.altezza = altezza;
		this.base = base;
	}
	
	public static void main(String[] args) {
		//Utilizzo il costruttore del rettangolo
		RettangoloTest2 rettangolo = new RettangoloTest2(4.2, 7.4);
		
		System.out.println(rettangolo.altezza);
		System.out.println(rettangolo.base);
		
		double area = rettangolo.altezza * rettangolo.base;
		double perimetro = (rettangolo.altezza + rettangolo.base) * 2;
		
		System.out.println("Area = " + area);
		System.out.println("Perimetro = " + perimetro);
	}
}
