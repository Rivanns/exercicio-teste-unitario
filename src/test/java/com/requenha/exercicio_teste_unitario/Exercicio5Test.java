package com.requenha.exercicio_teste_unitario;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Exercicio5Test {

    @Test
    @DisplayName("Deve calcular imposto de 0%")
    void deveCalcularImpostoComAliquotaZero() {

        Exercicio5 contribuinte = new Exercicio5(
                "João da Silva",
                "123.456.789-00",
                "PR",
                4000
        );

        double resultado = contribuinte.calcularImposto();

        Assertions.assertThat(resultado).isEqualTo(0.0);
    }

    @Test
    @DisplayName("Deve calcular imposto de 5,8%")
    void deveCalcularImpostoComAliquotaDeCincoVirgulaOitoPorCento() {

        Exercicio5 contribuinte = new Exercicio5(
                "João da Silva",
                "123.456.789-00",
                "PR",
                5000
        );

        double resultado = contribuinte.calcularImposto();

        Assertions.assertThat(resultado).isEqualTo(290.0);
    }

    @Test
    @DisplayName("Deve calcular imposto de 15%")
    void deveCalcularImpostoComAliquotaDeQuinzePorCento() {

        Exercicio5 contribuinte = new Exercicio5(
                "Maria Silva",
                "123.456.789-01",
                "SC",
                10000
        );

        double resultado = contribuinte.calcularImposto();

        Assertions.assertThat(resultado).isEqualTo(1500.0);
    }

    @Test
    @DisplayName("Deve calcular imposto de 27,5%")
    void deveCalcularImpostoComAliquotaDeVinteESeteVirgulaCincoPorCento() {

        Exercicio5 contribuinte = new Exercicio5(
                "Pedro Souza",
                "123.456.789-02",
                "RS",
                30000
        );

        double resultado = contribuinte.calcularImposto();

        Assertions.assertThat(resultado).isEqualTo(8250.0);
    }

    @Test
    @DisplayName("Deve calcular imposto de 30%")
    void deveCalcularImpostoComAliquotaDeTrintaPorCento() {

        Exercicio5 contribuinte = new Exercicio5(
                "Ana Souza",
                "123.456.789-03",
                "SC",
                40000
        );

        double resultado = contribuinte.calcularImposto();

        Assertions.assertThat(resultado).isEqualTo(12000.0);
    }

    @Test
    @DisplayName("Deve aplicar a alíquota correta no limite de 9000")
    void deveAplicarAliquotaDeCincoVirgulaOitoAte9000() {

        Exercicio5 contribuinte = new Exercicio5(
                "João",
                "123.456.789-00",
                "PR",
                9000
        );

        double resultado = contribuinte.calcularImposto();

        Assertions.assertThat(resultado).isEqualTo(522.0);
    }

    @Test
    @DisplayName("Deve aplicar a alíquota de 15% acima de 9000")
    void deveAplicarAliquotaDeQuinzeAcimaDe9000() {

        Exercicio5 contribuinte = new Exercicio5(
                "João",
                "123.456.789-00",
                "PR",
                9001
        );

        double resultado = contribuinte.calcularImposto();

        Assertions.assertThat(resultado).isEqualTo(1350.15);
    }

    @Test
    @DisplayName("Deve lançar exceção para renda negativa")
    void deveLancarExcecaoQuandoRendaForNegativa() {

        Exercicio5 contribuinte = new Exercicio5(
                "João",
                "123.456.789-00",
                "PR",
                -1000
        );

        Assertions.assertThatThrownBy(
                        () -> contribuinte.calcularImposto()
                ).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("A renda anual não pode ser negativa");
    }
}
