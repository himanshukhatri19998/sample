package com.cognizant.employee.service;

import java.beans.Transient;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.employee.dao.DepartmentDao;
import com.cognizant.employee.model.Department;

@Service
public class DepartmentService {

	public static Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);

	@Autowired
	DepartmentDao departmentDao;

	@Transient
	public ArrayList<Department> getAllDepartments() {

		LOGGER.info("inside getAllEmployees");
		ArrayList<Department> department = departmentDao.getAllDepartments();

		return department;
	}
}
