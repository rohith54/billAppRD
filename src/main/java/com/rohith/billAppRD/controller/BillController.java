package com.rohith.billAppRD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillController {

	@GetMapping("/hello/{name}")
	public String getHello(@PathVariable("name")String name) {
		return name;
	}
}
