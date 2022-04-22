package com.example.lab3_1;

import java.io.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {
            response.setContentType("text/html");
            // Hello
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema",
                    "root", "V$a*75Qm");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from table1");
            while (resultSet.next()){
                out.println("<h1>" + resultSet.getString("name") + "</h1>");
            }
            out.println("<h1>" + message + "</h1>");
            out.println("</body></html>");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    public void destroy() {
    }
}