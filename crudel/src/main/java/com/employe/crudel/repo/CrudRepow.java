package com.employe.crudel.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employe.crudel.model.Work;

public interface CrudRepow extends JpaRepository<Work, Integer>{

}
