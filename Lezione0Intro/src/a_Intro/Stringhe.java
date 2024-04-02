package a_Intro;

public class Stringhe {

	public static void main(String[] args) {

		String benvenuto = "Ciao benvenuto nell'up";
		
	    //possono anche dichiarare una stringa utilizzando il suo costruttore
	
	
		String s1 = new String("Ciao utente");
		
		int s1Length = s1.length();
		 
		System.out.println("La stringa s1 ha " + s1Length + " caratteri");
		
		//replace
		
		String frase = "Il miglior browser al mondo è Edge!";
		String fraseVera = frase.replaceAll("Edge", "Chrome");
		
	}

}
