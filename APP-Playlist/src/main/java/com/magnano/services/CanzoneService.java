package com.magnano.services;

import java.util.List;

import com.magnano.entities.Canzone;

public interface CanzoneService {
	
	List<Canzone> getListaCanzoni();
	Canzone getCanzoneById(int id);
	List<Canzone> getListaCanzoniByTitolo(String titolo);
	List<Canzone> getListaCanzoniByArtista(String artista);
	List<Canzone> getListaCanzoniByGenere(String genere);

}
