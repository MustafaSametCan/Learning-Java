package com.springboot.redisapp.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

    @Cacheable(cacheNames = "mySpecialCache")
    public String longRunningMethod() throws InterruptedException {
        Thread.sleep(5000L);
        return "method is working";

    }
    @CacheEvict(cacheNames = "mySpecialCache")
    public void clearCache(){
        System.out.println("cache cleaned");
    }
}
