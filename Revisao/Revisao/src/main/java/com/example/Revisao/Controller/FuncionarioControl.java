package com.example.Revisao.Controller;

import com.example.Revisao.Model.FuncionarioModel;
import com.example.Revisao.Service.Funcionarioservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioControl {

    @Autowired
    private Funcionarioservice service;


    @GetMapping
    public List<FuncionarioModel> lista() {
        return service.listar();
    }


    @PostMapping
    public ResponseEntity<FuncionarioModel> save(@RequestBody FuncionarioModel model) {
        FuncionarioModel novo = service.salvar(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(novo);
    }
}
