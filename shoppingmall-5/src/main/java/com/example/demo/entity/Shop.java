package com.example.demo.entity;
import jakarta.persistence.*;
@Entity
public class Shop {
    @Id private long id;
    private String name;
    private String category;
    @ManyToOne private Mall mall;
    public long getId(){return id;} public void setId(long id){this.id=id;}
    public String getName(){return name;} public void setName(String s){this.name=s;}
    public String getCategory(){return category;} public void setCategory(String s){this.category=s;}
    public Mall getMall(){return mall;} public void setMall(Mall m){this.mall=m;}
}