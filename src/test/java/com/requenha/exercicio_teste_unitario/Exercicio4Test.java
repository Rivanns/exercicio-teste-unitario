package com.requenha.exercicio_teste_unitario;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Exercicio4Test {

    @Test
    @DisplayName("Deve classificar atleta como pré-mirim")
    void deveClassificarComoPreMirim() {

        Exercicio4 atleta = new Exercicio4("João", 5, 1.20, 25);

        String resultado = atleta.classificarCategoria();

        Assertions.assertThat(resultado).isEqualTo("Pré-mirim");
    }

    @Test
    @DisplayName("Deve classificar atleta como mirim")
    void deveClassificarComoMirim() {


        Exercicio4 atleta = new Exercicio4("João", 8, 1.30, 30);


        String resultado = atleta.classificarCategoria();


        Assertions.assertThat(resultado).isEqualTo("Mirim");
    }

    @Test
    @DisplayName("Deve classificar atleta como infantil")
    void deveClassificarComoInfantil() {


        Exercicio4 atleta = new Exercicio4("João", 11, 1.50, 40);


        String resultado = atleta.classificarCategoria();


        Assertions.assertThat(resultado).isEqualTo("Infantil");
    }

    @Test
    @DisplayName("Deve classificar atleta como infanto-juvenil")
    void deveClassificarComoInfantoJuvenil() {


        Exercicio4 atleta = new Exercicio4("João", 14, 1.70, 60);


        String resultado = atleta.classificarCategoria();


        Assertions.assertThat(resultado).isEqualTo("Infanto-juvenil");
    }

    @Test
    @DisplayName("Deve classificar atleta como juvenil")
    void deveClassificarComoJuvenil() {


        Exercicio4 atleta = new Exercicio4("João", 18, 1.80, 70);


        String resultado = atleta.classificarCategoria();


        Assertions.assertThat(resultado).isEqualTo("Juvenil");
    }

    @Test
    @DisplayName("Deve classificar atleta com 21 anos como adulto")
    void deveClassificarComoAdulto() {


        Exercicio4 atleta = new Exercicio4("João", 21, 1.80, 70);


        String resultado = atleta.classificarCategoria();


        Assertions.assertThat(resultado).isEqualTo("Adulto");
    }

    @Test
    @DisplayName("Deve lançar exceção para idade inferior a 5 anos")
    void deveLancarExcecaoParaIdadeInvalida() {


        Exercicio4 atleta = new Exercicio4("João", 4, 1.10, 20);

        Assertions.assertThatThrownBy(
                        () -> atleta.classificarCategoria()
                ).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Idade inválida para classificação");
    }

    @Test
    @DisplayName("Deve calcular o IMC corretamente")
    void deveCalcularIMCCorretamente() {

        Exercicio4 atleta = new Exercicio4("João", 25, 2.0, 80);

        double resultado = atleta.calcularIMC();

        Assertions.assertThat(resultado).isEqualTo(20.0);
    }

    @Test
    @DisplayName("Deve classificar IMC como magreza")
    void deveClassificarIMCComoMagreza() {

        Exercicio4 atleta = new Exercicio4("João", 25, 2.0, 60);

        String resultado = atleta.classificarIMC();

        Assertions.assertThat(resultado).isEqualTo("Magreza");
    }

    @Test
    @DisplayName("Deve classificar IMC como saudável")
    void deveClassificarIMCComoSaudavel() {

        Exercicio4 atleta = new Exercicio4("João", 25, 2.0, 80);

        String resultado = atleta.classificarIMC();

        Assertions.assertThat(resultado).isEqualTo("Saudável");
    }

    @Test
    @DisplayName("Deve classificar IMC como sobrepeso")
    void deveClassificarIMCComoSobrepeso() {

        Exercicio4 atleta = new Exercicio4("João", 25, 2.0, 100);

        String resultado = atleta.classificarIMC();

        Assertions.assertThat(resultado).isEqualTo("Sobrepeso");
    }

    @Test
    @DisplayName("Deve classificar IMC como obesidade grau I")
    void deveClassificarIMCComoObesidadeGrauI() {

        Exercicio4 atleta = new Exercicio4("João", 25, 1.0, 32);

        String resultado = atleta.classificarIMC();

        Assertions.assertThat(resultado).isEqualTo("Obesidade Grau I");
    }

    @Test
    @DisplayName("Deve classificar IMC como obesidade grau II")
    void deveClassificarIMCComoObesidadeGrauII() {

        Exercicio4 atleta = new Exercicio4("João", 25, 1.0, 37);

        String resultado = atleta.classificarIMC();

        Assertions.assertThat(resultado)
                .isEqualTo("Obesidade Grau II (severa)");
    }

    @Test
    @DisplayName("Deve classificar IMC como obesidade grau III")
    void deveClassificarIMCComoObesidadeGrauIII() {

        Exercicio4 atleta = new Exercicio4("João", 25, 1.0, 40);

        String resultado = atleta.classificarIMC();

        Assertions.assertThat(resultado)
                .isEqualTo("Obesidade Grau III (mórbida)");
    }

    @Test
    @DisplayName("Deve lançar exceção para altura igual a zero")
    void deveLancarExcecaoParaAlturaZero() {

        Exercicio4 atleta = new Exercicio4("João", 25, 0, 80);

        Assertions.assertThatThrownBy(
                        () -> atleta.calcularIMC()
                ).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Altura e peso devem ser maiores que zero");
    }

    @Test
    @DisplayName("Deve lançar exceção para peso igual a zero")
    void deveLancarExcecaoParaPesoZero() {

        Exercicio4 atleta = new Exercicio4("João", 25, 1.80, 0);

        Assertions.assertThatThrownBy(
                        () -> atleta.calcularIMC()
                ).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Altura e peso devem ser maiores que zero");
    }
}