package com.example.lab3_1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "read-servlet", value = "/read-servlet")
public class ReadServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        try {
            String sortingParam = request.getParameter("id");

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema",
                    "root", "V$a*75Qm");
            Statement statement = connection.createStatement();

            //List<Map> list = new ArrayList<Map>();
            List<Employee> list = new ArrayList<>();


            String sql = "SELECT id, name, email, phone, salary, desig FROM employee\n";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String salary = resultSet.getString("salary");
                String desig = resultSet.getString("desig");

                list.add(new Employee(id,name,email,phone, salary, desig));
            }

            request.setAttribute("key_list", list);
            request.getRequestDispatcher("read-display-view.jsp").forward(request, response);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }

    }
}
