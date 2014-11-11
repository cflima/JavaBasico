package br.com.estudos.exercicios.java.basico;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Media {

	/*
	 * Exercício 06 A partir de 3 notas fornecidas de um aluno, informe se ele
	 * foi aprovado, ficou de recuperação ou foi reprovado. A média de aprovação
	 * é >= 7.0; a média de recuperação é >= 5.0 e < 7.0; e a média do reprovado
	 * é < 5.0
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

		System.out.println("Sua média no semestre foi: " + df.format(media));

		if (media >= 7) {
			System.out.println("Parabéns você está aprovado!");
		} else if (media >= 5 && media < 7) {
			System.out
					.println("Foi quase, infelizmente terá que fazer recuperação!");
		} else {
			System.out.println("Infelizmente não conseguiu, está reprovado!");
		}

	}
}
