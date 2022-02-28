package com.fullstackapp.employeemanager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String number;
    private String title;
    @Column(nullable = false, updatable = false)
    private String empCode;
    private String imageUrl;
    

    public Employee(){}

    public Employee(String name, String email, String number, String title, String empCode, String imageUrl){
        this.name = name;
        this.email = email;
        this.number = number;
        this.title = title;
        this.empCode = empCode;
        this.imageUrl = imageUrl;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getEmpCode(){
        return empCode;
    }

    public void setEmpCode(String empCode){
        this.empCode = empCode;
    }

    public String getImageUrl(){
        return imageUrl;
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

    // Print Employee information
    @Override
    public String toString(){
        return "Employee{" +
        "id=" + id + 
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", number='" + number + '\'' +
        ", JobTitle='" + title + '\'' +
        ", imageUrl='" + imageUrl + '\'' +
        '}';

    }

}
