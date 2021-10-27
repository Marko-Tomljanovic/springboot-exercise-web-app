package com.example.demo.controller.service;


import java.util.List;

import com.example.demo.model.Firme;

public interface FirmeService {
	List<Firme> getAllFirme();
	Firme getFirmeById(long id);
}
