package com.requenha.exercicio_teste_unitario;

public class Exercicio2 {

    public void Exercicio2(double estacao){

        switch ((int) estacao) {
            case 1:
                System.out.println("É verão");
                System.out.println("E o tempo está quente.");
                break;
            case 2:
                System.out.println("É outono");
                System.out.println("E está nublado");
                break;
            case 3:
                System.out.println("É inverno");
                System.out.println("E faz frio.");
                break;
            case 4:
                System.out.println("É primavera");
                System.out.println("E está ");
                break;
            default:
                System.out.println("Número inválido");
                break;
            }
        }
    }

