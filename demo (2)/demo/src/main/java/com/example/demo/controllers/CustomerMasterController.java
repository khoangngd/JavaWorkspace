package com.example.demo.controllers;

import com.example.demo.entities.CustomerMaster;
import com.example.demo.repositories.CustomerMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class CustomerMasterController {
    @Autowired
    private CustomerMasterRepository customerMasterRepository;

    @GetMapping("/getAll")
    public List<CustomerMaster> getAll() {
        //return customerMasterRepository.findAll();
        List<CustomerMaster> list = new ArrayList<CustomerMaster>();
        list.add(new CustomerMaster("1"));
        list.add(new CustomerMaster("2"));
        list.add(new CustomerMaster("3"));
        return list;
    }

    @GetMapping("/getById/{id}")
    public List<CustomerMaster> getById(@PathVariable int id) {
        //return customerMasterRepository.findAll();
        List<CustomerMaster> list = new ArrayList<CustomerMaster>();

        if (id == 0) {
            list.add(new CustomerMaster("1"));
            list.add(new CustomerMaster("2"));
            list.add(new CustomerMaster("3"));
        }
        return list;
    }


}
