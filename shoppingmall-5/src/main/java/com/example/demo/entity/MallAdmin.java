package com.example.demo.entity;
import jakarta.persistence.*;

@Entity
public class MallAdmin {
    @Id
    private long id;
    private String mallName;
    private String location;
    private String categories;

    public MallAdmin() {}
    public long getId() { return id; }
    public void setId(long id) { this.id=id; }
    public String getMallName() { return mallName; }
    public void setMallName(String s) { this.mallName=s; }
    public String getLocation() { return location; }
    public void setLocation(String s) { this.location=s; }
    public String getCategories() { return categories; }
    public void setCategories(String s) { this.categories=s; }
}
