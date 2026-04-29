package com.example.Asssuntonovo.Execption;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class UsuarioExecption {
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String,Object>> RuntimeException(RuntimeException erro){
        return  ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(Map.of("Mensagem",erro.getMessage()));


    }

}
