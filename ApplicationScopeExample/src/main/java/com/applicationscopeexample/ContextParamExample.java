package com.applicationscopeexample;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "ContextParamExample", value = "/ContextParamExample")
public class ContextParamExample extends HttpServlet {

  @Override public void init(ServletConfig config) throws ServletException {
    super.init(config);

//    config.getServletContext(); // 3

  }
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    ServletContext sc = getServletContext();

    PrintWriter printWriter = response.getWriter();
    printWriter.print("<html><body>");
    printWriter.print("<h2> Context params </h2><br/>");
    printWriter.print("<h3> Db Ip param: " +sc.getInitParameter("db-ip")+ "</h3>");
    printWriter.print("<h3> Db Port param: " +sc.getInitParameter("db-port")+ "</h3>");

    Enumeration<String> enumeration = sc.getInitParameterNames();
    while (enumeration.hasMoreElements()){
      printWriter.print("<h4> Param name: "+ enumeration.nextElement() + "</h4>");
    }

    printWriter.print("</body></html>");

//    request.getServletContext(); // 1
//    getServletContext(); // 2

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}
