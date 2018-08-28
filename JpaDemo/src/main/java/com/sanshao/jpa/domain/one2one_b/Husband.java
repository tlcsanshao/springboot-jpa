package com.sanshao.jpa.domain.one2one_b;

import javax.persistence.*;

@Entity
public class Husband {
    @Id
    @GeneratedValue
    private int id;

    @Column(length = 40)
    private String name;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="pk_wife")
    private Wife wife;

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

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
