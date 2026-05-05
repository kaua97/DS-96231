package com.example.asst.asssunto2.Service;

import com.example.asst.asssunto2.Model.ModelPersonagens;
import com.example.asst.asssunto2.Repository.RepositoryPersonagens;
import org.springframework.stereotype.Service;

import java.util.List;

public class ServicePersonagens {

    public <Personagem> List<Personagem> listar() {
        return List.of();
    }

    public <Personagem> Personagem salvar(Personagem personagem) {
        return personagem;
    }

    @Service
    public static class PersonagemService {

        private final RepositoryPersonagens repository;

        public PersonagemService(RepositoryPersonagens repository) {
            this.repository = repository;
        }

        public <Personagem> List<Personagem> listar() {
            return repository.listar();
        }

        public ModelPersonagens salvar(ModelPersonagens personagem) {
            return repository.salvar(personagem);


            public ServicePersonagens buscarPorId(Long id) {
                return repository.findAll()
                        .stream()
                        .filter(p -> p.getId().equals(id))
                        .findFirst()
                        .orElseThrow(() -> new RecursoNaoEncontradoException("Personagem não encontrado"));
            }
        }
        }
    }
}
