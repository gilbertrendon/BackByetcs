package com.employe.crudel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employe.crudel.model.Employee;
import com.employe.crudel.model.Work;
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
	
	@PostMapping ("/addemployee")
	@CrossOrigin(origins = "http://localhost:4200")
	public Employee saveEmployee(@RequestBody Employee employee){
		return service.saveEmployeeToDB(employee);
	}
	
	@GetMapping ("/getemployeebyid/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Employee fetEmployee(@PathVariable int id){
		return service.fetchEmployeeById(id).get();
	}
	
	@PostMapping ("/deleteemployeebyid/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public String deleteEmployeebiId(@PathVariable int id){
		return service.deleteEmployeeById(id);
	}
	
	//Para lo referente a las works
	@GetMapping ("/getworklist")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Work> fetWorkList(){
		List<Work> works = new ArrayList<Work>();
		works = service.fetchworkList();
		return works;
	}
	
	@PostMapping ("/addwork")
	@CrossOrigin(origins = "http://localhost:4200")
	public Work saveWork(@RequestBody Work work){
		System.out.println("************************************************");
		System.out.println(work);
		return service.saveWorkToDB(work);
	}
	
	@DeleteMapping ("/deleteworkbyid/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public String deleteWorkbyId(@PathVariable int id){
		return service.deleteWorkById(id);
	}
	
	
	
}
 