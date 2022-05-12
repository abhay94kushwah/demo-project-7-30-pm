package com.Edusol.demo.Controller;
import com.Edusol.demo.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
@RestController
public class Employee_list {
    @RequestMapping("/employee")
    public ArrayList<Employee> createEmployeeList(){
        ArrayList<Employee> EmployeeList=new ArrayList<>();
        Employee employee1=new Employee("Ramesh singh","Banking",456);
        Employee employee2=new Employee("Manoj pathak","IT",789);
        return EmployeeList;
    }
    @RequestMapping("/employee")
    public static void main(String[] args){
        Employee_list obj=new Employee_list();
        ArrayList<Employee> EmployeeList=obj.createEmployeeList();
        for(Employee var : EmployeeList){
            System.out.println("printing :"+var.getDepartmrnt()+" :"+var.getName()+" :"+var.getID());
        }
    }
}
