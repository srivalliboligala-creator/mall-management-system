package com.example.demo.entity;

import jakarta.persistence.*; import java.time.LocalDate;
@Entity public class Employee {
 @Id private long id; private String name; private LocalDate dob; private float salary; private String address; private String designation;
 @ManyToOne private Shop shop;
 public long getId(){return id;} public void setId(long id){this.id=id;}
 public String getName(){return name;} public void setName(String s){this.name=s;}
 public LocalDate getDob(){return dob;} public void setDob(LocalDate d){this.dob=d;}
 public float getSalary(){return salary;} public void setSalary(float s){this.salary=s;}
 public String getAddress(){return address;} public void setAddress(String s){this.address=s;}
 public String getDesignation(){return designation;} public void setDesignation(String s){this.designation=s;}
 public Shop getShop(){return shop;} public void setShop(Shop s){this.shop=s;}
}