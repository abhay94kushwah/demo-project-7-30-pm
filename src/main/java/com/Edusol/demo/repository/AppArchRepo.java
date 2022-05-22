package com.Edusol.demo.repository;

import com.Edusol.demo.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class AppArchRepo {
    ArrayList<Employee>employeeArrayList=new ArrayList<>();
    public String addemployee(){
        Employee employee=new Employee("Abhay","IT",658);
        employeeArrayList.add(employee);
        return "Employee added by repository...";

    }
    }

