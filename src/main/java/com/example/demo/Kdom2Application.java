package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.services.UserService;

@SpringBootApplication
public class Kdom2Application  implements CommandLineRunner {

	
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(Kdom2Application.class, args);
	}

	
	
	@Override
	public void run(String... args) throws Exception {		
		
	}

}
