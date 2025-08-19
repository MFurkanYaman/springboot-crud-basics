package com.myaman.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myaman.model.Employee;
import com.myaman.model.UpdateEmployeeRequest;
import com.myaman.repository.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployeesList(){
		// burada aslında aynı zamanda kontroller yapacaksın 
		
		
		return employeeRepository.getAllEmployeeList();
	}
	
	public Employee getEmployeebyId(String id) {
		return employeeRepository.getEmployeeById(id);
	}
	
	public List<Employee> getEmployeeWithParams(String firstName, String lastName){
		
		return employeeRepository.getEmployeeWithParams(firstName, lastName);
	}
	
	public Employee saveEmployee(Employee newEmployee) {
		return employeeRepository.saveeEmployee(newEmployee);
		
	}
	
	public boolean deleteEmployee(String id) {
		return employeeRepository.deleteEmployee(id);
	}
	
	public Employee updateEmployee(String id, UpdateEmployeeRequest request) {
		return employeeRepository.updateEmployee(id, request);
	}

}
