package com.example.employee._Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.employee.Entity.Employee;
import com.example.employee.Repository.EmpRepository;
import com.example.employee.service_I.ServiceEmp_I;

@Service
public class ServiceEmp_Impl implements ServiceEmp_I {
	@Autowired
	EmpRepository emprepo;

	@Override
	public Employee addemp(Employee em) {
		// TODO Auto-generated method stub
		return emprepo.save(em);
	}
	
	@Override
	public Employee Updateemp(int id,Employee e) {

      Employee er=emprepo.findById(e.getId()).get();
      er.setDept(e.getDept());
      er.setEname(e.getEname());
		return emprepo.save(e);
	}
	@Override
	public List<Employee> getEmp() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}
	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		emprepo.deleteById(id);;
	}



	

	
}
