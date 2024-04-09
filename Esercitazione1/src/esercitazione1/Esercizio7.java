package esercitazione1;

public class Esercizio7 {

	public static void main(String[] args) {
		
		double casuale = Math.random()*7;
		int giornoCasuale = (int) Math.ceil(casuale);
		
		System.out.println(giornoCasuale);
		
		String giorno = "";
		switch (giornoCasuale) {
		
		case(1):
			giorno = "Lunedì";
		break;
		case(2):
			giorno = "Martedì";
		break;
		case(3):
			giorno = "Mercoledì";
		break;
		case(4):
			giorno = "Giovedì";
		break;
		case(5):
			giorno = "Venerdì";
		break;
		case(6):
			giorno = "Sabato";
		break;
		case(7):
			giorno = "Domenica";
		break;
		}
		
		System.out.println("è "+giorno);
	}

}
