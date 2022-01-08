package com.example.buyplease.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "customers")
public class Customer extends User {
    @Column(name = "points")
    private double points = 0;
    @Column(name = "total_spent")
    private double totalSpent = 0;

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public double getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(double totalSpent) {
        this.totalSpent = totalSpent;
    }
}
