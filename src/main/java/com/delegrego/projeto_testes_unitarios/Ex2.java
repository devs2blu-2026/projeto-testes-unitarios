package com.delegrego.projeto_testes_unitarios;

public class Ex2 {

	public static String retornarEstacoes(int estacao) {

		if (estacao <= 0 || estacao >= 5) {
			throw new RuntimeException("Estação inválida, o número deve estar entre 1 e 4");
		}

		String texto = switch (estacao) {
		case 1 -> "É verão e o tempo está quente";
		case 2 -> "É outono e as folhas estão caindo";
		case 3 -> "É inverno e o tempo está frio";
		case 4 -> "É primavera e as flores estão florindo";
		default -> null;
		};

		return texto;

	}

}
