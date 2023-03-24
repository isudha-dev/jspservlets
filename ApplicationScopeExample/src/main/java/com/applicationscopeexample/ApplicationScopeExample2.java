package com.applicationscopeexample;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(name = "ApplicationScopeExample2", value = "/ApplicationScopeExample2")
public class ApplicationScopeExample2 extends HttpServlet {

  ServletContext servletContext = null;
  @Override public void init(final ServletConfig config) throws ServletException {
    super.init(config);
    servletContext = config.getServletContext();
  }

  @Override protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter printWriter = resp.getWriter();
    printWriter.print("<html><body>");
    try {
      Connection conn = (Connection) servletContext.getAttribute("employee-connection-db");
      printWriter.print("<h2> Employee DB connection object: "+conn+"</h2>");

    } catch (Exception e) {
      printWriter.print("<h2> Employee DB connection exception from context: "+e.getMessage()+"</h2>");
    }

    printWriter.print("</body></html>");

  }
}
