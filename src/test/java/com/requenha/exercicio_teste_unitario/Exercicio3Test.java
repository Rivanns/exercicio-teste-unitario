package com.requenha.exercicio_teste_unitario;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Exercicio3Test {

    @Test
    @DisplayName("Deve gerar o nome completo Star Wars")
    void deveGerarNomeStarWarsCorretamente() {


        Exercicio3 pessoa = new Exercicio3(
                "João",
                "Silva",
                "Oliveira",
                "Blumenau"
        );

        String resultado = pessoa.gerarNomeStarWars();


        Assertions.assertThat(resultado)
                .isEqualTo("SilJo OlBlu");
    }

    @Test
    @DisplayName("Deve utilizar apenas as letras determinadas pela fórmula")
    void deveUtilizarQuantidadeCorretaDeLetras() {


        Exercicio3 pessoa = new Exercicio3(
                "Maria",
                "Santos",
                "Ferreira",
                "Curitiba"
        );


        String resultado = pessoa.gerarNomeStarWars();

        Assertions.assertThat(resultado)
                .isEqualTo("SanMa FeCur");
    }
}