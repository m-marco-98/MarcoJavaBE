package esercitazione1;

public class Esercizio1 {

	public static void main(String[] args) {
		
		String Nome = "Gianfranco";
		
		int lunghezza = Nome.length();
		
		//Lato superiore
		System.out.print("+");
		for (int i = 2; i < lunghezza+4; i++) {
			if (i%2 == 0) {
				System.out.print(" ");
			} else {
				System.out.print("-");
			}
		}
		System.out.println("+");
		
		
		System.out.println("| "+Nome+" |");
		
		//Lato inferiore
		System.out.print("+");
		for (int i = 2; i < lunghezza+4; i++) {
			if (i%2 == 0) {
				System.out.print(" ");
			} else {
				System.out.print("-");
			}
		}
		System.out.println("+");

	}

}
