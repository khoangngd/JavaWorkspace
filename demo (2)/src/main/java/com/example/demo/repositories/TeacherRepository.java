package com.example.demo.repositories;

import com.example.demo.entities.Student;
import com.example.demo.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Number> {

}
