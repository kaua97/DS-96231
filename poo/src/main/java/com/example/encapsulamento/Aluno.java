package com.example.encapsulamento;

public class Aluno  {
 private String nome1; 
 private String email; 

 public String getNome() {
        return nome1;
    }
    public void setNome(String nome) {
        this.nome1 = nome;
    }
    // corrigindo nome do getter para o email e capitalização consistente
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    // manter método antigo com comportamento compatível, se alguém já usar
    public String getemail() {
        return getEmail();
    }


}