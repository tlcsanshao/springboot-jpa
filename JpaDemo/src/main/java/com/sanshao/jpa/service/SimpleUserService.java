package com.sanshao.jpa.service;


import com.sanshao.jpa.domain.simple.SimpleUser;
import com.sanshao.jpa.domain.simple.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;



//@Component
public class SimpleUserService {
    @Autowired
    UserRepository userRepository;

//    @Scheduled(fixedDelay = 1000)
    public void testJpa(){
        for(int i=0;i<100;i++) {
            SimpleUser user = new SimpleUser();
            user.setAge(1);
            user.setName("sanshao");
            try {
                TimeUnit.MICROSECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            userRepository.save(user);
        }
    }




}
