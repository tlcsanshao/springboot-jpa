package com.sanshao.jpa.service.EhcacheDemo;


import com.sanshao.jpa.domain.ecache.EhcacheObject;
import com.sanshao.jpa.domain.ecache.EhcacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class EchService implements CommandLineRunner{
    @Autowired
    EhcacheRepository ehcacheRepository;

    @Autowired
    EchCurdService echCurdService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("start");
        EhcacheObject ehcacheObject = new EhcacheObject();
        ehcacheObject.setName("Test");
        ehcacheRepository.save(ehcacheObject);

        echCurdService.qq(1);
        echCurdService.qq(1);

//        query(1);
//        query(1);

    }


    @Cacheable(key="#id")
    public void query(long id){
        System.out.println("world");
//        ehcacheRepository.findById(id);
    }
}
