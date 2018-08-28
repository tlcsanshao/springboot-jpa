package com.sanshao.jpa.service;

import com.sanshao.jpa.domain.one2one_b.Husband;
import com.sanshao.jpa.domain.one2one_b.HusbandRepository;
import com.sanshao.jpa.domain.one2one_b.Wife;
import com.sanshao.jpa.domain.one2one_b.WifeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

//@Component
public class One2OnebService implements CommandLineRunner {

    @Autowired
    HusbandRepository husbandRepository;

    @Autowired
    WifeRepository wifeRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("添加");
        Wife wife = new Wife();
        wife.setName("女1");

        Husband husband = new Husband();
        husband.setName("男1");

        husband.setWife(wife);

        wifeRepository.save(wife);
        husbandRepository.save(husband);

//        TimeUnit.SECONDS.sleep(10);
//        System.out.println("Delete 操作");
//        wifeRepository.delete(wife);
//        husbandRepository.delete(husband);

        TimeUnit.SECONDS.sleep(10);
        System.out.println("Update 操作");

        husband = husbandRepository.findById(2).get();
        husband.setName("男2");

        wife = wifeRepository.findById(1).get();
        wife.setName("女2");
        husband.setWife(wife);

        wifeRepository.save(wife);
        husbandRepository.save(husband);

    }


}
