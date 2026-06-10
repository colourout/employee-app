package com.company.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.app.model.Employee;
import com.company.app.service.EmployeeService;

public class EmployeeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws IOException {

        EmployeeService service = new EmployeeService();
        List<Employee> employees = service.getEmployees();

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.println("<html><body>");
        out.println("<h1>Employee List</h1>");

        out.println("<table border='1'>");
        out.println("<tr><th>ID</th><th>Name</th><th>Department</th></tr>");

        for (Employee employee : employees) {
            out.println("<tr>");
            out.println("<td>" + employee.getId() + "</td>");
            out.println("<td>" + employee.getName() + "</td>");
            out.println("<td>" + employee.getDepartment() + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }
}