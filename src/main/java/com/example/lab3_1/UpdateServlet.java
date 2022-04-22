package com.example.lab3_1;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;

@WebServlet(name = "update-servlet", value = "/update-servlet")
public class UpdateServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        Enumeration<String> parameterNames = request.getParameterNames();

        String paramNameUpdate = parameterNames.nextElement();
        String valueUpdate = request.getParameter(paramNameUpdate);
        String paramNameWhere = parameterNames.nextElement();
        String valueWhere = request.getParameter(paramNameWhere);

        out.println("update: " + paramNameUpdate + " to: " + valueUpdate + "<br>" +
                    "where: " + paramNameWhere + " equals: " + valueWhere + "<br>");

        String sql = "update employee set " + paramNameUpdate + " = " +  valueUpdate + "\n" +
                "where "+ paramNameWhere + " = " + valueWhere;



        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema",
                    "root", "V$a*75Qm");
            Statement statement = connection.createStatement();

            statement.executeUpdate(sql);

            out.println("New tuple successfully created<br>");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            out.println("Wrong input\n");
        }

        out.println("<a href=\"index.jsp\"> Main Menu </a>");
        out.println("</body></html>");
    }
}
