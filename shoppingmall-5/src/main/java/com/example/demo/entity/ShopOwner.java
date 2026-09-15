package com.example.demo.entity;

import jakarta.persistence.*; import java.time.LocalDate;
@Entity public class ShopOwner {
 @Id private long id; private String name; private LocalDate dob; private String address;
 public long getId(){return id;} public void setId(long id){this.id=id;}
 public String getName(){return name;} public void setName(String s){this.name=s;}
 public LocalDate getDob(){return dob;} public void setDob(LocalDate d){this.dob=d;}
 public String getAddress(){return address;} public void setAddress(String s){this.address=s;}
}
