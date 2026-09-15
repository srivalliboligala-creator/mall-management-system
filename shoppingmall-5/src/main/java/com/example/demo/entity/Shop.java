package com.example.demo.entity;

import jakarta.persistence.*;
@Entity public class Shop {
 @Id private long id; private String shopCategory; private String shopName; private String shopStatus; private String leaseStatus;
 @ManyToOne private ShopOwner shopOwner;
 public long getId(){return id;} public void setId(long id){this.id=id;}
 public String getShopCategory(){return shopCategory;} public void setShopCategory(String s){this.shopCategory=s;}
 public String getShopName(){return shopName;} public void setShopName(String s){this.shopName=s;}
 public String getShopStatus(){return shopStatus;} public void setShopStatus(String s){this.shopStatus=s;}
 public String getLeaseStatus(){return leaseStatus;} public void setLeaseStatus(String s){this.leaseStatus=s;}
 public ShopOwner getShopOwner(){return shopOwner;} public void setShopOwner(ShopOwner o){this.shopOwner=o;}
}
