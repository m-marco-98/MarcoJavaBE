package controller;

import java.util.ArrayList;

import model.Barca;
import model.Cliente;

public class GestioneBarcheCtrl {
	
	ArrayList<Barca> barcaCtrl = new ArrayList<Barca>();
	
	ArrayList<Cliente> clienteCtrl = new ArrayList<Cliente>();
	
	public void aggiungiBarca(int cilindrata, String modello, int posti, double prezzo) {
		Barca b = new Barca();
		b.setCilindrata(cilindrata);
		b.setModello(modello);
		b.setPrezzo(prezzo);
		b.setPosti(posti);
		b.setStato(0);
		b.setMatricola();	
		barcaCtrl.add(b);
	}
	
	public ArrayList<Barca> getListaBarche() {
		
		return barcaCtrl;
	}
	
	
	public void aggiungiCliente(String nome, String cognome, String numTelefono) {
		Cliente c = new Cliente();
		c.setNome(nome);
		c.setCognome(cognome);
		c.setNumTelefono(numTelefono);
		clienteCtrl.add(c);
	}
	
}
