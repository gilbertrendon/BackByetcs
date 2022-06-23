package com.employe.crudel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employe.crudel.model.Employee;
import com.employe.crudel.services.CrudService;

@RestController
public class CrudRestController {
	@Autowired
	private CrudService service;
	
	@GetMapping ("/getemployeelist")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Employee> fetEmployeeList(){
		List<Employee> employees = new ArrayList<Employee>();
		employees = service.fetchuserList();
		return employees;
	}
}
 