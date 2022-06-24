package com.employe.crudel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employe.crudel.model.Employee;
import com.employe.crudel.model.Work;
import com.employe.crudel.repo.CrudRepo;
import com.employe.crudel.repo.CrudRepow;

@Service
public class CrudService {
	@Autowired
	private CrudRepo repo;
	public List<Employee> fetchuserList(){
		return repo.findAll();
	}
	
	//Lista de actividades
	@Autowired
	private CrudRepow repow;
	public List<Work> fetchworkList(){
		System.out.print(repow.findAll());
		return repow.findAll();
	}
	
	public Employee saveEmployeeToDB(Employee employee) 
	{
		return repo.save(employee);
	}
	
	public Optional<Employee> fetchEmployeeById(int id) 
	{
		return repo.findById(id);
	}
	
	public String deleteEmployeeById(int id) 
	{
		String result;
		try {
			repo.deleteById(id);
			result = "employee succesfully deleted";
		} catch (Exception e) {
			// TODO: handle exception
			result = "employee with id is not deleted";
		}
		return result;
	}
	
	//Para crear actividad
	public Work saveWorkToDB(Work work) 
	{
		return repow.save(work);
	}
	
	//Para eliminar actividad
	public String deleteWorkById(int id) 
	{
		String result;
		try {
			repow.deleteById(id);
			result = "work succesfully deleted";
		} catch (Exception e) {
			// TODO: handle exception
			result = "work with id is not deleted";
		}
		return result;
	}
	
	
	
}
