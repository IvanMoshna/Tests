package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        log("This is init method");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("This is service method enter\n");
        super.service(req, resp);
        resp.getWriter().write("This is service method exit\n");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("This is doGet method\n");
    }

    @Override
    public void destroy() {
        log("This is destroy method");
    }
}
