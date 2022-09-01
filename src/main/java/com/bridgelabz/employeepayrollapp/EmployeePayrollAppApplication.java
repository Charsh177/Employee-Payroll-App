package com.bridgelabz.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
SECTION3 Use case 1 Lombok library added to auto generate
Getter and Setter for DTO
 */
@SpringBootApplication
public class EmployeePayrollAppApplication {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Payroll App");
        SpringApplication.run(EmployeePayrollAppApplication.class, args);
    }

}