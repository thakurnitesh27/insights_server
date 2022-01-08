package com.thakurnitesh27.insights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InsightsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsightsApplication.class, args);
	}

	@Bean
    public CacheManager getCacheManager(){
       return new SimpleCacheManager();
    }

}
