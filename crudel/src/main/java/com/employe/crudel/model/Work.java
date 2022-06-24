package com.employe.crudel.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "")
public class Work {
	@Id
	private int id;
	private String status;
	private String date;
	private int retdays;
	private int empasign;
	
	public Work() {
		
	}
	
	public Work(int id,  String status,
			String date,  int retdays,
			int empAsign) {
		super();
		this.id = id;
		this.status = status;
		this.date = date;
		this.retdays = retdays;
		this.empasign = empAsign;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getRetdays() {
		return retdays;
	}

	public void setRetdays(int retdays) {
		this.retdays = retdays;
	}

	public int getEmpAsign() {
		return empasign;
	}

	public void setEmpAsign(int empAsign) {
		this.empasign = empAsign;
	}
	
	
}
