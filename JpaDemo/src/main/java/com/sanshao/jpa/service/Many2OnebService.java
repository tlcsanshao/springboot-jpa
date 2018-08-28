package com.sanshao.jpa.service;

import com.sanshao.jpa.domain.many2one.Classroom;
import com.sanshao.jpa.domain.many2one.ClassroomRepository;
import com.sanshao.jpa.domain.many2one.Student;
import com.sanshao.jpa.domain.many2one.StudentRepository;
import com.sanshao.jpa.domain.many2one_b.Article;
import com.sanshao.jpa.domain.many2one_b.ArticleRepository;
import com.sanshao.jpa.domain.many2one_b.Author;
import com.sanshao.jpa.domain.many2one_b.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

//@Component
public class Many2OnebService implements CommandLineRunner {
    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("添加");
        Author author = new Author();
        author.setName("zhangsan");

        Article article1 = new Article();
        Article article2 = new Article();
        article1.setName("article1");
        article2.setName("article2");

        article1.setAuthor(author);
        article2.setAuthor(author);


        author.getArticleList().add(article1);
        author.getArticleList().add(article2);

        authorRepository.save(author);
        articleRepository.save(article1);
        articleRepository.save(article2);


        TimeUnit.SECONDS.sleep(1);
        System.out.println("Delete 操作");

        articleRepository.delete(article1);
        articleRepository.delete(article2);

//        Author author1 = new Author();
//        author1.setId(1);
//        authorRepository.delete(author1);

//        author.setArticleList(new ArrayList<Article>());
        author.setArticleList(null);
        authorRepository.delete(author);


//        TimeUnit.SECONDS.sleep(2);
//        System.out.println("Update 操作");
//
//        author = authorRepository.findById(1).get();
//        author.setName("lisi");
//
//        article1 = articleRepository.findById(2).get();
//        article1.setName("test");
//
//        article2 = articleRepository.findById(3).get();
//        article2.setName("demo");
//
//
//        articleRepository.save(article1);
//        articleRepository.save(article2);
//        authorRepository.save(author);

    }
}
