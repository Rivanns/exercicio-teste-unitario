package com.requenha.exercicio_teste_unitario;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExerciciosTest {

    @Test
    void deveRetornarValidacaoQuandoNumeroForInserido(){
        double numero = 4;
        Assertions.assertThat(numero).isEqualTo(4);
    }

    @Test
    void deveRetornarEstacaoQuandoNumeroForInserido(){
       double estacao = 2;
       Assertions.assertThat(estacao).isEqualTo(2);
    }
}
