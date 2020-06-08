package org.mylearning.springbtrest.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.mylearning.springbtrest.pojo.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	private static final Logger logger = LoggerFactory.getLogger(CountryController.class);

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/countries")
	public Greeting countries(@RequestParam(value = "name", defaultValue = "User") String name) {
		logger.info("INSIDE org.mylearning.springbtrest.Controller.CountryController.countries(String)");
		logger.debug(name);
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
