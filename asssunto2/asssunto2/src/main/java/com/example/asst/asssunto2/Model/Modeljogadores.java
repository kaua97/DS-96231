package com.example.asst.asssunto2.Model;

public class Modeljogadores {

    public static class Jogador {

        private Long id;
        private String nome;
        private String nickname;
        private int pontuacao;
        private int nivel;

        public Jogador() {}

        public Jogador(Long id, String nome, String nickname, int pontuacao, int nivel) {
            this.id = id;
            this.nome = nome;
            this.nickname = nickname;
            this.pontuacao = pontuacao;
            this.nivel = nivel;
        }

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }

        public String getNickname() { return nickname; }
        public void setNickname(String nickname) { this.nickname = nickname; }

        public int getPontuacao() { return pontuacao; }
        public void setPontuacao(int pontuacao) { this.pontuacao = pontuacao; }

        public int getNivel() { return nivel; }
        public void setNivel(int nivel) { this.nivel = nivel; }
    }
}
