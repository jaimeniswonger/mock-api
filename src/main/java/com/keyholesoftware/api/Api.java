package com.keyholesoftware.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

	@RequestMapping(method = RequestMethod.GET, value = "/api/register")
	ResponseEntity<Object> register() {
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
}
