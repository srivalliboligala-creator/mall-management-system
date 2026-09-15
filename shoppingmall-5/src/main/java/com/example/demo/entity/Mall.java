package com.example.demo.entity;
import jakarta.persistence.*;
@Entity
public class Mall {
    @Id private long id;
    private String name;
    private String location;
    private String category;
    public long getId(){return id;} public void setId(long id){this.id=id;}
    public String getName(){return name;} public void setName(String s){this.name=s;}
    public String getLocation(){return location;} public void setLocation(String s){this.location=s;}
    public String getCategory(){return category;} public void setCategory(String s){this.category=s;}
}