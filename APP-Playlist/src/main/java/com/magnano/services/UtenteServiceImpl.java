package com.magnano.services;

import org.springframework.stereotype.Service;

import com.magnano.entities.Utente;

import com.magnano.repos.UtenteDAO;

@Service
public class UtenteServiceImpl implements UtenteService {
	
	private UtenteDAO dao;
	@Override
	public Utente getUtenteById(int id) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(id);
	}

	@Override
	public Utente addUtente(Utente u) {
	
		// TODO Auto-generated method stub
		return dao.save(u);
	}

	@Override
	public Utente getUtenteByLogin(String username, String password) {
		return dao.getUtenteByLogin(username, password);
	}
	
	

}
