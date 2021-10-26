package com.example.demo.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirmeController {
	
	@Autowired
	private FirmeService firmeService; 
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listFirme", firmeService.getAllFirme());
		return "index";
	}

}
