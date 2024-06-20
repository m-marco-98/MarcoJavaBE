package com.magnano.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magnano.entities.Canzone;
import com.magnano.services.CanzoneService;

@RestController
@RequestMapping("api")
public class CanzoneREST {
	
	@Autowired
	private CanzoneService service;
	
	@GetMapping("canzoni")
	@CrossOrigin
	public List<Canzone> getListaCanzoni (){
		return service.getListaCanzoni();
	}
	
	@GetMapping("canzone")
	public Canzone getCanzoneById(int id) {
		// TODO Auto-generated method stub
		return service.getCanzoneById(id);
	}
	
	@GetMapping("canzone/titolo/{titolo}")
	public List<Canzone> getListaCanzoniByTitolo(@PathVariable String titolo) {
		// TODO Auto-generated method stub
		return service.getListaCanzoniByTitolo(titolo);
	}
	
	@GetMapping("canzone/artista/{artista}")
	public List<Canzone> getListaCanzoniByArtista(@PathVariable String artista) {
		// TODO Auto-generated method stub
		return service.getListaCanzoniByArtista(artista);
	}
	
	@GetMapping("canzone/genere/{genere}")
	public List<Canzone> getListaCanzoniByGenere(@PathVariable String genere) {
		// TODO Auto-generated method stub
		return service.getListaCanzoniByGenere(genere);
	}
}
