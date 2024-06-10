package com.magnano.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magnano.entities.Capital;

public interface CapitalDAO extends JpaRepository<Capital, String>{

}
