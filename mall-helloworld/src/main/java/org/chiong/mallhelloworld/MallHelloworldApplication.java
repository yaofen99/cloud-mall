package org.chiong.mallhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class MallHelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallHelloworldApplication.class, args);
    }

    @Bean
    public Function<String, String> upperCase(){
        return valur -> valur.toUpperCase();
    }

}



