package com.Edusol.demo.Controller;

import com.Edusol.demo.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Employeecontroller {
    ArrayList<Employee> EmployeeList=new ArrayList<>();
    @RequestMapping("/addone")
    public String AddEmployee(){
        Employee employee=new Employee("Manoj pathak","IT",789);
        EmployeeList.add(employee);
        return "Employee added....";
    }
    @RequestMapping("/get_all")
    public ArrayList<Employee> getEmployeeList(){
        return EmployeeList;
    }
    @RequestMapping("/updated")
    public String updateEmployee(@RequestParam String name){
        EmployeeList.get(0).setName(name);
        return "Update added..."+name;
    }
    @RequestMapping("/removing")
    public String remove(@RequestParam int index){
        EmployeeList.remove(index);
        return "removal success...";
    }


}
