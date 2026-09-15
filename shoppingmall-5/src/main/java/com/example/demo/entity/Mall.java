package com.example.demo.entity;


import jakarta.persistence.*;

@Entity
public class Mall {
    @Id
    private long id;
    
    @OneToOne
    private MallAdmin mallAdmin;
    
    private String mallName;
    private String location;
    private String shops_id;
    private String categories;

    // Getters and Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public MallAdmin getMallAdmin() { return mallAdmin; }
    public void setMallAdmin(MallAdmin mallAdmin) { this.mallAdmin = mallAdmin; }

    public String getMallName() { return mallName; }
    public void setMallName(String mallName) { this.mallName = mallName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getShops_id() { return shops_id; }
    public void setShops_id(String shops_id) { this.shops_id = shops_id; }

    public String getCategories() { return categories; }
    public void setCategories(String categories) { this.categories = categories; }
}