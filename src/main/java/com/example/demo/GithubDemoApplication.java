package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubDemoApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(GithubDemoApplication.class, args);
		
		System.out.println();
		System.out.println("this is second");
	}

}
