package com.Edusol.demo.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_controller_pathvariable {
    @RequestMapping("/Addition/{a}/{b}")
    public String add(@PathVariable int a,@PathVariable int b){
        return "Addition :"+(a+b);
    }
    @RequestMapping("/subtraction/{a}/{b}")
    public String Sub(@PathVariable int a,@PathVariable int b){
        return "Subtraction :"+(a-b);
    }
}
