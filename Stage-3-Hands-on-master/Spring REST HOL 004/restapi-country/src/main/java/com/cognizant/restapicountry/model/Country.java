package com.cognizant.restapicountry.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Country {

	// properties
	@NotNull(message = "Country code should not be null")
	@Size(min = 2, max = 2, message = "Country code should be 2 characters")
	private String code;
	private String name;

	// getters and setters
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// constructor
	public Country() {

	}

	public Country(String code, String name) {
		this.code = code;
		this.name = name;
	}

	// methods
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}

}
