package a_Intro;

public class HelloWord {

	public static void main(String[] args) {
		
		//dichiaro e assegno delle variabili
		
		String mioNome = "Marco";
		String mioCognome = "Magnano";
		
		int eta = 35;
		
		var istituto = "Immaginazione e Lavoro";
		istituto = "Lavoro e Immaginazione";
		
		//Dichiaro
		String corso;
		
		//Assegno un valore
		corso = "Java Back End";
		
		String saluto = "Ciao " + mioNome + " " + mioCognome + " hai " + eta +
				"\nfrequenti il corso " + corso + " presso " + istituto;
		
		
		System.out.println(saluto);

	}

}
