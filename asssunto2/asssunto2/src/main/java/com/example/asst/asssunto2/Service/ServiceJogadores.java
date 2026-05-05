package com.example.asst.asssunto2.Service;

import com.example.asst.asssunto2.Model.Modeljogadores;
import com.example.asst.asssunto2.Repository.RepositoryJogadores;
import org.springframework.stereotype.Service;

import java.util.List;

public class ServiceJogadores {


    public List<Modeljogadores.Jogador> listar() {
        return List.of();
    }

    public Modeljogadores salvar(Modeljogadores jogador) {
        return jogador;
    }

    @Service
    public static class JogadorService {

        private final RepositoryJogadores repository;

        public JogadorService(RepositoryJogadores repository) {
            this.repository = repository;
        }

        public List<Modeljogadores.Jogador> listar() {
            return repository.listar();
        }

        public Modeljogadores.Jogador salvar(Modeljogadores.Jogador jogador) {
            return repository.salvar(jogador);
        }
    }
}
