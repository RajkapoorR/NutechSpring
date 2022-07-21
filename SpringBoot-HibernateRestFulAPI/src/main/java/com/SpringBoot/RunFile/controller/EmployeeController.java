package com.SpringBoot.RunFile.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.RunFile.model.Employee;
import com.SpringBoot.RunFile.service.EmployeeService;


@RestController
@RequestMapping("/api/employees")
public class EmployeeController
{
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
}
//build create employees REST API
@PostMapping()
public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
 return  new ResponseEntity<Employee> (employeeService.saveEmployee(employee),HttpStatus.CREATED);
}

//build get all employees REST API
@GetMapping
public List<Employee> getAllEmployees()
{
	return employeeService.getAllEmployees();
}

@GetMapping("{id}")
public ResponseEntity<Employee> getEmployeeBtId(@PathVariable("id") long employeeId)
{
	return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);
}

//build update employee REST API
//http ://localhost :8080/api/employees/1
//@PutMapping("{id}")
@RequestMapping(value = "{id}", method = RequestMethod.PUT)

public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id,@RequestBody Employee employee)
{
	return new ResponseEntity<Employee>(employeeService.updateEmployee(employee,id),HttpStatus.OK);
}
//build delete employee Rest API
//http ://localhost :8080/api/employees/1
//@DeleteMapping({"id"})
@RequestMapping(value = "{id}", method = RequestMethod.DELETE)

public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id)
{
	employeeService.deleteEmployee(id);
   return new ResponseEntity<String>("Employee deleted succesfully..",HttpStatus.OK);
}
}