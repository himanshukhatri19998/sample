package com.cognizant.employee.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.employee.model.Department;
import com.cognizant.employee.service.DepartmentService;

@RestController
public class DepartmentController {

	public static Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

	@Autowired
	DepartmentService departmentService;

	@GetMapping("/departments")
	public List<Department> getAllDepartments() {
		LOGGER.info("Inside Department Controller");
		return departmentService.getAllDepartments();
	}

}
