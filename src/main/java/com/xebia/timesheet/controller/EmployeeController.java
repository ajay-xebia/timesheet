package com.xebia.timesheet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xebia.timesheet.service.EmployeeService;

@RestController
@RequestMapping
public class EmployeeController {
	
	
	private EmployeeService service;
	
	/*@Autowired
	public TestController(TestService service) {
		this.service = service;
	}*/
	@Autowired
	public void setService(EmployeeService service) {
		this.service = service;
	}

	@RequestMapping
	public String home(){
		return "hello "+service.act(); 
	}
}
