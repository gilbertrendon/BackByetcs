package com.employe.crudel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employe.crudel.model.Employee;
import com.employe.crudel.repo.CrudRepo;

@Service
public class CrudService {
	@Autowired
	private CrudRepo repo;
	public List<Employee> fetchuserList(){
		return repo.findAll();
	}
}
