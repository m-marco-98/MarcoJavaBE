package view;

import java.util.ArrayList;

import controller.CanzoniCtrl;
import model.Canzone;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CanzoniCtrl database = new CanzoniCtrl();
		database.caricaCanzoniAMano();
		
		System.out.println("Stampo tutte le canzoni");
		
		ArrayList<Canzone> tutteCanzoni = database.canzoni;
		for (Canzone canzone : tutteCanzoni) {
			System.out.println(canzone.titolo + " - " + canzone.cantante);
		}
	}

}
