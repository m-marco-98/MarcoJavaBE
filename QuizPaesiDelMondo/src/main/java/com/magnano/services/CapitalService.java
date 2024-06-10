package com.magnano.services;

import java.util.List;

import com.magnano.entities.Capital;

public interface CapitalService {
	List<Capital> getCapital();
	Capital getCapitalByName(String capital);

}
