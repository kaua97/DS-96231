package com.example.encapsulamento;

public class Cliente {
    // ATRIBUTOS DA CLASSE
    private String nome;
    private int idade;


    // Construtor
    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public Cliente(Object nome2, Object idade2) {
        //TODO Auto-generated constructor stub
    }

    // MÉTODOS DE ACESSO
    public String getNome() {
        return nome;
    
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // remove métodos gerados automaticamente que não são necessários
    // e podem causar confusão de tipos

}
