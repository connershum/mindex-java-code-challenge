package com.mindex.challenge.controller;

import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.EmployeeService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReportingStructureController {
    private static final Logger LOG = LoggerFactory.getLogger(ReportingStructureController.class);

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/reportingStructure/{id}")
    public ReportingStructure read(@PathVariable String id) {
        LOG.debug("Received reportingStructure request for id [{}]", id);
        
        Employee employee = employeeService.read(id);
        
        
        if (employee == null) {
            throw new RuntimeException("Invalid employeeId: " + id);
        }
        
        ReportingStructure reportingStructure = new ReportingStructure();
        reportingStructure.setEmployee(employee);
        int nor = calculateNOR(employee.getDirectReports());
        reportingStructure.setNumberOfReports(nor);
        

        return reportingStructure;
    }
    
    private int calculateNOR(List<Employee> directReports) {
    	if (directReports == null) {
			return 0;
		} else {
			int reports = 0;
			for (int i = 0; i < directReports.size(); i++) {
				String id = directReports.get(i).getEmployeeId();
				Employee employee = employeeService.read(id);
				
				reports = reports + 1 + calculateNOR(employee.getDirectReports());
			}
			return reports;
		}
    }

    
}