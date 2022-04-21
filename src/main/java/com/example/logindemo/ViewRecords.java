package com.example.logindemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "ViewRecords", value = "/ViewRecords")
public class ViewRecords extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter output=response.getWriter();
        HttpSession session= request.getSession(false);
        ArrayList<Student> studentList = (ArrayList<Student>)session.getAttribute("StudentDetails");
        output.println("<html><body>" +
                "<form action=\"Logout\" class=\"Logout\" method=\"get\">\n" +
                "<input type=\"submit\" value=\"Logout\">"+
                "<style>table, th, td {\n" +
                "            border: 1px solid;\n" +
                "        }\n" +
                "    </style><table><tr><th>Id</th>\n" +
                "        <th>Title</th>\n" +
                "        <th>FirstName</th>\n" +
                "        <th>LastName</th>\n" +
                "        <th>Gender</th>\n" +
                "\n" +"</tr>\n");

        for(Student studentData:studentList) {
            output.println("<tr><td>" + studentData.id + "</td><td>" + studentData.title + "</td><td>" + studentData.firstName + "</td><td>" + studentData.lastName + "</td><td>" + studentData.gender + "</td></tr>");

        }
        output.println("</table></body></html>");


    }
    }

