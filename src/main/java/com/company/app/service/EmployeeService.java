package com.company.app.service;

import java.util.ArrayList;
import java.util.List;

import com.company.app.model.Employee;

public class EmployeeService {

    public List<Employee> getEmployees() {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "John", "IT"));
        employees.add(new Employee(102, "Sara", "HR"));
        employees.add(new Employee(103, "David", "Finance"));

        return employees;
    }
}