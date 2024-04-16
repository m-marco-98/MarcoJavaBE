package a_esercitazione;

import java.util.Scanner;

//Crea una classe calcolatrice con le seguenti proprietà:
//-primoNumero: double
//-secondoNumero: double

//con i seguenti metodi
//-calcolaSomma
//-calcolaDifferenza
//-calcolaProdotto
//-calcolaQuoziente

//-calcola(primoNumero, secondoNumero, operatore)
//Descrivere con un tooString() l'oggetto calcolatrice

public class Calcolatrice {

	double primoNumero;
	double secondoNumero;
	String operatore;
	
	public Calcolatrice(double primoNumero, double secondoNumero) {
		super();
		this.primoNumero = primoNumero;
		this.secondoNumero = secondoNumero;
	}
	
	
	public double eseguiSomma() {
		double somma = this.primoNumero + this.secondoNumero;
		return somma;
	}
	
	public double eseguiDifferenza() {
		double differenza = this.primoNumero - this.secondoNumero;
		return differenza;
	}
	
	public double eseguiProdotto() {
		double prodotto = this.primoNumero * this.secondoNumero;
		return prodotto;
	}
	
	public double eseguiQuoziente() {
		double quoziente = this.primoNumero / this.secondoNumero;
		return quoziente;
	}
	
	public double calcola(char operatore) {
		
		double operazione;
		
		if (operatore == '+') {
			
			operazione = eseguiSomma();
		
		} else if (operatore == '-')  {
		
			operazione = eseguiDifferenza();
		
		} else if (operatore == '*')  {
		
			operazione = eseguiProdotto();
		
		} else if (operatore == '/')  {
		
			operazione = eseguiQuoziente();
		}
		else {
			operazione = 0;
		}
		return operazione;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci due numeri");
		
		double primoNumero = input.nextDouble();
		double secondoNumero = input.nextDouble();
		
		Calcolatrice calcolo = new Calcolatrice(primoNumero,secondoNumero);
		
		System.out.println("Somma = " + calcolo.eseguiSomma());
		System.out.println("Differenza" + calcolo.eseguiDifferenza());
		System.out.println("Prodotto" + calcolo.eseguiProdotto());
		System.out.println("Quoziente" + calcolo.eseguiQuoziente());
		
		System.out.println("\n///////////////////\n");
		
		System.out.println("Somma"+ calcolo.calcola('+'));
		System.out.println("Differenza" + calcolo.calcola('-'));
		System.out.println("Prodotto" + calcolo.calcola('*'));
		System.out.println("Quoziente" + calcolo.calcola('/'));
		
	}
	
	
}


