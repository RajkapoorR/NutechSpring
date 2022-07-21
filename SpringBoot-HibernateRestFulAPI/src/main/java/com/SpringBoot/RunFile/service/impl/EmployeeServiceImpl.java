package com.SpringBoot.RunFile.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.SpringBoot.RunFile.exception.ResourceNotFoundException;
import com.SpringBoot.RunFile.model.Employee;
import com.SpringBoot.RunFile.repository.EmployeeRepository;
import com.SpringBoot.RunFile.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
    Optional<Employee> employee=employeeRepository.findById(id);
	if(employee.isPresent()) {
		return employee.get();
	}else
	{
		throw new ResourceNotFoundException("Employee", "Id", employee);
	}
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
     //checking whether employee with given id exist in table or not
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee", "Id", id));
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmailId(employee.getEmailId());	
		return existingEmployee;
	}

	@Override
	public void deleteEmployee(long id)  {
		employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee", "Id", id));
		employeeRepository.deleteById(id);		
	}
}

