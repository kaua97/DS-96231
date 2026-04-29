package com.example.Asssuntonovo.Service;


import com.example.Asssuntonovo.Model.UsuarioModel;
import com.example.Asssuntonovo.Repository.UsuarioRepository;
import com.example.Asssuntonovo.dto.UsuarioRequestdto;
import com.example.Asssuntonovo.dto.UsuarioResponsedto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password4j.BcryptPassword4jPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicer {
    @Autowired
    private BcryptPassword4jPasswordEncoder passwordEncoder;

    @Autowired
    private UsuarioRepository repository;


@Autowired
    public List<UsuarioResponsedto> listarTodos(){
       return  repository
               .findAll()
               .stream()
               .map(u -> new UsuarioResponsedto(u.getId (),u.getEmail()))
               .toList();
    }

    public UsuarioModel salvarUsuario(@Valid UsuarioRequestdto usuario ) {
        if (repository.findByEmail(usuario.getEmail()).isPresent()) {
            throw new RuntimeException("Usuario ja cadastrado");
        }

        UsuarioModel novoUsuario = new UsuarioModel();
        novoUsuario.setEmail(usuario.getEmail());
        novoUsuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        novoUsuario.setId(usuario.getId());
        novoUsuario.setNome(usuario.getNome());
        
        return repository.save(usuario);
    }


    }

