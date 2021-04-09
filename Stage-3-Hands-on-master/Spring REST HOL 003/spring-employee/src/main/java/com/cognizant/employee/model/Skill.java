package com.cognizant.employee.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Skill {

	// properties
	@NotNull(message = "Skill Id should not be null")
	private Integer skillId;
	@NotNull(message = "Skill Name should not be null")
	@Size(min = 1, max = 30, message = "Skill name minimum 1 character and maximum 30 characters")
	private String skillName;

	// getters and setters
	public Integer getSkillId() {
		return skillId;
	}

	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	// constructor
	public Skill() {
		// TODO Auto-generated constructor stub
	}

	public Skill(int skillId, String skillName) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
	}

	// methods
	@Override
	public String toString() {
		return "Skill [skillId=" + skillId + ", skillName=" + skillName + "]";
	}

}
