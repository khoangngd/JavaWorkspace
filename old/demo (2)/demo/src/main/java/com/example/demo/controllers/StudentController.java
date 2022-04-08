package com.example.demo.controllers;

import com.example.demo.entities.CustomerMaster;
import com.example.demo.entities.Student;
import com.example.demo.entities.Teacher;
import com.example.demo.repositories.StudentRepository;
import com.example.demo.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.zip.GZIPOutputStream;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudentRepository _studentRepository;
    @Autowired
    private TeacherRepository teacherRepository ;

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent() throws IOException {
        Format formatter = new SimpleDateFormat("yyyyMMdd");
        String today = formatter.format(new Date());
        List<Student> list = _studentRepository.findAll();
        FileWriter writer = new FileWriter("C:\\dev\\sam\\production\\DMS0100M_" + today + ".dat");

        String test ="";
        for (Student item : list) {
            test += item.getId().toString();
            test += "|" + item.getName().toString();
            test += "|" + item.getBrithday().toString();
            test += "\r\n" ;
        }
        System.out.println(test);
        writer.write(test);

        writer.close();

        return list;
    }


    @GetMapping("/getAllTeacher")
    public List<Teacher> getAllTeacher() throws IOException {
        Format formatter = new SimpleDateFormat("yyyyMMdd");
        String today = formatter.format(new Date());
        List<Teacher> list2 = teacherRepository.findAll();
        FileWriter writer2 = new FileWriter("C:\\dev\\sam\\production\\DMS0200M_" + today + ".dat");

        String test ="";
        for (Teacher item : list2) {
            test += item.getId().toString();
            test += "|" + item.getName().toString();
            test += "|" + item.getLocation().toString();
            test += "\r\n" ;
        }
        System.out.println(test);
        writer2.write(test);
        writer2.close();

        return list2;
    }

//    @GetMapping("/getAllStudent/{id}")
//    public List<Student> getAll(@PathVariable int id) throws IOException {
//        List<T> list
//        Format formatter = new SimpleDateFormat("yyyyMMdd");
//        String today = formatter.format(new Date());
//
//        if(id == 0 || id == 1){
//            List<Student> list = _studentRepository.findAll();
//            FileWriter writer = new FileWriter("C:\\dev\\sam\\production\\DMS0100M_" + today + ".dat");
//
//            String test ="";
//            for (Student item : list) {
//                test += item.getId().toString();
//                test += "|" + item.getName().toString();
//                test += "|" + item.getBrithday().toString();
//                test += "\r\n" ;
//            }
//            System.out.println(test);
//            writer.write(test);
//
//            writer.close();
//        }
//        if(id == 0 || id == 2){
//            List<Teacher> list2 = teacherRepository.findAll();
//            FileWriter writer2 = new FileWriter("C:\\dev\\sam\\production\\DMS0200M_" + today + ".dat");
//
//            String test ="";
//            for (Teacher item : list2) {
//                test += item.getId().toString();
//                test += "|" + item.getName().toString();
//                test += "|" + item.getClassName().toString();
//                test += "\r\n" ;
//            }
//            System.out.println(test);
//            writer2.write(test);
//            writer2.close();
//        }
//
//
//
//
//        /*List<String> test = new ArrayList<>();
//        for (Student item : list) {
//            test.add(item.getId().toString());
//            test.add(item.getName().toString());
//            test.add(item.getBrithday().toString());
//            test.add("\r\n");
//        }
//        String collect = test.stream().collect(Collectors.joining("|"));
//        System.out.println(collect);
//        writer.write(collect);*/
//
//
//        return list;
//    }
}
