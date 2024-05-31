package com.ty.springpersonvalidate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springpersonvalidate.entity.Person;

import jakarta.validation.Valid;

@RestController
public class PersonController {

	@GetMapping("/person")
	public ResponseEntity<String> save(@Valid @RequestBody Person person) {
		
		return ResponseEntity.ok("person saved");
	}
}
