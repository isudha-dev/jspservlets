package com.app.firstservletapplication.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstGenericServlet extends GenericServlet {

  @Override public void service(final ServletRequest req, final ServletResponse res) throws ServletException, IOException {
    PrintWriter printWriter = res.getWriter();
    printWriter.print("<h1> Hello from generic servlet </h1>");
    printWriter.print("<h1> Today is "+new Date()+" </h1>");

  }
}
