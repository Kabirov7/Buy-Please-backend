package com.example.buyplease.model;

import javax.persistence.*;

@MappedSuperclass
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "email", unique=true, nullable = false)
    String email;
    @Column(name = "name", nullable = false)
    String name;
    @Column(name = "location", nullable = false)
    String location;
    @Column(name = "contact", nullable = false)
    String contact;

    public User() {}

    public User(String email, String name, String location, String contact) {
        this.email = email;
        this.name = name;
        this.location = location;
        this.contact = contact;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
