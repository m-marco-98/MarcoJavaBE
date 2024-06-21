package com.magnano.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.magnano.entities.Utente;

public interface UtenteDAO extends JpaRepository<Utente, Integer> {
	
	@Query(value = "select * from utenti where username = ? and password = ?", nativeQuery = true)
	Utente getUtenteByLogin(String username, String password);
	
	

}
