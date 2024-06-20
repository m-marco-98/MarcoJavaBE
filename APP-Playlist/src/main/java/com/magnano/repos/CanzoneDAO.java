package com.magnano.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.magnano.entities.Canzone;
import java.util.List;

@Repository
public interface CanzoneDAO extends JpaRepository<Canzone, Integer> {
	
	List<Canzone> findByTitolo(String titolo);
	List<Canzone> findByArtista(String artista);
	List<Canzone> findByGenere(String genere);
	
}
