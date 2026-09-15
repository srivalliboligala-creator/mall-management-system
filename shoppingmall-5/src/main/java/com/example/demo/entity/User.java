package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    private long id;
    private String name;
    private String type;
    private String password;

    public long getId(){return id;}
    public void setId(long id){this.id=id;}

    public String getName(){return name;}
    public void setName(String s){this.name=s;}

    public String getType(){return type;}
    public void setType(String s){this.type=s;}

    public String getPassword(){return password;}
    public void setPassword(String s){this.password=s;}
}