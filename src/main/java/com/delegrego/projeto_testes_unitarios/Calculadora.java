package com.delegrego.projeto_testes_unitarios;

public class Calculadora {

	public static double subtrair(double num1, double num2) {
		return num1 - num2;
	}

	public static String saudar(String nome) {
		if (nome == null || nome.isBlank()) {
			throw new RuntimeException("Nome inválido");
		}
		return "Olá, " + nome;
	}
}
