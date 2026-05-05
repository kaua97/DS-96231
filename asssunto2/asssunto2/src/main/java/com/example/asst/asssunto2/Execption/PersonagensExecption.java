package com.example.asst.asssunto2.Execption;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice

    public class PersonagensExecption {

        @ExceptionHandler(IllegalArgumentException.class)
        public ResponseEntity<Map<String,Object>> illegalArgumentException (IllegalArgumentException erro){
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body(Map.of("mensagem", erro.getMessage()));
        }
    }


