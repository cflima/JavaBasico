package br.com.estudos.exercicios.java.basico;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class IdadeAtual {

	/*
	 * Determine qual � a idade que o usu�rio faz no ano atual. Para isso
	 * solicite o ano de nascimento do usu�rio e o ano atual.
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

		System.out.println("parab�ns em " + anoAtual + " voc� ter� " + idade
				+ " anos.");

	}

}
