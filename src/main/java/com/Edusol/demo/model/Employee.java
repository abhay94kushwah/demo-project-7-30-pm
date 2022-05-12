package com.Edusol.demo.model;

public class Employee {
    String name;
    String Departmrnt;
    int ID;

    public Employee(String name, String departmrnt, int ID) {
        this.name = name;
        Departmrnt = departmrnt;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmrnt() {
        return Departmrnt;
    }

    public void setDepartmrnt(String departmrnt) {
        Departmrnt = departmrnt;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
