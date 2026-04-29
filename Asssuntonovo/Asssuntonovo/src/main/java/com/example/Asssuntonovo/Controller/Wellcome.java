package com.example.Asssuntonovo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Wellcome {
    @GetMapping("/")
    public String bemvindo(){
        return "Seja bem vindo ao novo projeto";
    }

    @GetMapping("/dev")
    public String desenvolver(){
        return "Desenvolvedor: KAUA victor";
    }

}
