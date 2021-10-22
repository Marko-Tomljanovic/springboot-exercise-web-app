package com.example.demo.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeSevice employeeSevice;
	
	//prikaz liste Employee
	@GetMapping("/")
	public String viewHomePage(Model model){
		model.addAttribute("listEmployees", employeeSevice.getAllEmployees());
		return "index";
}

}
