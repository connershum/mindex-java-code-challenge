package com.mindex.challenge.data;

import java.util.Date;
import java.util.List;
import com.mindex.challenge.data.Employee;

public class Compensation {
    private Employee employee;
    private double salary;
    private Date effectiveDate;

    public Compensation() {
    }
    
    public Employee getEmployee() {
    	return this.employee;
    }
    
    public void setEmployee(Employee anEmployee) {
    	this.employee = anEmployee;
    }
    
    public double getSalary() {
    	return this.salary;
    }
    
    public void setSalary(double aSalary) {
    	this.salary = aSalary;
    }
    
    public Date getEffectiveDate() {
    	return this.effectiveDate;
    }
    
    public void setEffectiveDate(Date anEffectiveDate) {
    	this.effectiveDate = anEffectiveDate;
    }
    

}