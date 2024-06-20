package com.magnano.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.magnano.entities.Utente;

import com.magnano.repos.UtenteDAO;

@Service
public class UtenteServiceImpl implements UtenteService {
	
	@Autowired
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
		Utente utente = new Utente();
		
		dao.getUtenteByLogin(username, password);
		
		return utente;
	}
	
	

}
