package com.mydata.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydata.Repository.EmployeeRepository;
import com.mydata.model.Employee;

@Service
public class Employeeserviceimpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> viewallemployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getemployeebyid(int id) {
		return employeeRepository.findById(id).get();
	}

	@Override
	public void deletebyid(int id) {
		employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee updateemployee(int id, Employee employee) {
		
		return employeeRepository.save(employee);
	}
	

}
