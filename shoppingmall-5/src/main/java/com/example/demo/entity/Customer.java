package com.example.demo.entity;

import jakarta.persistence.*;
@Entity public class Customer {
 @Id private long id; private String name; private String phone; private String email;
 @ManyToOne private Shop shop;
 public long getId(){return id;} public void setId(long id){this.id=id;}
 public String getName(){return name;} public void setName(String s){this.name=s;}
 public String getPhone(){return phone;} public void setPhone(String s){this.phone=s;}
 public String getEmail(){return email;} public void setEmail(String s){this.email=s;}
 public Shop getShop(){return shop;} public void setShop(Shop s){this.shop=s;}
}