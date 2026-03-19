package Atividade3;

public abstract class Funcionario implements SalarioFinal{
        protected String nome;
        protected String cpf;
        protected String rg;
        protected Sexo sexo;
        protected double salarioBase;
        protected String dataNascimento;
        protected String dataAdmissao;

        public Funcionario() {
                this.nome = nome;
                this.cpf = cpf;
                this.rg = rg;
                this.sexo = sexo;
                this.salarioBase = salarioBase;
                this.dataNascimento = dataNascimento;
                this.dataAdmissao = dataAdmissao;
        }

        public String toString() {
            return nome;
        }


}

