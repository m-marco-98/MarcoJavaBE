package com.magnano.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magnano.entities.Playlist;

public interface PlaylistDAO extends JpaRepository<Playlist, Integer>{

}
