package com.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	@Autowired
	private EmployeeDAO e;
	public void add(Employee emp){
		e.add(emp);
	}
	public void delete(Employee emp){
		e.delete(emp);
	}

	public List<Employee> getEmployee() {
		return e.getAllEmployee();
	}
	
	  public void update(Employee emp){
	  	e.update(emp);
	  }
	 /* public void updateD(Employee emp){
		  	e.update(emp);
		  }
	  public void updateS(Employee emp){
		  	e.update(emp);
		  }
	*/
}
