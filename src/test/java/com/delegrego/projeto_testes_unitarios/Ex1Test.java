package com.delegrego.projeto_testes_unitarios;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Ex1Test {

	@Test
	@DisplayName("Teste para retornar true caso o número passado seja par")
	void deveRetornarVerdadeiroQuandoNumeroForPar() {

		// Arrange -> Arrumar
		double numeroPar = 2;

		// Act -> Agir
		boolean resultado = Ex1.definirPar(numeroPar);

		// Assert -> Assegurar
		Assertions.assertThat(resultado).isTrue();
	}

	@Test
	@DisplayName("Teste para retornar false caso o número passado seja ímpar")
	void deveRetornarFalsoQuandoNumeroForImpar() {
		// Arrange -> Arrumar
		double numeroImpar = 1;

		// Act -> Agir
		boolean resultado = Ex1.definirPar(numeroImpar);

		// Assert -> Assegurar
		Assertions.assertThat(resultado).isFalse();
	}

}
