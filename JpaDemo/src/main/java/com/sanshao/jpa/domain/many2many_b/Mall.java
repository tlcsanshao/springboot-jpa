package com.sanshao.jpa.domain.many2many_b;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Mall {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @ManyToMany(mappedBy = "mallList")
    private List<Book> bookList = new ArrayList<Book>();

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

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBooks(Book book){
        bookList.add(book);
    }

    @Override
    public String toString() {
        return "Mall{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
