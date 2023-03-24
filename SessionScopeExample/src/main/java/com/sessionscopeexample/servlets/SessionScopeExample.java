package com.sessionscopeexample.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/isVisited")
public class SessionScopeExample extends HttpServlet {

    public SessionScopeExample(){
        super();
    }

    @Override public void init(final ServletConfig config) throws ServletException {
        super.init(config);
    }
    @Override protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html><body>");

//        req.getCookies() Cookies: set and used on client-side e.g. JSESSIOID

        HttpSession session = req.getSession();
        Object isVisitedAttribute = session.getAttribute("isVisited");

        if(isVisitedAttribute == null) {
            session.setAttribute("isVisited", true); // Attribute: set and used on server-side
            printWriter.print("<h1> Thank you for visiting our website </h1>");
        } else {
            printWriter.print("<h1> Welcome back </h1>");
        }
        printWriter.print("</html></body>");
        printWriter.close();

//        Web server sets cookies on browser, whcih helps in maintaining session.i.e. session tracking
    }
}
