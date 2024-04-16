package d_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelloArrayList {

	public static void main(String[] args) {


		ArrayList<String> animali = new ArrayList<String>();
		
		animali.add("Cane");
		animali.add("Gatto");
		animali.add("Canarino");
		animali.add("Squalo");
		
//		//Per richiamare un elemento uso il metodo.get(indice)
//		
//		System.out.println(animali.get(0));
//		System.out.println(animali.get(2));
//
//		//L'arrayList è scalabile
//		
//		animali.remove(2); //gli altri elementi cambiano di posizione
//		
//		//Per conoscere la misura dell'arraylist uso .size()
//		
//		System.out.println("Il mio array è composto da" +animali.size());
//		
//		
//		for (int i = 0; i < animali.size(); i++) {
//		
//			System.out.println(animali.get(i));
//			
//		}
//		
//		animali.add("Delfino");
//		animali.add("Struzzo");
//		
//		System.out.println("///////////");
//		for (String animale : animali) {
//			System.out.println(animale);
//		}
//		
//		//Faccio un arrayList di numeri
//		//nell'operatore diamond del costruttore dell'array posso anche non dichiarare nulla
//		ArrayList<Integer> voti = new ArrayList<>();
//		voti.add(10);
//		voti.add(5);
//		voti.add(12);
//		voti.add(1);
//		
//		for (Integer voto : voti) {
//			System.out.println(voto);
//		}
//		
//		//Per creare un array list posso far riferimento al tipo list
//		List<String> parole = new ArrayList<>();
//		parole.add("Ciao");
//		parole.add("Come");
//		parole.add("Stai");
//		
//		for (String parola : parole ) {
//			System.out.println(parola);
//		}
//		
//		//Popolamento dell'array tramite il metodo asList
//		List<String> nomi = new ArrayList<>(
//				Arrays.asList("Dario", "Luisa", "Pasquale", "Gennaro", "Anna", "Luca"));
//		
//		for (String nome : nomi) {
//			System.out.println(nome);
//		}
//		
		//Creare un array partendo da un arrayList
		
		List<String> colori = new ArrayList<>();
		colori.add("Rosso");
		colori.add("Giallo");
		colori.add("Blu");
		colori.add("Verde");
		colori.add("Rosa");
		colori.add("Bianco");
		colori.add("Nero");
		
		String coloriPR[] = new String[colori.size()];
		
		//Uso un ciclo for per caricare l'array con gli elementi dell'arrayList
		
		for(int i = 0; i < colori.size(); i++) {
			coloriPR[i] = colori.get(i);
		}
		
		for(int i = 0; i < colori.size(); i++) {
			System.out.println(coloriPR[i]);
		}
		
		//Ordina al contrario
		Collections.reverse(colori);
		
		System.out.println();
		
		for(String colorePR : colori) {
			
			System.out.println(colorePR);
		}
		
		
/////////////////////////////////////////////////////////////////				
	}

}
