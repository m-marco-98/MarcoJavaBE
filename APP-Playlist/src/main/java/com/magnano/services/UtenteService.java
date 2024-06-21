package com.magnano.services;


import com.magnano.entities.Utente;

public interface UtenteService {
	
	Utente findUtenteById(Integer id);
	Utente addUtente(Utente u);
	Utente getUtenteByLogin(String username, String password);

}


