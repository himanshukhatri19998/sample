package com.cognizant.employee.model;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Employee {

	// properties
	@NotNull(message = "Employee Id should not be null")
	private Integer employeeId;
	@NotNull(message = "Employee Name should not be null")
	@Size(min = 1, max = 30, message = "Employee name minimum 1 character and maximum 30 characters")
	private String employeeName;
	@NotNull(message = "Salary should not be null")
	@PositiveOrZero(message = "Salary should be zero or above")
	private Float salary;
	@NotBlank(message = "Permanent should not be null")
	private String permanent;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dateOfBirth;
	@Valid
	private Department department;
	@Valid
	private Skill skill;

	// getters and setters
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public String getPermanent() {
		return permanent;
	}

	public void setPermanent(String permanent) {
		this.permanent = permanent;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	// constructors
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, float salary, String permanent, Date dateOfBirth,
			Department department, Skill skill) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.permanent = permanent;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
		this.skill = skill;
	}

	// methods
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", permanent=" + permanent + ", dateOfBirth=" + dateOfBirth + ", department=" + department
				+ ", skill=" + skill + "]";
	}

}
