package org.example.atividade;

import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade das notas:");
        int quantidade = ler.nextInt();

        double[] notas = new double[quantidade];
        double soma = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota:");
            notas[i] = ler.nextDouble();
            soma += notas[i];
        }

        System.out.println("\nExibindo as notas do meu aluno:");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }



        double media = soma / quantidade;
        System.out.println("\nMédia aritmética final: " + media);



        int estudos; {
            System.out.println("Anotaçao das minhas notas!!");
            estudos= ler.nextInt();
            while (estudos<1 || estudos >10);

            System.out.println("Anotado!!");
        }

        ler.close();
    }
}
