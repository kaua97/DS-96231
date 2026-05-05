package com.example.asst.asssunto2.Repository;

import com.example.asst.asssunto2.Model.ModelPersonagens;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


    public interface RepositoryPersonagens {


        <Personagem> List<Personagem> listar();

        ModelPersonagens salvar(ModelPersonagens personagem);

        @Repository
        public class PersonagemRepository {

            private final List<ModelPersonagens> lista = new ArrayList<>();

            public List<ModelPersonagens> listar() {
                return lista;
            }

            public ModelPersonagens salvar(ModelPersonagens personagem) {
                return null;
            }
        }

    }


