package com.Edusol.demo.Controller;

import com.Edusol.demo.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Employeecontroller {
    ArrayList<Employee> EmployeeList=new ArrayList<>();
    //create
    @RequestMapping(value = "/addone",method = RequestMethod.POST)
    public String AddEmployee( @RequestBody Employee employee){
        EmployeeList.add(employee);
        return "Employee added....";
    }
    //Read
    @RequestMapping(value = "/get_all",method = RequestMethod.GET)
    public ArrayList<Employee> getEmployeeList(){
        return EmployeeList;
    }
    //update
    @RequestMapping(value = "/updated",method = RequestMethod.PUT)
    public String updateEmployee(@RequestParam String name){
        EmployeeList.get(0).setName(name);
        return "Update added..."+name;
    }
    //Delete
    @RequestMapping(value = "/removing",method = RequestMethod.DELETE)
    public String remove(@RequestParam int index){
        EmployeeList.remove(index);
        return "removal success...";
    }


}
