package com.cognizant.springlearn;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.model.Country;

@SpringBootApplication
public class SpringLearnApplication {

	private final static Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);

		displayCountry();
		displayCountries();

	}

	public static void displayCountry() {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		// Scope of Bean with id = "country" is prototype: hence for each time when we
		// get bean it will call constructor
		// By default scope of bean is Singleton
		Country country = (Country) context.getBean("country", Country.class);
		Country anotherCountry = context.getBean("country", Country.class);
		LOGGER.info("Country : {}", country.toString());
		LOGGER.info("Country : {}", anotherCountry.toString());
	}

	public static void displayCountries() {
		LOGGER.info("Start");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> countryList = (ArrayList<Country>) context.getBean("countryList");
		LOGGER.info("CountryList : {}", countryList.toString());

		LOGGER.info("End");
	}

}
