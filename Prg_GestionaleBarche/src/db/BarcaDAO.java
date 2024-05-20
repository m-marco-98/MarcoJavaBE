package db;

import java.util.ArrayList;

import model.Barca;

public interface BarcaDAO {
	
	String FIND_ALL = "SELECT * FROM Barche";
	String ADD_BARCA = "INSERT INTO Barche (Cilindrata, Posti, Prezzo, Modello, Stato, Matricola) VALUES (?,?,?,?,?,?)";
	
	ArrayList<Barca> getBarche();
	
	void addBarca(Barca b);
}
