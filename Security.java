package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Security{

    @Id
    @GeneratedValue
    private long portfolioID; //private: only accessible within the declared class

    @Column(nullable = false)
    private String securityCategory; //declare attributes

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private long quantity;

    protected Security(){

    }

    public Security(String securityCategory,String purchaseDate,String purchasePrice, long quantity){ //constructor with parameter
        this.securityCategory = securityCategory; // Set the initial value for the class attributes
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    };

    public long getPortfolioID(){
        return portfolioID;
    }

    public String getSecurityCategory(){
        return securityCategory;
    }

    public void setSecurityCategory(String securityCategory){
        this.securityCategory = securityCategory;
    }

    public String getPurchaseDate(){
        return purchaseDate;
    }

    public void setPurchaseDate(String pd){
        this.purchaseDate = pd;
    }

    public String getPurchasePrice(){
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public long getQuantity(){
        return quantity;
    }

    public void setQuantity(long quantity){
        this.quantity = quantity;
    }
};


