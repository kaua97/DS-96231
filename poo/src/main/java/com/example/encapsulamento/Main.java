package com.example.encapsulamento;


public class Main {
   
    public static void main(String[] args) {
        // String nome = "Marta";
        // int idade = 22;

        // PROGRAMAÇAO ORIENTADA A OBJETOS
        // CLASSE: MODELO, PROJETO, PLANTA


        // ENCAPSULAMENTO
            Clients cliente1 = new Clients();
            cliente1.setNome("Marta");
            cliente1.setIdade(22);



           livro livro1Livro = new livro();
           livro1Livro.setNome("O pequeno principe");
           livro1Livro.setPrecox(20);

        


            pet pet1 = new pet();
            pet1.setNome("kaua");
            pet1.setIdade(2);


            funcionario funcionario1 = new funcionario();
            funcionario1.setNome("KAUA");
            funcionario1.setValorsalario(1650);

            
        System.out.println("Nome:"+ cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        
        System.out.println("Nome do livro: " + livro1Livro.getNome());
        System.out.println("Preço do livro: " + livro1Livro.getPrecox());

        System.out.println("Nome do Pet: " + pet1.getNome());
        System.out.println("Idade do pet: " + pet1.getIdade());


        System.out.println("Nome do funcionario: " + funcionario1.getNome());
        System.out.println("Valor do salario: " + funcionario1.getValorsalario());
    }
}