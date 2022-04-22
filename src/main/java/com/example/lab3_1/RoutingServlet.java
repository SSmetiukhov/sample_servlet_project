package com.example.lab3_1;

import java.io.*;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;


@WebServlet(name = "routing-servlet", value = "/routing-servlet")
public class RoutingServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));

        switch (id){
            case 1 -> request.getRequestDispatcher("create-view.jsp").forward(request, response);
            case 2 -> request.getRequestDispatcher("read-view.jsp").forward(request, response);
            case 3 -> request.getRequestDispatcher("update-view.jsp").forward(request, response);
            case 4 -> request.getRequestDispatcher("delete-view.jsp").forward(request, response);
        }
    }

    public void destroy() {
    }
}