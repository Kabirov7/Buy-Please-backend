package com.example.buyplease.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends ABC {
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Shop> shops;

    public User() {
    }

    public User(String name, String desc) {
        this.name = name;
        this.description = desc;
    }

    public User(String name, String desc, Set<Shop> shops) {
        this.name = name;
        this.description = desc;
        this.shops = shops;
    }
}
