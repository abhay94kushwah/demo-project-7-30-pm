package com.Edusol.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    @RequestMapping("/add")
    public int add(){
        int a=4;
        int b=5;
        return a+b;
    }
    @RequestMapping("/sub")
    public int sub(){
        int a=5;
        int b=3;
        return a-b;
    }
    @RequestMapping("/multi")
    public int multi(){
        int a=3;
        int b=3;
        return a*b;
    }
    @RequestMapping("/divide")
    public int divide(){
        int a=10;
        int b=2;
        return a/b;
    }
        }
