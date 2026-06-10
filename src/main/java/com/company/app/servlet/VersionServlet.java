package com.company.app.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.app.util.AppConstants;

public class VersionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws IOException {

        resp.setContentType("application/json");

        resp.getWriter().write(
            "{\"application\":\""
            + AppConstants.APP_NAME
            + "\",\"version\":\""
            + AppConstants.VERSION
            + "\"}"
        );
    }
}