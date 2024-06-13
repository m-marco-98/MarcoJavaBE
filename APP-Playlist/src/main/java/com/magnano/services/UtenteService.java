package com.magnano.services;


import com.magnano.entities.Utente;

public interface UtenteService {
	
	Utente getUtenteById(int id);
	Utente addUtente(Utente u);
	Utente getUtenteByLogin(String username, String password);

}


