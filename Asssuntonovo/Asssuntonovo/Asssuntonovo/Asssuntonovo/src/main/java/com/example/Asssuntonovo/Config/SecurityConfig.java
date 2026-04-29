package com.example.Asssuntonovo.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password4j.BcryptPassword4jPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.security.Security;

@Configuration
public class SecurityConfig {


    @Bean
    public BcryptPassword4jPasswordEncoder bcryptPassword4jPasswordEncoder(){
    return new BcryptPassword4jPasswordEncoder();

}

@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity htpp) throws Exception{
    htpp
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth.anyRequest().permitAll());

    return htpp.build();
}
}
