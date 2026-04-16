package com.example.Revisao.Service;

import com.example.Revisao.Model.FuncionarioModel;
import com.example.Revisao.Repository.FuncionarioRepository;
import com.example.Revisao.exception.FuncionarioException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Funcionarioservice {

    @Autowired
    private FuncionarioRepository repository;


    public List<FuncionarioModel> listar() {
        return repository.findAll();
    }


    public FuncionarioModel salvar(FuncionarioModel funcionario) {


        if (repository.findByEmail(funcionario.getEmail()).isPresent()){
            throw new IllegalArgumentException("Funcionario já cadastrado!");
        }
        return repository.save(funcionario);
    }
    }