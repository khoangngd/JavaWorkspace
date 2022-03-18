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
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.jdbc.support.rowset.SqlRowSetMetaData;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.sql.ResultSetMetaData;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private CustomerMasterRepository customerMasterRepository;

    @Autowired
    private StudentRepository _studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    private Environment env;

    @Override
    public void run(String... args) throws Exception {
//        //jdbc
////        String sql = "SELECT * FROM DUAL";
////        List<Contract> listJDBC = jdbcTemplate.query(sql,
////                BeanPropertyRowMapper.newInstance(Contract.class));
//
//        File resource = new ClassPathResource("query\\StudentQuery.txt").getFile();
//        String queryText = new String(Files.readAllBytes(resource.toPath()));
//
//
//        //String sql = "SELECT * FROM STUDENTS";
//        String sql = queryText;
//        //List<Object> listJDBC = jdbcTemplate.queryForObject(sql, new CustomerRowMapper());
//        SqlRowSet rs = jdbcTemplate.queryForRowSet(sql);
//
//        SqlRowSetMetaData resultSetMetaData = rs.getMetaData();
//        int columnsNumber = resultSetMetaData.getColumnCount();
//
//        String test ="";
//        while (rs.next()){
//            for (int i = 1; i <= columnsNumber; i++) {
//                test += rs.getString(i).toString();
//                if(i>0 && i<columnsNumber){
//                    test += "|";
//                }
//                if(i == columnsNumber){
//                    test += "\r\n" ;
//                }
//            }
//        }
//
//        System.out.println(test);
//
//
//        Format formatter = new SimpleDateFormat("yyyyMMdd");
//        String today = formatter.format(new Date());
//        FileWriter writer = new FileWriter("C:\\dev\\sam\\production\\DMS0100M_" + today + ".dat");
//        writer.write(test);
//        writer.close();
//
//
//
//
//
//
//
//        //jpa
////        List<Student> listJPA = _studentRepository.findAll();
////        listJPA.forEach(System.out::println);
//
//
////        String path = env.getProperty("spring.datasource.url");
////        System.out.println(path);
    }
}
