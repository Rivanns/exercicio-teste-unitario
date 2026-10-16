package com.requenha.exercicio_teste_unitario;

public class Exercicio4 {

    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Exercicio4(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String classificarCategoria() {

        if (idade < 5) {
            throw new IllegalArgumentException(
                    "Idade inválida para classificação"
            );
        } else if (idade <= 7) {
            return "Pré-mirim";
        } else if (idade <= 10) {
            return "Mirim";
        } else if (idade <= 13) {
            return "Infantil";
        } else if (idade <= 17) {
            return "Infanto-juvenil";
        } else if (idade <= 20) {
            return "Juvenil";
        } else {
            return "Adulto";
        }
    }

    public double calcularIMC() {

        if (altura <= 0 || peso <= 0) {
            throw new IllegalArgumentException(
                    "Altura e peso devem ser maiores que zero"
            );
        }

        return peso / (altura * altura);
    }

    public String classificarIMC() {

        double imc = calcularIMC();

        if (imc < 18.5) {
            return "Magreza";
        } else if (imc < 25.0) {
            return "Saudável";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else if (imc < 35.0) {
            return "Obesidade Grau I";
        } else if (imc < 40.0) {
            return "Obesidade Grau II (severa)";
        } else {
            return "Obesidade Grau III (mórbida)";
        }
    }
}
