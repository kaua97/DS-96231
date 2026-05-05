package com.example.asst.asssunto2.Controller;

import com.example.asst.asssunto2.Model.Modeljogadores;
import com.example.asst.asssunto2.Service.ServiceJogadores;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class Controllerjogadores {


    @RestController
    @RequestMapping("/jogadores")
    public class JogadorController {

        private final ServiceJogadores service;

        public JogadorController(ServiceJogadores service) {
            this.service = service;
        }

        @GetMapping
        public List<Modeljogadores.Jogador> listar() {
            return service.listar();
        }

        @PostMapping
        public Modeljogadores.Jogador salvar(@RequestBody Modeljogadores jogador) {
            return service.salvar(jogador);
        }
    }

}