package com.example.asst.asssunto2.Repository;

import com.example.asst.asssunto2.Model.Modeljogadores;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public interface RepositoryJogadores {

    List<Modeljogadores.Jogador> listar();

    Modeljogadores.Jogador salvar(Modeljogadores.Jogador jogador);

    @Repository
    public class JogadorRepository {

        private final List<Modeljogadores> lista = new ArrayList<>();

        public List<Modeljogadores> listar() {
            return lista;
        }

        public Modeljogadores salvar(Modeljogadores jogador) {
            lista.add(jogador);
            return jogador;
        }
    }
}
