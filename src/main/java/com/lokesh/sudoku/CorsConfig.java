package com.lokesh.sudoku;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {

                registry.addMapping("/**")   // 🔥 sab endpoints allow
                        .allowedOrigins("*") // 🔥 sab domains allow (vercel, mobile, etc)
                        .allowedMethods("*") // 🔥 GET, POST sab allow
                        .allowedHeaders("*");
            }
        };
    }
}
