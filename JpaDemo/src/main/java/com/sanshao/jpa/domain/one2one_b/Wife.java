package com.sanshao.jpa.domain.one2one_b;

import javax.persistence.*;

@Entity
public class Wife {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

    @OneToOne(mappedBy = "wife")
    private Husband husband;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
}
