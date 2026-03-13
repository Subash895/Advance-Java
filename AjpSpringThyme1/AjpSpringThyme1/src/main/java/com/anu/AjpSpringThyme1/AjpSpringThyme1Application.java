package com.anu.AjpSpringThyme1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//@ComponentScan("com.*")
@SpringBootApplication
public class AjpSpringThyme1Application {

	public static void main(String[] args) {
		SpringApplication.run(AjpSpringThyme1Application.class, args);
		System.out.println(" Hi brother and brothers");
	}

}
