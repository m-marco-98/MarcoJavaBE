package com.magnano.services;

import java.util.List;

import com.magnano.entities.Playlist;
import com.magnano.repos.PlaylistDAO;

public class PlaylistServiceImpl implements PlaylistService {

	private PlaylistDAO dao;
	
	@Override
	public List<Playlist> getListaPlaylist() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Playlist getPlaylistByNome(int id) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(id);
	}

	@Override
	public Playlist addPlaylist(Playlist p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}
	
	

}
