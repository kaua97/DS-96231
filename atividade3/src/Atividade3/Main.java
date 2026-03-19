package Atividade3;

public class Main {

        public static void main(String[] args) {

            // Criando um Motoboy
            Motoboy m = new Motoboy();
            m.nome = "João";
            m.salarioBase = 1500;
            m.sexo = Sexo.MASCULINO;

            // Criando um Gerente
            Gerente g = new Gerente();
            g.nome = "Maria";
            g.salarioBase = 5000;
            g.bonificacao = bonificacao.GERENTE;

            // Criando um Diretor
            Diretor d = new Diretor();
            d.nome = "Carlos";
            d.salarioBase = 10000;
            d.bonificacao = bonificacao.DIRETOR;

            // Mostrando resultados
            System.out.println("Motoboy: " + m.nome);
            System.out.println("Salário final: " + m.getSalarioFinal());

            System.out.println("---------------------");

            System.out.println("Gerente: " + g.nome);
            System.out.println("Salário final: " + g.getSalarioFinal());

            System.out.println("---------------------");

            System.out.println("Diretor: " + d.nome);
            System.out.println("Salário final: " + d.getSalarioFinal());
        }
    }

