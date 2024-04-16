package a_classeIntro;

public class RettangoloTest {

	//Dichiaro degli attributi all'interno della mia classe
	//Queste sono proprietà di classe:
	int base;
	int altezza;
	
	
	
	public static void main(String[] args) {
		
		//Qui posso costruire l'oggetto rettangoloTest utilizzando la parola chiave new
		
		//ATTENZIONE: Quando uso la parola chiave new sto facendo uso del "costuttore di default"
	    //I costruttori hanno lo stesso nome della classe
		
		//Creo un nuovo oggetto chiamato "rettangolo" istanza della classe RettangoloTest
		
		RettangoloTest rettangolo = new RettangoloTest();
		
		//Per poter dare un valore alle proprietà del rettangolo utilizzo la notazione "punto" = .
		rettangolo.altezza = 5;
		rettangolo.base = 6;
		
		int area = rettangolo.altezza * rettangolo.base;
		int perimetro = (rettangolo.altezza + rettangolo.base) * 2;
		
		System.out.println("L'altezza vale: " + rettangolo.altezza);
		System.out.println("La base vale: " + rettangolo.base);
		System.out.println("L'area vale: " + area);
		System.out.println("Il perimetro vale: " + perimetro);
		
		//RettangoloTest è il nostro nuovo tipo. Stiamo defininedo il tipo dell'oggetto
		//Istanzio un nuovo oggetto di tipo rettangoloTest
		RettangoloTest rettangolo2 = new RettangoloTest();
		
		rettangolo2.base = 4;
		rettangolo2.altezza = 8;
		
		int area2 = rettangolo2.base * rettangolo2.altezza;
		
		System.out.println("L'area del rettangolo2 vale: " + area2);
		
	    
	}
}
