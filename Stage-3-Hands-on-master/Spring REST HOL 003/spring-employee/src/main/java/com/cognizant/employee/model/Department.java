package com.cognizant.employee.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Department {

	// properties
	@NotNull(message = "Department Id should not be null")
	private Integer departmentId;
	@NotNull(message = "Department Name should not be null")
	@Size(min = 1, max = 30, message = "Department name minimum 1 character and maximum 30 characters")
	private String departmentName;

	// getters and setters
	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	// constructor
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	// methods
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}

}
