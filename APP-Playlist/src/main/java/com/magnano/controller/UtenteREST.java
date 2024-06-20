package com.magnano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.magnano.entities.Utente;
import com.magnano.services.UtenteService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api")
public class UtenteREST {
	 
	@Autowired
	private UtenteService service;
	
	@GetMapping("utente/{id}")
	public Utente getUtenteById(int id) {
		return service.getUtenteById(id);
	}
	
	@PostMapping("utente")
	public Utente addUtente(@RequestBody String user) {
		
		Utente utente = new Utente();
		utente.setNome(user);
		utente.setCognome(user);
		utente.setEmail(user);
		utente.setPassword(user);
		utente.setUsername(user);
		return service.addUtente(utente);
	}
	
	@GetMapping("utente/login")
	@CrossOrigin
	public Utente getUtenteByLogin(String username, String password) {
		
		return service.getUtenteByLogin(username, password);
	}
	
		
}
