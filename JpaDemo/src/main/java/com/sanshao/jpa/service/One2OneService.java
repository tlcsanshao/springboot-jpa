package com.sanshao.jpa.service;

import com.sanshao.jpa.domain.one2one.Emp;
import com.sanshao.jpa.domain.one2one.EmpRepository;
import com.sanshao.jpa.domain.one2one.Identity;
import com.sanshao.jpa.domain.one2one.IdentityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.concurrent.TimeUnit;

//@Component
public class One2OneService implements CommandLineRunner {

    @Autowired
    EmpRepository empRepository;

    @Autowired
    IdentityRepository identityRepository;

    @Autowired
//    @PersistenceContext
    private EntityManager em;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Add 操作");
        Identity identity = new Identity();
        identity.setCard("12345678");
        identityRepository.save(identity);

        Emp emp = new Emp();
        emp.setEmpName("zangsan");
        emp.setIdentity(identity);
        empRepository.save(emp);


//        TimeUnit.SECONDS.sleep(10);
//        System.out.println("Delete 操作");
//        identityRepository.delete(identity);
//        empRepository.delete(emp);

//        TimeUnit.SECONDS.sleep(10);
//        System.out.println("Update1 操作");
//
//        identity = new Identity();
//        identity.setCard("000000");
//        identity.setId(1);
//
//        emp = new Emp();
//        emp.setId(2);
//        emp.setEmpName("updateName");
//        emp.setIdentity(identity);
//
//        empRepository.save(emp);
//        identityRepository.save(identity);


//        TimeUnit.SECONDS.sleep(10);
//        System.out.println("Update2 操作");
//
//        identity = identityRepository.findById(1).get();
//        identity.setCard("000000");
//
//        emp = empRepository.findById(2).get();
//        emp.setIdentity(identity);
//        emp.setEmpName("updateName");
//
//        empRepository.save(emp);
//        identityRepository.save(identity);




    }


}
