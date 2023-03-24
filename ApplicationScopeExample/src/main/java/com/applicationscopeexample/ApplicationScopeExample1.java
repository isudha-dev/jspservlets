package com.applicationscopeexample;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet(name = "ApplicationScopeExample1", value = "/ApplicationScopeExample1")
public class ApplicationScopeExample1 extends HttpServlet {

  ServletContext servletContext = null;
  @Override public void init(final ServletConfig config) throws ServletException {
    super.init(config);
    servletContext = config.getServletContext();
  }
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter printWriter = response.getWriter();
    printWriter.print("<html><body>");
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "MySql1@3");
        servletContext.setAttribute("employee-connection-db", conn);
        printWriter.print("<h2> Employee DB connection object: "+conn+"</h2>");

    } catch (Exception e) {
      printWriter.print("<h2> Employee DB connection exception: "+e.getMessage()+"</h2>");
    }

    printWriter.print("</body></html>");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}
