package com.cognizant.restapicountry.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.restapicountry.model.Country;

@RestController
@RequestMapping("/countries")
public class CountryController {

	public static Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

	@PostMapping
	public Country addCountry(@RequestBody @Valid Country country) {
		LOGGER.info("Start: addCountry method");
		LOGGER.info("New Country to be add: " + country.toString());

		return country;
	}

}
