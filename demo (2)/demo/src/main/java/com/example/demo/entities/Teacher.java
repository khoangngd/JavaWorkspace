package com.example.demo.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TEACHERS")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal Id;
    private String Name;
    private String Location;

    public Teacher() { }

    public Teacher(String name, String location) {
        Name = name;
        Location = location;
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

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Location=" + Location +
                '}';
    }
}
