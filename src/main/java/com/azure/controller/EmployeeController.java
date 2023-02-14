/**
 * 
 */
package com.azure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.azure.entity.Employee;
import com.azure.repository.EmployeeRepository;

/**
 * @author jbhogapurapu
 *
 */
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping(path = "/new")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
		
	}
	
	@GetMapping(path = "/employees")
	public List<Employee> getEmployees(){
		return employeeRepository.findAll();
	}
}