package com.example.employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.Entity.Employee;
import com.example.employee.service_I.ServiceEmp_I;

@RestController
@RequestMapping("/project")
public class HomeController {

	@Autowired
	ServiceEmp_I serviceemp;
	
	@PostMapping("/addemp")
	public ResponseEntity<Employee> addemp(@RequestBody Employee em)
	{
		Employee e1=serviceemp.addemp(em);
		return new ResponseEntity<>(e1,HttpStatus.CREATED);
	}
	@GetMapping("/getemp")
	public ResponseEntity<List<Employee>> GetEmp()
	{
		List<Employee> s=serviceemp.getEmp();
		return new ResponseEntity<>(s,HttpStatus.OK);
	}	
	@PutMapping("/updateemp/{id}")
	public ResponseEntity<Employee>UpdateEmp(@PathVariable("id")int id,@RequestBody Employee e)
	{    
		e.setId(id);
		Employee ee=serviceemp.Updateemp(id,e);
		return new ResponseEntity<>(ee,HttpStatus.OK);
	}
	@DeleteMapping("/deleteemp/{id}")
	public void deleteByid(@PathVariable("id")int id)
	{
		serviceemp.deleteById(id);
	}
	
}
