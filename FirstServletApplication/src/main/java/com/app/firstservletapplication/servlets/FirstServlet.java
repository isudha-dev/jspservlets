package com.app.firstservletapplication.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstServlet implements Servlet {

  ServletConfig config = null;

  @Override public void init(final ServletConfig config) throws ServletException {
    this.config = config;
  }

  @Override public void service(final ServletRequest req, final ServletResponse res) throws ServletException, IOException {
    PrintWriter printWriter = res.getWriter();
    printWriter.print("<h1> Hello from servlet </h1>");
    printWriter.print("<h1> Today is "+new Date()+" </h1>");
  }

  @Override public void destroy() {

  }

  @Override public ServletConfig getServletConfig() {
    return this.config;
  }

  @Override public String getServletInfo() {
    return null;
  }

}
