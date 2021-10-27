package com.example.demo.controller.service;

import java.util.List;  
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Firme;
import com.example.demo.repository.FirmeRepository;

@Service
public class FirmeServiceImpl implements FirmeService{
	
	@Autowired
	private FirmeRepository firmeRepository;

	@Override
	public List<Firme> getAllFirme() {
		
		return firmeRepository.findAll();
	}

	@Override
	public Firme getFirmeById(long id) {
	Optional<Firme> optional = firmeRepository.findById(id);
	Firme firme = null;
	if(optional.isPresent()) {
		firme = optional.get();
	}else {
		throw new RuntimeException("Firma nije pronađena!");
	}
		return firme;
	}

}
