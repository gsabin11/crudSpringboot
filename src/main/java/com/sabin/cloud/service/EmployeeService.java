package com.sabin.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabin.cloud.entity.Employee;
import com.sabin.cloud.repositoy.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//here i have to write all the logic for bussiness 
	
	//save employee
	
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	//get employee
	
	public Employee getEmployee(int id) {
		return employeeRepository.findById(id).get();
	}
	
	//update employee
	public Employee updateEmployee(Employee employee) {
	Employee empUpdate = employeeRepository.findById(employee.getId()).get();
	empUpdate.setName(employee.getName());
	empUpdate.setAge(employee.getAge());
	return employeeRepository.save(empUpdate);
	
	}
	
	//delete employee
	 public String deleteEmployee(int id) {
		 employeeRepository.deleteById(id);
		 return "Entity deleted "+id;
	 }

}
