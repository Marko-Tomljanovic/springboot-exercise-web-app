  package com.example.demo.controller.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeSevice {
	List<Employee> getAllEmployees();	 
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id); 

}
