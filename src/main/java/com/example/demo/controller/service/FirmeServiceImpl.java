package com.example.demo.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Firme;
import com.example.demo.repository.FirmeRepository;

public class FirmeServiceImpl implements FirmeService{
	
	@Autowired
	private FirmeRepository firmeRepository;

	@Override
	public List<Firme> getAllFirme() {
		
		return firmeRepository.findAll();
	}
	
	

}
