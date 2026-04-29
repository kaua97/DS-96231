package com.example.Asssuntonovo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioRequestdto {

    @NotBlank(message = " o nome é obrigatorio.")
    @Size(min = 2,message = " O nosso deve ter no minimo dois caracteres.")
    @Size(max = 100, message = "O nosso deve ter no maximo cem caracteres." )

    private String email;


    public UsuarioRequestdto(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public @NotBlank(message = " o nome é obrigatorio.") @Size(min = 2, message = " O nosso deve ter no minimo dois caracteres.") @Size(max = 100, message = "O nosso deve ter no maximo cem caracteres.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = " o nome é obrigatorio.") @Size(min = 2, message = " O nosso deve ter no minimo dois caracteres.") @Size(max = 100, message = "O nosso deve ter no maximo cem caracteres.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha é obrigatoria") @Size(min = 3, max = 8, message = "A senha deve ter entre 3 e 8 digitos.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatoria") @Size(min = 3, max = 8, message = "A senha deve ter entre 3 e 8 digitos.") String senha) {
        this.senha = senha;
    }

    @NotBlank(message = "A senha é obrigatoria")
    @Size(min = 3,max = 8, message = "A senha deve ter entre 3 e 8 digitos.")

    private String senha;

}
