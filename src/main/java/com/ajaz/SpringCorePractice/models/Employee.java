package com.ajaz.SpringCorePractice.models;

import com.ajaz.bank.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "emp")
@Scope("prototype")
public class Employee {
    @Value("${id}")
    private Long id;
    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;

    @Value("${salary}")
    private Long salary;

    @Autowired
    private Address address;

    @Autowired
    private Account account;

    Employee(){
        System.out.println("Employee() object created.");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        System.out.println(account);
        System.out.println(address);
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}' + "\n" + "-------------------------------------------------------";

    }
}
