package controller;

import java.util.ArrayList;
import java.util.List;

import db.PokemonDAO;
import db.PokemonDAOimpl;
import model.Pokemon;

public class PokemonCtrl {

	PokemonDAO dao = new PokemonDAOimpl();
	
	public List<String> getTipiPokemon() {
		return dao.getTipiPokemon();
	}
	
	public List<String> getNomiPokemon() {
		List<String> pokemon = new ArrayList<>(); //Costruisco lista
		for (Pokemon p : dao.getAllPokemon()) {
			pokemon.add(p.getNome()); //Riempio lista
		}
		return pokemon; //Restituisco lista
	}
}
