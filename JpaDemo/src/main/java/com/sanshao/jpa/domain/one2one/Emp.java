package com.sanshao.jpa.domain.one2one;

import javax.persistence.*;

@Entity
public class Emp {
    @Id
    @GeneratedValue
    private int id;

    @Column(length = 40)
    private String empName;

    @OneToOne(cascade = CascadeType.ALL)
    private Identity identity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Identity getIdentity() {
        return identity;
    }

    public void setIdentity(Identity identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", identity=" + identity +
                '}';
    }
}
