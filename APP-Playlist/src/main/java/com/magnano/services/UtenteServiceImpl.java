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
	public Utente findUtenteById(Integer id) {
//		return dao.getById(id);
		return dao.getReferenceById(id);
	}

	@Override
	public Utente addUtente(Utente u) {
	
		return dao.save(u);
	}

	@Override
	public Utente getUtenteByLogin(String username, String password) {
		return dao.getUtenteByLogin(username, password);
	
	}
	
	

}
