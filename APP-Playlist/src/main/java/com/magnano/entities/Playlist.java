package com.magnano.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "playlist"  )
public class Playlist {
	
	private int id_canzone;
	private int id_utente;
	
	//Getters and setters
	public int getId_canzone() {
		return id_canzone;
	}
	public void setId_canzone(int id_canzone) {
		this.id_canzone = id_canzone;
	}
	public int getId_utente() {
		return id_utente;
	}
	public void setId_utente(int id_utente) {
		this.id_utente = id_utente;
	}	
	
	
}
