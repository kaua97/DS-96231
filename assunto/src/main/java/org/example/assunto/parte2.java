package org.example.assunto;

public class parte2 {
    public static void main(String[] args) {

        String nomeUsuario = "Marta";
        int senha = 123;

        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);

        System.out.println("O nome do usuario està correto?:" + resultadoNome );
        System.out.println("A senha esta Correta?:"+ resultadoSenha);
    }
}