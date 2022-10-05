package com.example.springaop;

import com.example.springaop.com.plannet.IPlannet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(IPlannet iPlannet){
        return args -> {
            try {
                iPlannet.revolve();
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
    }
}
