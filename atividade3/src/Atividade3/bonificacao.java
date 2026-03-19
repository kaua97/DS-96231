package Atividade3;

public enum bonificacao {
    GERENTE(1.2),
    DIRETOR(1.4);

    private double valor;

    bonificacao(double valor) {
        this.valor = valor;
    }

    public static double getValor() {
        return valor;
    }
}