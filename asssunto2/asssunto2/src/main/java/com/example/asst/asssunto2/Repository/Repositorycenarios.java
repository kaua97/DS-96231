package com.example.asst.asssunto2.Repository;

import com.example.asst.asssunto2.Model.Modelcenarios;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public interface Repositorycenarios {


    List<Modelcenarios.Cenario> listar();

    Modelcenarios.Cenario salvar(Modelcenarios.Cenario cenario);

    @Repository
    public class CenarioRepository {

        private List<Modelcenarios> lista = new ArrayList<>();

        public List<Modelcenarios> listar() {
            return lista;
        }

        public Modelcenarios salvar(Modelcenarios cenario) {
            lista.add(cenario);
            return cenario;
        }
    }
}
