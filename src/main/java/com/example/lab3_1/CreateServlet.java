package com.example.lab3_1;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


@WebServlet(name = "create-servlet", value = "/create-servlet")
public class CreateServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String salary = request.getParameter("salary");
        String desig = request.getParameter("desig");

        String sql = ("insert into employee " +
                "value (" + id + " , '" + name + "', '" + email +
                "' , '" + phone + "', " + salary + " , '" + desig + "')");
        System.out.println(sql);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema",
                    "root", "V$a*75Qm");
            Statement statement = connection.createStatement();

            statement.executeUpdate(sql);

            out.println("New tuple successfully created\n");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            out.println("Wrong input\n");
        }
        out.println("<a href=\"index.jsp\"> Main Menu </a>");
        out.println("</body></html>");


    }
}
