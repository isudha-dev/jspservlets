package com.servletinitparamexample;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FeedbackServlet extends HttpServlet {

  private String companyEmailParam = null;

  public FeedbackServlet(){
    super();
  }

  @Override public void init(ServletConfig config) throws ServletException {
    super.init(config);

    // 1 Read init param
    companyEmailParam = config.getInitParameter("company-email");
  }
  @Override protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
    doPost(req, resp);
  }
  @Override protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter printWriter = resp.getWriter();

    //2 read request param
    String feedbackParam = req.getParameter("feedbackParam");

    //3 read init param
    printWriter.print("<h3> We will send feedback: "+feedbackParam+" to email "+companyEmailParam+" </h3>");
    printWriter.close();

  }
}
