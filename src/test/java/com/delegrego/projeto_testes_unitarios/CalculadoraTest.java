package com.delegrego.projeto_testes_unitarios;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	void deveSubtrairQuandoValoresForemInseridos() {

		// Arrange -> Arrumar
		double num1 = 5;
		double num2 = 1;

		// Act -> Agir
		double resultado = Calculadora.subtrair(num1, num2);

		// Assert -> Assegurar
		Assertions.assertThat(resultado).isEqualTo(4);

	}

	@Test
	void deveRetornarMensagemDeSaudacaoQuandoNomeForInserido() {

		// Arrange
		String nome = "Henrique";

		// Act
		String mensagem = Calculadora.saudar(nome);

		// Asssert
		Assertions.assertThat(mensagem).isEqualTo("Olá, Henrique");

	}

}
