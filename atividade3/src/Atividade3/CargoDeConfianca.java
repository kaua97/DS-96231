package Atividade3;

 public abstract class CargoDeConfianca extends Funcionario {
     public CargoDeConfianca() {
         super();
     }

     public Atividade3.bonificacao getBonificacao() {
         return bonificacao;
     }

     public void setBonificacao(Atividade3.bonificacao bonificacao) {
         this.bonificacao = bonificacao;
     }

     protected bonificacao bonificacao;

     public CargoDeConfianca(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao) {
         super();
     }

     public abstract double getSalarioFinal();
 }
