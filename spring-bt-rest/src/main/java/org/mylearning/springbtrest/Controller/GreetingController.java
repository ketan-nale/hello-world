package org.mylearning.springbtrest.Controller;

import java.util.concurrent.atomic.AtomicLong;

import org.mylearning.springbtrest.pojo.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		logger.info("INSIDE org.mylearning.springbtrest.Controller.GreetingController.greeting(String)");
		logger.debug(name);
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/greeting3")
	public Greeting greeting3(@RequestParam(value = "name", defaultValue = "Master") String name) {
		logger.info("INSIDE org.mylearning.springbtrest.Controller.GreetingController.greeting3(String)");
		logger.debug(name);
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/greeting2")
	public Greeting greeting2(@RequestParam(value = "name", defaultValue = "World") String name) {
		logger.info("INSIDE org.mylearning.springbtrest.Controller.GreetingController.greeting2(String)");
		logger.debug(name);
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
	@PostMapping("/greeting")
	public void saveGreeting(@RequestBody Greeting greeting) {
		logger.info("INSIDE org.mylearning.springbtrest.Controller.GreetingController.saveGreeting(Greeting)");
		logger.debug(greeting.toString());
	}
}
