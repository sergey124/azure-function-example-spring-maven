package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.example.function.SampleFunction;
import com.example.function.SampleHandler;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public SampleHandler sampleHandler(SampleFunction sampleFunction){
        return new SampleHandler(sampleFunction);
    }

    @Bean
    public SampleFunction sampleFunction(){
        return new SampleFunction();
    }
}