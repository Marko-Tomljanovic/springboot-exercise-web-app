package com.example.demo.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.cache.ICache;

import com.example.demo.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeSevice employeeSevice;

	// prikaz liste Employee
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployees", employeeSevice.getAllEmployees());
		return "index";
	}

	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model) {
		Employee employee = new Employee();
		employee.setFirstName("Marko");
		model.addAttribute("employee", employee);
		return "new_employee";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeSevice.saveEmployee(employee);
		return "redirect:/";

	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

		Employee employee = new Employee();
		employee = employeeSevice.getEmployeeById(id);
		/*
		 * employee.setFirstName("Horvat"); employee.setLastName("Horvatiničić");
		 * employee.setEmail("horvath@gmail.com");
		 */

		model.addAttribute("employee", employee);
		return "update_employee";
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable (value = "id") long id) {
		
		this.employeeSevice.deleteEmployeeById(id);
		return "redirect:/";
		
	}
	
}
