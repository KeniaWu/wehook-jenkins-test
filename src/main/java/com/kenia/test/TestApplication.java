package com.kenia.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		System.out.println(
				"hello word demo start complete.......................................................................................");
	}

	@RequestMapping("/hello")
	public String helloWord() {
		return "hello word!";
	}
	@RequestMapping("/test")
	public String test() {
		return "This is a test!";
	}
}
