package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioID;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio(){

    }

    public Portfolio(Client client, String creationDate){//constructor for initialization
        this.client = client;
        this.creationDate = creationDate;
    }


    public long getPortfolioID(){
        return portfolioID;
    }

    public Client getClient(){
        return client;
    }
    public void setClient(Client client){
        this.client = client;
    }

    public String getCreationDate(){
        return creationDate;
    }

    public void setCreationDate(String creationDate){
        this.creationDate = creationDate;
    }

}

