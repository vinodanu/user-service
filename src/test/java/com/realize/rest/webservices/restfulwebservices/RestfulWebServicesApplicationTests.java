package com.realize.rest.webservices.restfulwebservices;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

@SpringBootTest
class RestfulWebServicesApplicationTests {

	private final static Logger LOGGER =
			Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);


	@BeforeAll
	static void setup() {
		LOGGER.info("@BeforeAll - executes once before all test methods in this class");
	}

	@BeforeEach
	void init() {
		LOGGER.info("@BeforeEach - executes before each test method in this class");
	}

	@Test
	void contextLoads() {
	}


}