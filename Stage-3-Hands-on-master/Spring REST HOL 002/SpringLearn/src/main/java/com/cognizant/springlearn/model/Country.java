package com.cognizant.springlearn.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {

	// properties
	private String code;
	private String name;

	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

	// getters & setters
	public String getCode() {
		LOGGER.info("Inside getCode method: code is " + code);
		return code;
	}

	public void setCode(String code) {
		LOGGER.info("Inside setCode method: code is " + code);
		this.code = code;
	}

	public String getName() {
		LOGGER.info("Inside getName method: name is " + name);
		return name;
	}

	public void setName(String name) {
		LOGGER.info("Inside setName method name is " + name);
		this.name = name;
	}

	// constructor
	public Country() {
		LOGGER.info("Inside Country Constructor: Default Constructor");
	}

	public Country(String code, String name) {
		super();
		LOGGER.info("Inside Country Constructor: Parameterized Constructor");
		this.code = code;
		this.name = name;
	}

	// methods
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}

}
