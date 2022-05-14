package com.Edusol.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Request_paramcontroller {
    @RequestMapping("/multiplication")
    public String multi(@RequestParam int a,@RequestParam int b){
        return "Multi is :"+(a*b);
    }
    @RequestMapping("/division")
    public String divide(@RequestParam int a,@RequestParam int b){
        return "Divide is :"+(a/b);
    }
}
