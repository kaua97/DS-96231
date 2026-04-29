package com.example.Asssuntonovo.Service;


import com.example.Asssuntonovo.Model.UsuarioModel;
import com.example.Asssuntonovo.Repository.UsuarioRepository;
import com.example.Asssuntonovo.dto.UsuarioResponsedto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicer {
    @Autowired
    private UsuarioRepository repository;

    public List<UsuarioResponsedto> listarTodos(){
       return  repository
               .findAll()
               .stream()
               .map(u -> new UsuarioResponsedto(u.getId (),u.getEmail()))
               .toList();
    }

    public UsuarioModel salvarUsuario(UsuarioModel usuario ) {
        if (repository.findByEmail(usuario.getEmail()).isPresent()) {
            throw new RuntimeException("Usuario ja cadastrado");
        }

        UsuarioModel novoUsuario = new UsuarioModel();
        novoUsuario.setEmail(usuario.getEmail());
        novoUsuario.setSenha(usuario.getSenha());
        novoUsuario.setId(usuario.getId());
        
        return repository.save(usuario);
    }


    }

