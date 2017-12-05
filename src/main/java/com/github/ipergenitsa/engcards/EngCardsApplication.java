package com.github.ipergenitsa.engcards;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EngCardsApplication  {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .listeners(new ApplicationEnvironmentPreparedEventListener())
                .sources(EngCardsApplication.class)
                .run(args);
    }
}
