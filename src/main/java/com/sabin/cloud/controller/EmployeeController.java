package com.sabin.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sabin.cloud.entity.Employee;
import com.sabin.cloud.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired 
	private EmployeeService employeeService; 
	
	//to add the employee
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	//to get employee
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
	}
	
	//to update the employee
	
	@PutMapping("/{id}")
	
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		employee.setId(id);
		return employeeService.updateEmployee(employee);
	}
	
	
	//delete employee
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return employeeService.deleteEmployee(id);
	}
	
}
