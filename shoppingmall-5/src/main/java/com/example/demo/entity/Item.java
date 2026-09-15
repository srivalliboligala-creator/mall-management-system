package com.example.demo.entity;

import jakarta.persistence.*; import java.time.LocalDate;
@Entity public class Item {
 @Id private long id; private String name; private LocalDate manufacturing; private LocalDate expiry; private float price; private String category;
 @ManyToOne private Shop shop;
 public long getId(){return id;} public void setId(long id){this.id=id;}
 public String getName(){return name;} public void setName(String s){this.name=s;}
 public LocalDate getManufacturing(){return manufacturing;} public void setManufacturing(LocalDate d){this.manufacturing=d;}
 public LocalDate getExpiry(){return expiry;} public void setExpiry(LocalDate d){this.expiry=d;}
 public float getPrice(){return price;} public void setPrice(float p){this.price=p;}
 public String getCategory(){return category;} public void setCategory(String s){this.category=s;}
 public Shop getShop(){return shop;} public void setShop(Shop s){this.shop=s;}
}