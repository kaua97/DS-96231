package com.example.Asssuntonovo.Controller;


import com.example.Asssuntonovo.Service.UsuarioServicer;
import com.example.Asssuntonovo.dto.UsuarioRequestdto;
import com.example.Asssuntonovo.dto.UsuarioResponsedto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {


    @Autowired
    private UsuarioServicer servicer;

    @GetMapping
     public ResponseEntity<List<UsuarioResponsedto>> listar() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(servicer.listarTodos());
    }

    @PostMapping
        public ResponseEntity<Map<String, Object>> salvar(
                @Valid @RequestBody UsuarioRequestdto usuarioDTO) {



        }



    }
