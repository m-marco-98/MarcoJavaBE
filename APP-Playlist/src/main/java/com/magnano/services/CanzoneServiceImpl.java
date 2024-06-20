package com.magnano.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magnano.entities.Canzone;
import com.magnano.repos.CanzoneDAO;

@Service
public class CanzoneServiceImpl implements CanzoneService {
	
	@Autowired
	private CanzoneDAO dao;

	@Override
	public List<Canzone> getListaCanzoni() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Canzone getCanzoneById(int id) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(id);
	}

	@Override
	public List<Canzone> getListaCanzoniByTitolo(String titolo) {
		// TODO Auto-generated method stub
		return dao.findByTitolo(titolo);
	}

	@Override
	public List<Canzone> getListaCanzoniByArtista(String artista) {
		// TODO Auto-generated method stub
		return dao.findByArtista(artista);
	}

	@Override
	public List<Canzone> getListaCanzoniByGenere(String genere) {
		// TODO Auto-generated method stub
		return dao.findByGenere(genere);
	}

}
