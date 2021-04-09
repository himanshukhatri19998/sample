package com.cognizant.employee.dao;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.employee.controller.EmployeeController;
import com.cognizant.employee.exception.EmployeeNotFoundException;
import com.cognizant.employee.model.Employee;

@Component
public class EmployeeDao {

	private static ArrayList<Employee> EMPLOYEE_LIST;

	public static Logger LOGGER = LoggerFactory.getLogger(EmployeeDao.class);

	public EmployeeDao() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EMPLOYEE_LIST = (ArrayList<Employee>) context.getBean("employeeList");
	}

	// @Transactional
	public ArrayList<Employee> getAllEmployees() {
		LOGGER.info("Start");
		LOGGER.debug("Employee {}:", EMPLOYEE_LIST.toString());
		LOGGER.info("End");
		return EMPLOYEE_LIST;
	}

	public void updateEmployee(int id, Employee emp) throws EmployeeNotFoundException {
		LOGGER.info("start");

		boolean isFound = false;
		for (Employee employee : EMPLOYEE_LIST) {
			if (employee.getEmployeeId() == id) {
				isFound = true;

				employee.setEmployeeName(emp.getEmployeeName());
				employee.setPermanent(emp.getPermanent());
				employee.setSalary(emp.getSalary());
				employee.setDateOfBirth(emp.getDateOfBirth());
				employee.setSkill(emp.getSkill());
				employee.setDepartment(emp.getDepartment());
			}
		}

		if (!isFound) {
			throw new EmployeeNotFoundException();
		}

	}

	public void deleteEmployee(int id) throws EmployeeNotFoundException {
		LOGGER.info("start");

		Iterator<Employee> it = EMPLOYEE_LIST.iterator();
		boolean isRemoved = false;
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmployeeId() == id) {
				it.remove();
				isRemoved = true;
				break;
			}
		}

		if (!isRemoved) {
			throw new EmployeeNotFoundException();
		}

	}
}
