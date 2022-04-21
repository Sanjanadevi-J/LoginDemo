package com.example.logindemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Logout", value = "/Logout")
public class LogoutPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter output=response.getWriter();
        HttpSession session=request.getSession(false);
        output.print("You are successfully logged out .. "+session.getAttribute("UserName"));
        session.invalidate();
    }
}
