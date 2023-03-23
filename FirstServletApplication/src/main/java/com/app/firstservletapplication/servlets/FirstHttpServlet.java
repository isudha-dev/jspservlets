package com.app.firstservletapplication.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstHttpServlet extends HttpServlet {

  @Override protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter printWriter = resp.getWriter();
    printWriter.print("<h1> Hello from http servlet doGet </h1>");
    printWriter.print("<h1> Today is "+new Date()+" </h1>");
  }

  @Override protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
    doGet(req, resp);
  }
}
