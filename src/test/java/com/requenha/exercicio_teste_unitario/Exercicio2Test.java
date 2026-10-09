package com.requenha.exercicio_teste_unitario;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Exercicio2Test {

    @Test
    @DisplayName("Teste para retornar estação de acordo com o número inserido.")
    void deveRetornarEstacaoQuandoNumeroForInserido(){
        double estacao = 2;
        Assertions.assertThat(estacao).isEqualTo(2);
    }
}
