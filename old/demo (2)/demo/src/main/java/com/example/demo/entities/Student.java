package com.example.demo.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "STUDENTS")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal Id;
    private String Name;
    private Date Brithday;

    public Student() { }

    public Student(String name, Date brithday) {
        Name = name;
        Brithday = brithday;
    }

    public BigDecimal getId() {
        return Id;
    }

    public void setId(BigDecimal id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getBrithday() {
        return Brithday;
    }

    public void setBrithday(Date brithday) {
        Brithday = brithday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Brithday=" + Brithday +
                '}';
    }
}
