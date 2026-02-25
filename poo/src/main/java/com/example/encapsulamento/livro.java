package com.example.encapsulamento;

public class livro {
    String nome; 
    int precox;

     public String getNome() {
         return nome;
    }

    public int getIdade() {
        return precox;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int preco) {
        this.precox = preco;
    }

    public void setPrecox(int i) {
        this.precox = i;
    }

    public int getPrecox() {
        return precox;
    }

}
