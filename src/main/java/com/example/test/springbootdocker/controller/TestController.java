package com.example.test.springbootdocker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class TestController {

	@GetMapping("")
	public ResponseEntity<String> test() {
		return new ResponseEntity<>("This repo is to test the spring boot and docker", HttpStatus.OK);
	}

}
