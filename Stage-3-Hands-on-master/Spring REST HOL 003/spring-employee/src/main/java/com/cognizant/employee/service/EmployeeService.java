package com.cognizant.employee.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employee.dao.EmployeeDao;
import com.cognizant.employee.exception.EmployeeNotFoundException;
import com.cognizant.employee.model.Employee;

@Service
public class EmployeeService {

	public static Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	EmployeeDao employeeDao;

	public List<Employee> getAllEmployees() {
		LOGGER.info("inside getAllEmployees");
		List<Employee> allEmployee = employeeDao.getAllEmployees();
		return allEmployee;
	}

	public void updateEmployee(int id, Employee employee) throws EmployeeNotFoundException {
		LOGGER.info("Inside updateEmployee");
		employeeDao.updateEmployee(id, employee);
	}

	public void deleteEmployee(int id) throws EmployeeNotFoundException {
		LOGGER.info("Inside deleteEmployee");
		employeeDao.deleteEmployee(id);
	}
}
