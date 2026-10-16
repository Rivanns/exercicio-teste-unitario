package com.requenha.exercicio_teste_unitario;

public class Exercicio5 {

    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;

    public Exercicio5(String nome, String cpf, String uf,
                      double rendaAnual) {
        this.nome = nome;
        this.cpf = cpf;
        this.uf = uf;
        this.rendaAnual = rendaAnual;
    }

    public double calcularImposto() {

        if (rendaAnual < 0) {
            throw new IllegalArgumentException(
                    "A renda anual não pode ser negativa"
            );
        }

        if (rendaAnual <= 4000) {
            return rendaAnual * 0;
        } else if (rendaAnual <= 9000) {
            return rendaAnual * 0.058;
        } else if (rendaAnual <= 25000) {
            return rendaAnual * 0.15;
        } else if (rendaAnual <= 35000) {
            return rendaAnual * 0.275;
        } else {
            return rendaAnual * 0.30;
        }
    }
}
