package com.example.encapsulamento;

public class Livro {
    String titulo;
    String autor;
    double numerospaginas;
    double preco;
    
    public String gettitulo() {
        return titulo;
    }
    public void settitulo(String titulo) {
        this.titulo = titulo;
    }
 
    public String getautor() {
        return autor;
    }
    public void setautor(String autor) {
        this.autor = autor;
    }

 public double getnumerospaginas() {
        return numerospaginas;
    }
    public void setnumerospaginas(double numerospaginas) {
        this.numerospaginas = numerospaginas;
    }



    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
