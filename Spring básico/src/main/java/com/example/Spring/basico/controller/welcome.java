package com.example.Spring.basico.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {


    @GetMapping("/")
    public String mensagem(){
        return "Bem-vindo";

    }

    @GetMapping("/dev")
    public  String nomeDev(){
        return "feito por: Kauã";

    }
}
