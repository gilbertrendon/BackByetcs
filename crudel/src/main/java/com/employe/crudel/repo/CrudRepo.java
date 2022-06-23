package com.employe.crudel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employe.crudel.model.Employee;

public interface CrudRepo extends JpaRepository<Employee, Integer>{

}
