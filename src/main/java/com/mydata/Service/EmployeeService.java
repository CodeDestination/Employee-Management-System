package com.mydata.Service;

import java.util.List;

import com.mydata.model.Employee;

public interface EmployeeService {
	
	//save employee in db
	
	Employee saveEmployee(Employee employee);
	
	//for view all employee
	public List<Employee>viewallemployee();
	
	Employee getemployeebyid(int id);
	
	void deletebyid(int id);
	
	Employee updateemployee(int id,Employee employee);

}
