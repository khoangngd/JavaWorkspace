package com.tls.controllers;

import com.tls.entities.Contract;
import com.tls.repositories.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
@Controller
//@RequestMapping("/api/v1")
public class ContractController {

    @Autowired
    private ContractRepository contractRepository;
    @GetMapping("/home")
    public String homePage(Model model){
        //List<Contract> data = contractRepository.findAll();
        model.addAttribute("contractlist",contractRepository.findAll());
        return "home";
    }

    @GetMapping("/home2")
    public String homePage2(Model model){
        //List<Contract> data = contractRepository.findAll();
        model.addAttribute("contractlist",contractRepository.findAll());
        return "home2";
    }

//    @GetMapping("/contracts")
//    public List < Contract > getAllContracts() {
//        return contractRepository.findAll();
//    }
}
