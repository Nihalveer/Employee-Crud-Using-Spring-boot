package com.example.employee.service_I;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.employee.Entity.Employee;

public interface ServiceEmp_I {

	Employee addemp(Employee em);

	List<Employee> getEmp();

	Employee Updateemp(int id,Employee e);

	
	void deleteById(int id);

}
