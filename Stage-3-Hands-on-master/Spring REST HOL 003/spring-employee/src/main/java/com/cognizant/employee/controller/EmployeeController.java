package com.cognizant.employee.controller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employee.exception.EmployeeNotFoundException;
import com.cognizant.employee.model.Employee;
import com.cognizant.employee.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	public static Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeService employeService;

	@GetMapping
	public List<Employee> getAllEmployees() {
		LOGGER.info("Inside Employee Controller");
		List<Employee> employeeList = employeService.getAllEmployees();
		return employeeList;
	}

	@PutMapping
	public void updateEmployee(@RequestBody @Valid Employee employee) throws EmployeeNotFoundException  {
		employeService.updateEmployee(employee.getEmployeeId(), employee);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable int id) throws EmployeeNotFoundException {
		employeService.deleteEmployee(id);
	}
}
