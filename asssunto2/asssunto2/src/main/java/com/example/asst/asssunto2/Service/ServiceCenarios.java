package com.example.asst.asssunto2.Service;

import com.example.asst.asssunto2.Model.Modelcenarios;
import com.example.asst.asssunto2.Repository.Repositorycenarios;
import org.springframework.stereotype.Service;

import java.util.List;

public class ServiceCenarios {


    public <Cenario> List<Cenario> listar() {
        return List.of();
    }

    public <Cenario> Cenario salvar(Cenario cenario) {
        return cenario;
    }

    @Service
    public static class CenarioService {

        private final Repositorycenarios repository;

        public CenarioService(Repositorycenarios repository) {
            this.repository = repository;
        }

        public List<Modelcenarios.Cenario> listar() {
            return repository.listar();
        }

        public Modelcenarios.Cenario salvar(Modelcenarios.Cenario cenario) {
            return repository.salvar(cenario);
        }
    }
}
