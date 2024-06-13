package com.magnano.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magnano.entities.Canzone;
import java.util.List;


public interface CanzoneDAO extends JpaRepository<Canzone, Integer> {
	
	List<Canzone> findByTitolo(String titolo);
	List<Canzone> findByArtista(String artista);
	List<Canzone> findByGenere(String genere);
	
}
