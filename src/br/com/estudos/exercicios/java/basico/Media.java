package br.com.estudos.exercicios.java.basico;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Media {

	/*
	 * Exerc�cio 06 A partir de 3 notas fornecidas de um aluno, informe se ele
	 * foi aprovado, ficou de recupera��o ou foi reprovado. A m�dia de aprova��o
	 * � >= 7.0; a m�dia de recupera��o � >= 5.0 e < 7.0; e a m�dia do reprovado
	 * � < 5.0
	 */

	public static void main(String[] args) {

		double nota1;
		double nota2;
		double nota3;
		double media;
		int cont = 1;

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Digite nota 1");
		nota1 = sc.nextDouble();

		System.out.println("Digite nota 2");
		nota2 = sc.nextDouble();

		System.out.println("Digite nota 3");
		nota3 = sc.nextDouble();

		media = (nota1 + nota2 + nota3) / 3;

		System.out.println("Sua m�dia no semestre foi: " + df.format(media));

		if (media >= 7) {
			System.out.println("Parab�ns voc� est� aprovado!");
		} else if (media >= 5 && media < 7) {
			System.out
					.println("Foi quase, infelizmente ter� que fazer recupera��o!");
		} else {
			System.out.println("Infelizmente n�o conseguiu, est� reprovado!");
		}

	}
}
