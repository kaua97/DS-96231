package com.example.encapsulamento;

public class Main {
    public static void main(String[] args) {
    // String nome = "Marta";
    // int idade = 22;

    //PROGRAMAÇÃO ORIENTADA A OBJETO
    //Cliente cliente1 = new Cliente();
    // cliente1.nome = "Marta";
    // cliente1.idade = 22;

    //EMCAPSULAMENTO
    Cliente cliente1 = new Cliente(null, 0);
    cliente1.setNome("Kaua");
    cliente1.setIdade(20);

    Pet pet1 = new Pet();
    pet1.setNome("Scóbi");
    pet1.setIdade(2);

    Livro livro1 = new Livro();
    livro1.settitulo("O pequeno principe");
    livro1.setPreco(22.30);
    livro1.setautor("kaua");
    livro1.setnumerospaginas(400);

    Funcionario f1 = new Funcionario();
    f1.setNome("Carlos");
    f1.setCargo("Professor");
    f1.setSalario(1650.00);


    Aluno aluno1 = new Aluno();
    aluno1.setNome("jose");
    aluno1.setEmail("jose@gmail.com");


    System.out.println("CLIENTE");
    System.out.println("Nome:"+ cliente1.getNome());
    System.out.println("Idade: " + cliente1.getIdade());
    System.out.println("");

    System.out.println("PET");
    System.out.println("Nome: " + pet1.getNome());
    System.out.println("Idade: " + pet1.getIdade());

    System.out.println("LIVRO");
    System.out.println("titulo: " + livro1.gettitulo());
    System.out.println("autor: " + livro1.getautor());
    System.out.println("numerodepaginas: " + livro1.getnumerospaginas());
    System.out.println("Preço: " + livro1.getPreco());

    System.out.println("FUNCIONÁRIO");
    System.out.println("Nome: " + f1.getNome());
    System.out.println("Cargo: " + f1.getCargo());
    System.out.println("Salário: " + f1.getSalario());

    }
}
