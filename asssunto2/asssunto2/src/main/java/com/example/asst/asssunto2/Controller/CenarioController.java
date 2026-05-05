package com.example.asst.assunto2.controller;

import com.example.asst.asssunto2.Service.ServiceCenarios;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cenarios")
public class CenarioController {

    private final ServiceCenarios service;

    public CenarioController(ServiceCenarios service) {
        this.service = service;
    }

    @GetMapping
    public <Cenario> List<Cenario> listar() {
        return service.listar();
    }

    @PostMapping
    public <Cenario> Cenario salvar(@RequestBody Cenario cenario) {
        return service.salvar(cenario);
    }
}