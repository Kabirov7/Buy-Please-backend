package com.example.buyplease.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "employers")
public class Employee extends User {
    @Column(name="salary")
    double salary;
    @Column(name="commission")
    double commission;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Shop> shops;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}