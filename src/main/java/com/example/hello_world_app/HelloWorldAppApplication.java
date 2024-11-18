package com.example.hello_world_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/hello")
public class HelloWorldAppApplication {
	@GetMapping("/get")
	public ResponseEntity<String> HelloWrold(){
		System.out.println("Executed");
		return new ResponseEntity<>("hello world", HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldAppApplication.class, args);
	}

}
