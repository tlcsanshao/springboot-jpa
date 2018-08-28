package com.sanshao.jpa.domain.one2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Identity {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String card;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "id=" + id +
                ", card='" + card + '\'' +
                '}';
    }
}
