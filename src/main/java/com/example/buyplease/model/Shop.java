package com.example.buyplease.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "shops")
public class Shop extends ABC{
    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinTable(
//            name = "user_shoop",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "book_id")
//    )
    private User user;

    public Shop(){}
    public Shop(String name, String desc, User user){
        this.name = name;
        this.description = desc;
        this.user = user;
    }

    public User getUser() {
        return user;
    }
//
    public void setUser(User user) {
        this.user = user;
    }
}
