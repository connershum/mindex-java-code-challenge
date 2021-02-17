package com.mindex.challenge.data;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ReportingStructure {
	
	private Employee employee;
	private int numberOfReports;
	
	public ReportingStructure() {
	}
	
	@Autowired
    private EmployeeRepository employeeRepository;
	
	
	
	public Employee getEmployee() {
		return this.employee;
	}
	
	// set employee of ReportingStructure item using the ID
	public void setEmployee(Employee employee) {
		this.employee = employee;
		
	}
	
	public int getNumberOfReports() {
		return this.numberOfReports;
	}
	
	public void setNumberOfReports(int nor) {
		this.numberOfReports = nor;
	}

	
}