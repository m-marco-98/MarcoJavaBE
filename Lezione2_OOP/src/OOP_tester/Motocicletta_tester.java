package OOP_tester;

import OOP_model.Motocicletta;

public class Motocicletta_tester {

	public static void main(String[] args) {
		
		//Non posso usare il costruttore di default poichè non è stato dichiarato nella classe
		//e ne è presente uno diverso da quello di default
//		Motocicletta moto1 = new Motocicletta();
		
		Motocicletta moto1 = new Motocicletta("Z750", 749);
		Motocicletta moto2 = new Motocicletta("Ninja", 1000);
		Motocicletta moto3 = new Motocicletta("Z800", 799);
		
		System.out.println(moto1.toString());

		//Essendo la classe model e la classe tester in due package diversi tutto ciò
		//che non è definito come public (modificatore d'accesso) non è visibile alle classi al di fuori
		//dello stesso package: esempio i metodi sono stati definiti come public, quindi sono visibili in tutto il progetto
		//le proprietà portano come modificatore d'accesso default (appunto il modificatore di default se non specificato),
		//e per questo sono visibili solamente all'interno dello stesso package
		
		System.out.println(moto2.toString());
		System.out.println(moto3.toString());
		
	}

}
