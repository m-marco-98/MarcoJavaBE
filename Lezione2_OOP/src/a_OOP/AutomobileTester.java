package a_OOP;

public class AutomobileTester {

	public static void main(String[] args) {
		//classe tester = posso generare qui gli oggetti di classe automobile definita nella classe Automobile
		//utilizzando uno dei quattro costruttori definiti
		
		//Utilizzo il costruttore di default
		Automobile auto1 = new Automobile();
		
		System.out.println(auto1.marca); //Varrà "Fiat" poichè è stat definita già nella classe
		System.out.println(auto1.cilindrata); //Varrà 0 poichè non è stata definita
		
		auto1.cilindrata = 1200;
		System.out.println(auto1.cilindrata);
		
		//Utilizzo il costruttore con marca, modello e cilindrata
		
		Automobile auto2 = new Automobile("Opel", "Astra", 1600);
		
		System.out.println(auto2.marca);
		
		Automobile auto3 = new Automobile("Peugeot", "2008", 1200, (byte) 2, false);
		
		System.out.println(auto3.toString());
		

	}

}
