package com.myaman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myaman.model.Employee;
import com.myaman.model.UpdateEmployeeRequest;
import com.myaman.services.EmployeeService;

@RestController
@RequestMapping("rest/api/employee") // dışarıdan gelen tüm isteklerde kök adres tanımlaması
public class RestEmployeeController { // Dışarıdan postmanden istek atıldığında karşılayacak method

	@Autowired // rest controllerdan service katmanına gitmek için contexte oluşan beani alıp
				// enjekte ediyorum.

	private EmployeeService employeeService;

	@GetMapping(path = "/list")
	public List<Employee> getAllEmployeeList() {

		return employeeService.getAllEmployeesList();

	}

	@GetMapping(path = "/list/{id}")
	public Employee getEmployeeById(@PathVariable(name = "id", required = true) String id) {
		return employeeService.getEmployeebyId(id);
	}

	@GetMapping(path = "/with-params")
	public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName", required = false) String firstName,
			@RequestParam(name = "lastName", required = false) String lastName) {

		return employeeService.getEmployeeWithParams(firstName, lastName);
	}

	@PostMapping(path = "/save-employee")
	public Employee saveEmployee(@RequestBody Employee newEmployee) {
		return employeeService.saveEmployee(newEmployee);
	}

	@DeleteMapping(path = "/delete-employee/{id}")
	public boolean deleteEmployee(@PathVariable(name = "id") String id) {

		return employeeService.deleteEmployee(id);

	}
	
	@PutMapping(path="/update-employee/{id}")
	public Employee updatEmployee(@PathVariable(name = "id") String id, @RequestBody UpdateEmployeeRequest request) {

		return employeeService.updateEmployee(id, request);
	}

}
