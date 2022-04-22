package com.example.lab3_1;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String salary;
    private String desig;

    public Employee(String id, String name, String email, String phone, String salary, String desig) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.desig = desig;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSalary() {
        return salary;
    }

    public String getDesig() {
        return desig;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "id= " + id + ", name= " + name + ", email= " + email + ", phone= " + phone +
                ", salary= " + salary + ", desig= " + desig;
    }
}
