package com.example.demo;

import com.example.demo.entities.CustomerMaster;
import com.example.demo.entities.Student;
import com.example.demo.models.Contract;
import com.example.demo.repositories.CustomerMasterRepository;
import com.example.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    private CustomerMasterRepository customerMasterRepository;

    @Autowired
    private StudentRepository _studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //jdbc
        //String sql = "SELECT * FROM DUAL";
//        List<Contract> listJDBC = jdbcTemplate.query(sql,
//                BeanPropertyRowMapper.newInstance(Contract.class));

       /* String sql = "SELECT * FROM STUDENTS";
        List<Student> listJDBC = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Student.class));
        listJDBC.forEach(System.out::println);*/

        //jpa
        List<Student> listJPA = _studentRepository.findAll();
        listJPA.forEach(System.out::println);

    }
}
