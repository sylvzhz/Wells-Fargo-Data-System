package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity/*an entity represents a table in a relational database,
        and each entity instance corresponds to a row in that table.*/
public class Client {
    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne()
    private Advisor advisor;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Client() {

    }

    //constructor (for initialization)
    public Client(Advisor advisor, String firstName, String lastName, int age, String address, String phone, String email) {
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    //getters & setters (for changing)
    public Long getClientId() {
        return clientId;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor){
        this.advisor = advisor;
    }

    public int getClientAge(){
        return age;
    }

    public void setClientAge(int age){
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
