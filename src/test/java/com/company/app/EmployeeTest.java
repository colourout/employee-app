package com.company.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.company.app.model.Employee;

public class EmployeeTest {

    @Test
    public void testEmployeeCreation() {

        Employee employee =
            new Employee(101, "John", "IT");

        assertEquals(101, employee.getId());
        assertEquals("John", employee.getName());
        assertEquals("IT", employee.getDepartment());
    }
}