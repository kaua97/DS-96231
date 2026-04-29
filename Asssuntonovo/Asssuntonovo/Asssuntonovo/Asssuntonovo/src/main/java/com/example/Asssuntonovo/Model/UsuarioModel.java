package com.example.Asssuntonovo.Model;


import jakarta.persistence.*;

@Entity
@Table(name="tab_Usuario")

public class UsuarioModel {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

 @Column(nullable = false,unique = true)
    private String email;

 @Column(nullable = false)
    private String senha;

    public UsuarioModel(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;
 public UsuarioModel()  {

 }

}
