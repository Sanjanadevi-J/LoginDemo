package com.example.logindemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginPage", value = "/Login")
public class LoginPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter output=response.getWriter();
        String userName=request.getParameter("UserName");
      String password=request.getParameter("Password");
      HttpSession session= request.getSession();
      session.setAttribute("UserName",userName);
      if(userName.equals("Admin") && password.equals("admin") ){
          response.sendRedirect("AdminPage.jsp");
      }
      else if(userName.equals("Student") && password.equals("student")){
          response.sendRedirect("StudentPage.jsp");
      }
      else{
        output.println("Your user name or password is invalid.. please try it with correct one..");
        RequestDispatcher invalid= request.getRequestDispatcher("index.jsp");
        invalid.forward(request,response);
      }
    }
}
