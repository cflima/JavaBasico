package br.com.estudos.exercicios.java.basico;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class IdadeAtual {

	/*
	 * Determine qual é a idade que o usuário faz no ano atual. Para isso
	 * solicite o ano de nascimento do usuário e o ano atual.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calendar cal = Calendar.getInstance();
		Integer anoAtual = cal.get(Calendar.YEAR);
		Integer anoNasc;
		Integer idade;

		System.out.println("Digite o ano do seu nascimento");
		anoNasc = sc.nextInt();
		idade = anoAtual - anoNasc;

		System.out.println("parabéns em " + anoAtual + " você terá " + idade
				+ " anos.");

	}

}
