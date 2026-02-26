package com.example.encapsulamento;

public class Mainn {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Marta", 20);
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());

        Aluno aluno = new Aluno();
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Email: " + aluno.getemail());
    }
}

