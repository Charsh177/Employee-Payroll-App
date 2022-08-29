package com.bridgelabz.employeepayrollapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Use case 1 Created Employee Payroll Spring Project to cater to
REST Request from Employee Payroll UI
 */
@SpringBootApplication
public class EmployeePayrollAppApplication {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Payroll App");
        SpringApplication.run(EmployeePayrollAppApplication.class, args);
    }

}