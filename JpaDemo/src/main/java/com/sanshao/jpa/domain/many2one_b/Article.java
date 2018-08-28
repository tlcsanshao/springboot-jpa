package com.sanshao.jpa.domain.many2one_b;

import javax.persistence.*;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToOne
    private Author author;

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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
