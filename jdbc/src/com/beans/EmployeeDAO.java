package com.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAO {
	@Autowired
	private JdbcTemplate template;
	public void add(Employee emp)
	{
		template.update("insert into employee values(?,?,?,?)", new Object[] {emp.getEmpId(),emp.getEmpName(),emp.getSalary(),emp.getDesignation()});
	}
	public void delete(Employee emp)
	{
		template.update("delete from Employee WHERE Id=?",new Object[]{emp.getEmpId()});
	}
	public List<Employee> getAllEmployee() {
		List<Employee> list = template.query("select * from employee", new EmployeeRowMapper());
		return list;
	}
	
	 public void update(Employee emp)
	 {
	 template.update("update employee set name=? WHERE id=?",new Object[]{emp.getEmpName(),emp.getEmpId()});
	 template.update("update employee set salary=? WHERE id=?",new Object[]{emp.getSalary(),emp.getEmpId()});
	 template.update("update employee set designation=? WHERE id=?",new Object[]{emp.getDesignation(),emp.getEmpId()});
	 }


		
	}
