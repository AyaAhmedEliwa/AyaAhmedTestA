package io.javasprings.springbootEval;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = Controller.class)
public class courseAPIApp {

	public static void main(String[] args) {
		
		
		SpringApplication.run(courseAPIApp.class, args);		
	}
	
}
