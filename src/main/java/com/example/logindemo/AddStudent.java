package com.example.logindemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AddStudent", value = "/Add Student")
public class AddStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter output=response.getWriter();
        output.print("<html><h1>You can add details here</h1><body><fieldset>\n" +
                "    <legend>Personal information</legend>\n" +
                "<form action=\"submit\" class=\"AddDetails\" method=\"post\">\n" +
                "<label for=\"Title\">Title:</label>\n" +
                "<select name=\"Title\" id=\"Title\">\n" +
                "    <option value=\"Mr.\">Mr.</option>\n" +
                "    <option value=\"Ms.\">Ms.</option>\n" +
                "</select>\n" +
                "<label>\n" +
                "    First name:<input type=\"text\" name=\"FirstName\">\n" +
                "    Last name:<input type=\"text\" name=\"LastName\"><br>\n" +
                "    Gender:<input type=\"radio\" id=\"male\" name=\"gender\" value=\"Male\">\n" +
                "    <label for=\"male\">Male</label>\n" +
                "    <input type=\"radio\" id=\"female\" name=\"gender\" value=\"Female\">\n" +
                "    <label for=\"female\">Female</label>\n" +
                "    <br><input type=\"submit\">\n" +
                "</label>\n" +
                "</form>\n" +
                "</fieldset>\n" +
                "</body>\n" +
                "</html>");
    }
}
