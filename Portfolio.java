package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioID;

    @Column(nullable = false)
    private String ownerName;

    @Column(nullable = false)
    private long numOfSecurity;

    protected Portfolio(){

    }

    public Portfolio(String ownerName, long numOfSecurity){//constructor for initialization
        this.ownerName = ownerName;
        this.numOfSecurity = numOfSecurity;
    }

    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public long getNumOfSecurity(){
        return numOfSecurity;
    }
    public void setNumOfSecurity(long numOfSecurity){
        this.numOfSecurity = numOfSecurity;
    }

}

