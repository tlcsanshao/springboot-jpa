package com.sanshao.jpa.service;

import com.sanshao.jpa.domain.many2many_b.Book;
import com.sanshao.jpa.domain.many2many_b.BookRepository;
import com.sanshao.jpa.domain.many2many_b.Mall;
import com.sanshao.jpa.domain.many2many_b.MallRepository;
import com.sanshao.jpa.domain.many2one_b.Article;
import com.sanshao.jpa.domain.many2one_b.ArticleRepository;
import com.sanshao.jpa.domain.many2one_b.Author;
import com.sanshao.jpa.domain.many2one_b.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

//@Component
public class Many2ManybService implements CommandLineRunner {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    MallRepository mallRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("添加");

        Book book1 = new Book();
        book1.setName("红楼四大名著");
        book1.setPrice(100);

        Book book2 = new Book();
        book2.setName("三国四大名著");
        book2.setPrice(50);

        Mall mall1 = new Mall();
        mall1.setName("京东");

        Mall mall2 = new Mall();
        mall2.setName("淘宝");

        book1.addMalls(mall1);
        book1.addMalls(mall2);

        book2.addMalls(mall1);
        book2.addMalls(mall2);

        mallRepository.save(mall1);
        mallRepository.save(mall2);
        bookRepository.save(book1);
        bookRepository.save(book2);

//        TimeUnit.SECONDS.sleep(1);
////        System.out.println("Delete 操作");
////
////        bookRepository.delete(book1);
////        bookRepository.delete(book2);
////        mallRepository.delete(mall1);
////        mallRepository.delete(mall2);

        Book queryBook = bookRepository.findByName("三国");
        System.out.println(queryBook);

//        System.out.println(bookRepository.findByNameContaining("四大名著"));

//        System.out.println(bookRepository.findByNameLike("%三%"));

//        System.out.println(bookRepository.findByPriceLessThan(120));

        System.out.println(bookRepository.findByNameQuery("%三国%"));


    }
}
