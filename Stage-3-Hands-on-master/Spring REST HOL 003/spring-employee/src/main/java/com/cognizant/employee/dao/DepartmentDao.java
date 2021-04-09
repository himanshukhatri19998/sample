package com.cognizant.employee.dao;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.employee.model.Department;

@Component
public class DepartmentDao {

	private static ArrayList<Department> DEPARTMENT_LIST;

	public static Logger LOGGER = LoggerFactory.getLogger(DepartmentDao.class);

	public DepartmentDao() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		LOGGER.info("Constructor");
		DEPARTMENT_LIST = (ArrayList<Department>) context.getBean("departmentList");
	}

	public ArrayList<Department> getAllDepartments() {
		LOGGER.info("Inside getAllDepartments");
		return DEPARTMENT_LIST;
	}

}
