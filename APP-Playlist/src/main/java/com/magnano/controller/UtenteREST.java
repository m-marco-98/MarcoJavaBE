package com.magnano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	public Utente findUtenteById(@PathVariable Integer id) {
		
		Utente utente = service.findUtenteById(id);
		return utente;
	}
	
	@PostMapping("utente")
	public Utente addUtente(@RequestBody Utente user) {
		return service.addUtente(user);
	}
	
	@GetMapping("utente/login/{username}&{password}")
	@ResponseBody
	@CrossOrigin
	public Utente getUtenteByLogin(@PathVariable String username, @PathVariable String password) {
		return service.getUtenteByLogin(username, password);
	}
	
		
}
