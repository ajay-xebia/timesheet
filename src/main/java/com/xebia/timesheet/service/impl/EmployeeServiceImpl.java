package com.xebia.timesheet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.timesheet.bean.Employee;
import com.xebia.timesheet.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private Employee emp;
	
	@Autowired
	public EmployeeServiceImpl(Employee emp) {
		this.emp = emp; 
	}
	/* (non-Javadoc)
	 * @see com.xebia.timesheet.service.EmployeeServicet#act()
	 */
	@Override
	public String act(){ 
		return emp.getName();
	}
}
