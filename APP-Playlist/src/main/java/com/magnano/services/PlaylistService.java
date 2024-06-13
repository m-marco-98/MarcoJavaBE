package com.magnano.services;

import java.util.List;

import com.magnano.entities.Playlist;

public interface PlaylistService {
	
	List<Playlist> getListaPlaylist();
	//List<Canzone> getPlaylistByName(int id);
	Playlist getPlaylistByNome(int id);
	Playlist addPlaylist(Playlist p);
}
