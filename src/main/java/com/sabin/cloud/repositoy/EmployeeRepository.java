package com.sabin.cloud.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabin.cloud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
}
