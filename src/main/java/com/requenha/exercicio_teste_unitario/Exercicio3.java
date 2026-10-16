package com.requenha.exercicio_teste_unitario;


public class Exercicio3 {

    private String nome;
    private String sobrenome;
    private String nomeSolteiraMae;
    private String cidadeNatal;

    public Exercicio3(String nome, String sobrenome,
                      String nomeSolteiraMae, String cidadeNatal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeSolteiraMae = nomeSolteiraMae;
        this.cidadeNatal = cidadeNatal;
    }

    public String gerarNomeStarWars() {

        String primeiroNome = sobrenome.substring(0, 3)
                + nome.substring(0, 2);

        String sobrenomeStarWars = nomeSolteiraMae.substring(0, 2)
                + cidadeNatal.substring(0, 3);

        return primeiroNome + " " + sobrenomeStarWars;
    }
}