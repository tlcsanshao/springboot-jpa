package com.sanshao.jpa.domain.many2one;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Classroom classroom;

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

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
