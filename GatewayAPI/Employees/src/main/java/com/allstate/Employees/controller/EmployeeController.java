package com.allstate.Employees.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("api/v1/employee")
@RequestMapping("/employee")
public class EmployeeController {

   /* @GetMapping("message")
    public String getMessgae(){
        return "hi this is Employee service";
    }*/

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/servicecall")
    public String getMessage(){
        String url="http://localhost:8083/api/v1/customer/message";
        String objects=restTemplate.getForObject(url,String.class);
        return objects;
    }

}
