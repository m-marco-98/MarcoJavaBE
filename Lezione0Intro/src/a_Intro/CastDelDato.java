package a_Intro;

public class CastDelDato {

	public static void main(String[] args) {
		
		//public = modificatore d'accesso
		
		int num1 = 52;
		int num2 = 24;
		
		
		int somma = num1 + num2;
		System.out.println("La somma vale " + somma);
	
		int differenza = num1 -num2;
		System.out.println("La differenza vale " + differenza);
		
		int prodotto = num1 * num2;
		System.out.println("Il prodotto vale " + prodotto);
		
		double quoziente = (double) num1 / num2;
		System.out.println("Il quoziente vale " + quoziente);
		
		int restoDiv = num1 % num2;
		System.out.println("Il resto vale " + restoDiv);
		
		//uso della classe Math
		
		double valore = 3.99999999;
		
		//Math.round() arrotonda all'intero superiore o inferiore
		long valoreArrotondato = Math.round(valore);		
		System.out.println("Il valore arrotondato è " + valoreArrotondato);

		int numNeg = -47;
		int numNegAbs = Math.abs(numNeg);
		System.out.println(numNegAbs);
		
		double numRand = Math.random() * 10;
		int intSup = (int)Math.ceil(numRand);
		
		System.out.println(numRand);
		System.out.println(intSup);
	}

}
