package com.tungphan.designpatternsample.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TungPhan on 1/4/18.
 */

public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subOrdinates;

    public Employee(String name, String dept, int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subOrdinates = new ArrayList<>();
    }

    public void add(Employee employee){
        subOrdinates.add(employee);
    }

    public void remove(Employee employee){
        subOrdinates.remove(employee);
    }

    public List<Employee> getSubOrdinates(){
        return subOrdinates;
    }

    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }
}
