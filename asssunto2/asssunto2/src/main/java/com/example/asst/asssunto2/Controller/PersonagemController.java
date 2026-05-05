package com.example.asst.asssunto2.Controller;

import com.example.asst.asssunto2.Service.ServicePersonagens;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {

    private final ServicePersonagens service;

    public PersonagemController(ServicePersonagens service) {
        this.service = service;
    }

    @GetMapping
    public <Personagem> List<Personagem> listar() {
        return service.listar();
    }

    @PostMapping
    public <Personagem> Personagem salvar(@RequestBody Personagem personagem) {
        return service.salvar(personagem);
    }
}