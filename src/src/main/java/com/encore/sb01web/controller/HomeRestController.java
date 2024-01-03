package com.encore.sb01web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class HomeRestController {

	@GetMapping("/")    // http://localhost:8080/
//	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePlain() {
		return "<h1>Welcom Spring Boot!!222</h1>";
	}
}
