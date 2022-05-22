package com.Edusol.demo.controller;

import com.Edusol.demo.service.AppArchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppArchController {
    @Autowired
    AppArchService obj;
    @RequestMapping("/employee_added")
    public String addemployee(){
        return obj.addemployee();
    }
}
