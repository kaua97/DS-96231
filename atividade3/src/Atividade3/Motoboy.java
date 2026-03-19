package Atividade3;

public class Motoboy extends Funcionario{
    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placaDaMoto='" + placaDaMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataAdmissao='" + dataAdmissao + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }

    private String placaDaMoto;

    public Motoboy() {
        super();
    }

    @Override
    public double getSalarioFinal() {
        return 0;
    }
}

