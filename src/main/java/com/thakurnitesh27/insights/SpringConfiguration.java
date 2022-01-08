package com.thakurnitesh27.insights;


import com.thakurnitesh27.insights.service.ProblemFetcherService;
import com.thakurnitesh27.insights.service.ProblemFetcherServiceImpl;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cache.CacheManager;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class SpringConfiguration {

    @Bean
    public CacheManager getCacheManager(){
        return new SimpleCacheManager();
    }

//    @Bean
//    public ProblemFetcherService getProblemFetcherService(){
//        return new ProblemFetcherServiceImpl(getCacheManager());
//    }
}

