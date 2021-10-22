package com.example.demo.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Employee;

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
	
	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model) {
		Employee employee= new Employee();
		model.addAttribute("employe", employee);
		return "new_employee";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee")Employee employee){
		employeeSevice.saveEmployee(employee);
		return "redirect:/";
		
	}

}
