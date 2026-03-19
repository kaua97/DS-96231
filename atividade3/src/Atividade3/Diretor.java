package Atividade3;


    public class Diretor extends CargoDeConfianca {
        private static final double PREMIO = 1.1;

        public Diretor(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataNascimento, String dataAdmissao) {
            super(nome, cpf, rg, sexo, salarioBase, dataNascimento, dataAdmissao);
        }

        public Diretor() {
            super();
        }

        @Override
        public double getSalarioFinal() {
            double salarioBase = 0;
            return salarioBase * bonificacao.getValor() * PREMIO;
        }
    }

