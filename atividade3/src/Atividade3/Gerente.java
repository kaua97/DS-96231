package Atividade3;

public class Gerente extends CargoDeConfianca {

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", bonificacao=" + bonificacao +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                '}';
    }


    @Override
    public double getSalarioFinal() {
        return salarioBase * Atividade3.bonificacao.getValor();
    }
}

