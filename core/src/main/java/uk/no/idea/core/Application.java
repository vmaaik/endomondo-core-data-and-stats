package uk.no.idea.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "uk.no.idea")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
