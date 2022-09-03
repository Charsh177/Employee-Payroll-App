package com.bridgelabz.employeepayrollapp.services;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    /*
    Use Case 3 Ability for service layer to store the employee payroll data.
    We store data in a memory as a List.
     */

    private List<EmployeePayrollData> employeePayrollDataList = new ArrayList<EmployeePayrollData>();

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
       return employeePayrollDataList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
       return employeePayrollDataList.get(empId - 1);
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
        employeePayrollDataList.add(employeePayrollData);
        return employeePayrollData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empId);
        employeePayrollData.setName(employeePayrollDTO.name);
        employeePayrollData.setSalary(employeePayrollDTO.salary);
        employeePayrollDataList.set(empId - 1, employeePayrollData);
        return employeePayrollData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        employeePayrollDataList.remove(empId - 1);
    }
}