package com.delegrego.projeto_testes_unitarios;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex2Test {

	@Test
	void deveRetornarVeraoQuandoEstacaoFor1() {

		// Arrange
		int estacao = 1;

		// Act
		String texto = Ex2.retornarEstacoes(estacao);

		// Assert
		Assertions.assertThat(texto).isEqualTo("É verão e o tempo está quente");
	}

	@Test
	void deveRetornarOutonoQuandoEstacaoFor2() {
		// Arrange
		int estacao = 2;

		// Act
		String texto = Ex2.retornarEstacoes(estacao);

		// Assert
		Assertions.assertThat(texto).isEqualTo("É outono e as folhas estão caindo");
	}

	@Test
	void deveRetornarInvernoQuandoEstacaoFor3() {
		// Arrange
		int estacao = 3;

		// Act
		String texto = Ex2.retornarEstacoes(estacao);

		// Assert
		Assertions.assertThat(texto).isEqualTo("É inverno e o tempo está frio");
	}

	@Test
	void deveRetornarPrimaveraQuandoEstacaoFor4() {
		// Arrange
		int estacao = 4;

		// Act
		String texto = Ex2.retornarEstacoes(estacao);

		// Assert
		Assertions.assertThat(texto).isEqualTo("É primavera e as flores estão florindo");
	}

	@Test
	void deveLancarExcecaoQuandoEstacaoForAcimaDoLimite() {

		// Arrange
		int estacao = 5;

		// Act e assert
		Assertions.assertThatThrownBy(() -> Ex2.retornarEstacoes(estacao)).isInstanceOf(RuntimeException.class)
				.hasMessage("Estação inválida, o número deve estar entre 1 e 4");
	}
	
	@Test
	void deveLancarExcecaoQuandoEstacaoForAbaixoDoLimite() {

		// Arrange
		int estacao = 0;

		// Act e assert
		Assertions.assertThatThrownBy(() -> Ex2.retornarEstacoes(estacao)).isInstanceOf(RuntimeException.class)
				.hasMessage("Estação inválida, o número deve estar entre 1 e 4");
	}

}
