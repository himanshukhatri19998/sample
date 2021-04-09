package com.cognizant.springlearn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

@RestController
public class CountryController {

	private static Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

	@Autowired
	private CountryService countryService;

	// methods

	@RequestMapping(path = "/country", method = RequestMethod.GET)
	public Country getCountryIndia() {
		LOGGER.info("Start: CountryController: getCountryIndia()");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("in", Country.class);

		LOGGER.info("Stop: CountryController: getCountryIndia()");

		return country;
	}

	@GetMapping("/countries")
	public List<Country> getAllCountries() {

		LOGGER.info("Start: CountryController: getAllCountries()");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		List<Country> countries = (List<Country>) context.getBean("countryList");
		LOGGER.info("Stop: CountryController: getAllCountries()");

		return countries;
	}

	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) throws CountryNotFoundException {

		LOGGER.info("Start: CountryController: getCountry(id)");
		Country country = countryService.getCountry(code);
		LOGGER.info("Stop: CountryController: getCountry(id)");

		return country;
	}

}
