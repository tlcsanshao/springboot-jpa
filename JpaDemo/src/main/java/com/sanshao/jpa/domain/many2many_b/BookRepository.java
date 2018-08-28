package com.sanshao.jpa.domain.many2many_b;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface BookRepository extends JpaRepository<Book,Integer>{

    Book findByName(String name);

    ArrayList<Book> findByPriceLessThan(long price);

    ArrayList<Book> findByNameLike(String value);

    ArrayList<Book> findByNameContaining(String value);

    @Query(value="select * from book where name like %?1" ,nativeQuery=true)
    ArrayList<Book> findByNameQuery(String value);



}
