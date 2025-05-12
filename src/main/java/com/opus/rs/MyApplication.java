package com.opus.rs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyApplication {

    @Autowired
    private MyIncDec myIncDec;

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(MyApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> aopTimeExtraction();
    }

    private void aopTimeExtraction() {
        myIncDec.increment();
        myIncDec.decrement();
    }
}
