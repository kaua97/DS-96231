package com.example.api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.beans.XMLEncoder;

public class FuncionarioRequestDTO {

    @NotBlank(message = "O nome é obrigatorio.")
    @Size(max = 200, message = "O nome deve ter menos de 200 caracteres.")
    private String nome;

    @NotBlank(message = "O email é obrigatorio")
    @Email(message = "deve ter um email valido.")
    private String email;


    @NotBlank(message = "o telefone é obrigatoria")
    @Size(min = 10, max = 13, message = "O telefone deve ter entre 10 e 13 digitos")
    private String telefone;

    @NotBlank
    @Size(min = 6, message = "A senha deve ter no minino 6 caracteres.")
    @Size(max = 12, message = "A senha deve ter no maximo 12 caracteres")
    private String senha;

    public @NotBlank(message = "O nome é obrigatorio.") @Size(max = 200, message = "O nome deve ter menos de 200 caracteres.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatorio.") @Size(max = 200, message = "O nome deve ter menos de 200 caracteres.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O email é obrigatorio") @Email(message = "deve ter um email valido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email é obrigatorio") @Email(message = "deve ter um email valido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "o telefone é obrigatoria") @Size(min = 10, max = 13, message = "O telefone deve ter entre 10 e 13 digitos") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "o telefone é obrigatoria") @Size(min = 10, max = 13, message = "O telefone deve ter entre 10 e 13 digitos") String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank @Size(min = 6, message = "A senha deve ter no minino 6 caracteres.") @Size(max = 12, message = "A senha deve ter no maximo 12 caracteres") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank @Size(min = 6, message = "A senha deve ter no minino 6 caracteres.") @Size(max = 12, message = "A senha deve ter no maximo 12 caracteres") String senha) {
        this.senha = senha;
    }

    public FuncionarioRequestDTO(String nome, String email, String telefone, String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public FuncionarioRequestDTO(){


    }
}