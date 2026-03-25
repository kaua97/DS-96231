package com.example.Spring.basico.controller;

import com.example.Spring.basico.models.Usuario;
import com.example.Spring.basico.repositorio.Usuario.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class UsuarioController { 
    
    @RestController
    @RequestMapping("/usuario")
    public class UsuarioController{
        public UsuarioController(UsuarioRepository usuarioRepository) {
            this.usuarioRepository = usuarioRepository;
        }

        private UsuarioRepository usuarioRepository;
        
        @GetMapping
        public List<Usuario> listarTodos(){
            return usuarioRepository.findAll();
            }
        }
        
        
    }

}
