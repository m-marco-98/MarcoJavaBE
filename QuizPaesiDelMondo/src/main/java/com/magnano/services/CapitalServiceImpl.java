package com.magnano.services;

import java.util.List;

import com.magnano.entities.Capital;
import com.magnano.repos.CapitalDAO;

public class CapitalServiceImpl implements CapitalService{

	private CapitalDAO dao;
	
	@Override
	public List<Capital> getCapital() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Capital getCapitalByName(String capital) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(capital);
	}

}
