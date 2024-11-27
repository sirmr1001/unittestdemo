package com.etiya.unitTestDemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnitTestDemo1Application {

	public static void main(String[] args) {

		SpringApplication.run(UnitTestDemo1Application.class, args);
        MathService mathService = new MathService();
		int result = mathService.add(2,3);

		System.out.println("Sonuç : " + result);
	}

}
