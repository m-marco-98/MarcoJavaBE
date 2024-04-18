package model;

public class BloccoNote {
	
	public String nome = "Blocco Note di Marco";
	Nota[] elencoNote = new Nota[10];
	
	public void addNota(String titolo, String descrizione, int posizione) {
		Nota n = new Nota(titolo, descrizione);
		
		elencoNote[posizione] = n;
		
	}
	
	public void stampaBloccoNote() {
		
		for (int i = 0; i < elencoNote.length; i++) {
			if (elencoNote[i] != null) {
				System.out.println(elencoNote[i].stampaNota());
			}
		}
	}
	
////////////////////////////////////////////////////////	
}
