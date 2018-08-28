package com.sanshao.jpa.domain.many2many_b;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private long price;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Mall> mallList = new ArrayList<Mall>();

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

    public List<Mall> getMallList() {
        return mallList;
    }

    public void setMallList(List<Mall> mallList) {
        this.mallList = mallList;
    }

    public void addMalls(Mall mall){
       mallList.add(mall);
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", mallList=" + mallList +
                '}';
    }
}
