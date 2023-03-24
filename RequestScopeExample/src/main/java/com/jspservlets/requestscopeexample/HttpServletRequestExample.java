package com.jspservlets.requestscopeexample;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/httpServletRequestExample")
public class HttpServletRequestExample extends HttpServlet {

    public HttpServletRequestExample(){
        super();
    }

    @Override protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
    @Override protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<Html><Body>");

        // http request object which is sent from the browser contains headers and body (Parameters)
        printWriter.print("<h1>Request locale: "+req.getLocale()+"</h1>"); // language: Response depends on locale
        printWriter.print("<h1>Request content length: "+req.getContentLength()+"</h1>"); // request length
        printWriter.print("<h1>Request server name: "+req.getServerName()+"</h1>");
        printWriter.print("<h1>Request content type: "+req.getContentType()+"</h1>"); // binary or text data (Mime type)
        printWriter.print("<h1>Request context path: "+req.getContextPath()+"</h1>");
        printWriter.print("<h1>Username param: "+req.getParameter("userName")+"</h1>");
        printWriter.print("<h1>Country name param: "+req.getParameter("countryName")+"</h1>");

        // Html request header
        req.getHeader("content-type");
        req.getHeaderNames();// to know all headers passed in
        // web container (tomcat) converts these html request headers into java objects hence we are able to access object in above manner

        printWriter.print("</html></body>");


    }
}
