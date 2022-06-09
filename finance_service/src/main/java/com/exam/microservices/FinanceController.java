package com.exam.microservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinanceController {

	@GetMapping("/financial-statement")
	//This is a dummy service, it will always return true, that the student paid, however it could return false
	public String financial() {
		return "true";
	}
}
