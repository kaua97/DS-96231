package com.example.api.Service;


import com.example.api.Model.FuncionarioModel;
import com.example.api.Repository.FuncionarioRepository;
import com.example.api.dto.FuncionarioRequestDTO;
import com.example.api.dto.FuncionarioResponseDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioResponseDo> listar() {
        return repository
                .findAll()
                .stream()
                .map(f -> new FuncionarioResponseDo(
                        f.getNome(),
                        f.getEmail(),
                        f.getTelefone()
                ))
                .toList();
    }
}

public FuncionarioModel salvarFuncionario(FuncionarioRequestDTO dto) {

public void main() {
}