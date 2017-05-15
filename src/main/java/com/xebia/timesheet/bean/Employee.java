package com.xebia.timesheet.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String name;
	
	
	@Autowired
	public Employee(String name) {
		System.out.println("parameterized cons....");
		this.name = name;
	}
	
	public String getName() {
		return name; 
	}
}
