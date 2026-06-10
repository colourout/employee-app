package com.company.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.company.app.service.EmployeeService;

public class EmployeeServiceTest {

    @Test
    public void testEmployeeCount() {

        EmployeeService service =
            new EmployeeService();

        assertEquals(
            3,
            service.getEmployees().size()
        );
    }
}