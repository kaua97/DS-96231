package com.example.asst.asssunto2.Model;

public class ModelPersonagens {

    public static class Modelpersonagens{

        private Long id;
        private String nome;
        private String tipo;
        private String dificuldade;
        private String descricao;

        public Modelpersonagens() {}

        public Modelpersonagens(Long id, String nome, String tipo, String dificuldade, String descricao) {
            this.id = id;
            this.nome = nome;
            this.tipo = tipo;
            this.dificuldade = dificuldade;
            this.descricao = descricao;
        }

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }

        public String getTipo() { return tipo; }
        public void setTipo(String tipo) { this.tipo = tipo; }

        public String getDificuldade() { return dificuldade; }
        public void setDificuldade(String dificuldade) { this.dificuldade = dificuldade; }

        public String getDescricao() { return descricao; }
        public void setDescricao(String descricao) { this.descricao = descricao; }
    }
}
