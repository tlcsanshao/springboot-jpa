package com.sanshao.jpa.service.EhcacheDemo;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "instruments")
public class EchCurdService {

    @Cacheable(key="#id")
    public void qq(long id){
        System.out.println("1111world");
//        ehcacheRepository.findById(id);
    }
}
