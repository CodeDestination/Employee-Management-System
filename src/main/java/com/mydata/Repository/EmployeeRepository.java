package com.mydata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydata.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
