package com.myaman.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.myaman.model.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	public List<Employee> employeeList()
	{
		List<Employee> employeeList=new ArrayList<>();
		employeeList.add(new Employee("1","Metin","Yaman"));
		employeeList.add(new Employee("2","Furkan","Yaman"));
		employeeList.add(new Employee("3","Ali","Yıldız"));
		employeeList.add(new Employee("4","Can","Korkmaz"));
		employeeList.add(new Employee("5","Yasin","Gül"));
		
		return employeeList;



		
	}
}
