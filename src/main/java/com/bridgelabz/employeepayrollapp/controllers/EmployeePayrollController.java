package com.bridgelabz.employeepayrollapp.controllers;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*
Use Case 2 Created REST Controller to
demonstrate the various HTTP Methods
 */

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<String> getEmployeePayrollData() {
        return new ResponseEntity<>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId) {
        return new ResponseEntity<>("Get Call Success for id: " + empId, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO) {
        return new ResponseEntity<>("Created Employee Payroll Data for : " + empPayrollDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO) {
        return new ResponseEntity<>("Updated Employee Payroll Data for : " + empPayrollDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
        return new ResponseEntity<String>("Delete Call Success for id : " + empId, HttpStatus.OK);
    }
}