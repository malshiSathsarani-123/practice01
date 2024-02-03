package com.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "example", urlPatterns = "/example")
public class Demo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getHeader("FName");
        String lastName = req.getHeader("LName");
        System.out.println("Hello Mr. "+firstName+" "+lastName+"!");
        var age = req.getParameter("age");
        System.out.println("Your age is : "+age);
    }
}
