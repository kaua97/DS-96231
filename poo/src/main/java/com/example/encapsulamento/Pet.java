package com.example.encapsulamento;

public class Pet {
    // ATRIBUTOS DA CLASSE.
    String nome;
    int idade;
    public void setNome(String string) {
        // guarda o nome recebido no atributo
        this.nome = string;
    }
    public void setIdade(int i) {
        this.idade = i;
    }
    // MÉTODOS DE ACESSO.
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
   

}
