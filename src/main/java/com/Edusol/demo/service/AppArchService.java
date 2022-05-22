package com.Edusol.demo.service;

import com.Edusol.demo.repository.AppArchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppArchService {
    @Autowired
    AppArchRepo obj;
    public String addemployee(){

        return obj.addemployee();
    }
}
