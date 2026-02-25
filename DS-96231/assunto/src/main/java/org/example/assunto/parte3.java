package org.example.assunto;

import java.util.Scanner;

public class parte3 {
    public static void main(String[] args) {

        String usuarioCorreto = "Kaua";
        String senhaCorreta = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String usuarioDigitado = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

        boolean nomeValido = usuarioDigitado.equals(usuarioCorreto);
        boolean senhaValida = senhaDigitada.equals(senhaCorreta);

        if (nomeValido && senhaValida) {
            System.out.println("Bem-vindo, usuário logado!!");
        } else {
            System.out.println("Usuário ou senha incorretos!");
        }

        scanner.close();
    }
}


