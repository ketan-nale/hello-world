package org.mylearning.springbtrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class SpringBtRestApplication extends SpringBootServletInitializer {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringBtRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBtRestApplication.class, args);
	}

//	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(SpringBtRestApplication.class);
//		System.out.println("################### Starting My APP ###################");
//		app.setLogStartupInfo(false);
//		app.setBanner(new Banner() {
//			@Override
//			public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
//				out.println("--- Ketan ---");
//			}
//		});
//		app.run(args);
//	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		logger.debug("INSIDE org.mylearning.springbtrest.SpringBtRestApplication.configure(SpringApplicationBuilder)");
		return builder.sources(SpringBtRestApplication.class);
	}

}
