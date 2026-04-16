package com.example.Revisao.Model;

public enum Sexo {
    MASCULINO('M', "Masculino"),
    FEMININO('F', "Feminino");

    private char caractere;
    private String texto;

    Sexo(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }

    public char getCaractere() {
        return caractere;
    }

    public String getTexto() {
        return texto;
    }
}