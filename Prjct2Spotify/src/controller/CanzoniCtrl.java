package controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import model.Canzone;

public class CanzoniCtrl {
	
	public ArrayList<Canzone> canzoni;
	
	public CanzoniCtrl() {
		this.canzoni = new ArrayList<Canzone>();
	}
	
	//Costruisco un metodo per caricare le canzoni manualmente
	
	public void caricaCanzoniAMano() {
		String raccolta[] = {
				"Starway To Heaven;Led Zeppelin",
				"Una vita spericolata;Vasco Rossi",
				"Stai Zitto;Salmo",
				"Paradise City;Guns and Roses",
				"Kind of Blue;Miles Davis",
				"Acido;Prozac+",
				"Servi della gleba;EELST",
				"Cornutone;Squallor",
				"Bocca di rosa;De Andrè",
				"Gelato al cioccolato;Pupo"
		};
		
		for (String song : raccolta) {
			String separate[] = song.split(";");
			String titolo = separate[0];
			String cantante = separate[1];
			Canzone canzone = new Canzone(titolo,cantante);
			this.canzoni.add(canzone);
		}
	}
	
	
	public void caricaCanzoniDaFile() {
		File fileDB = new File("./canzoni.csv");
			
		try {
			Scanner sc = new Scanner(fileDB);
				
			while(sc.hasNextLine()) {
				String riga = sc.nextLine();
				String separate[] = riga.split(";");
				String titolo = separate[0];					
				String cantante = separate[1];
				Canzone canzone = new Canzone(titolo,cantante);
				this.canzoni.add(canzone);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
}


