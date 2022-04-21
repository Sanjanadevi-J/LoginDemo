package com.example.logindemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "AddDetails", value = "/submit")
public class AddDetails extends HttpServlet {
    static int id=0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter output=response.getWriter();
        HttpSession session= request.getSession(false);
        String title=request.getParameter("Title");
        String firstName=request.getParameter("FirstName");
        String lastName=request.getParameter("LastName");
        String gender=request.getParameter("gender");
        id++;
        session.setAttribute("Id",id);
        session.setAttribute("Title",title);
        session.setAttribute("FirstName",firstName);
        session.setAttribute("LastName",lastName);
        session.setAttribute("Gender",gender);
        Map<Integer,Student> studentDetails=new HashMap<Integer,Student>();
        for(int count=0;count<=id;count++) {
            title=request.getParameter("Title");
            firstName=request.getParameter("FirstName");
            lastName=request.getParameter("LastName");
            gender=request.getParameter("gender");
            studentDetails.put(id, new Student(id, title, firstName, lastName, gender));
        }
        ArrayList<Student> studentDetail=new ArrayList<>(studentDetails.values());
        session.setAttribute("StudentDetails",studentDetail);
        output.print("Details are added successfully");
        RequestDispatcher redirect= request.getRequestDispatcher("AdminPage.jsp");
        redirect.forward(request,response);

    }

}
