package br.com.estudos.exercicios.java.basico;

import java.util.Scanner;

public class Inverso {

	/*
	 * Escreva uma classe com o nome Inverso,cujo método main é reponsável por
	 * receber uma palavra ou frase e exibila em caracteres maiúsculas e
	 * invertidas.Exemplo para a entrada CEFET-PHB exibir a saída BHP-TEFEC.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome;

		System.out.println("Digite uma frase:");
		nome = sc.nextLine();

		for (int i = nome.length() - 1; i >= 0; i--) {
			System.out.print("frase invertida fica: "
					+ nome.toUpperCase().charAt(i));
		}
	
		//Utilizando método reverse.
		StringBuffer frase = new StringBuffer();

		System.out.println("\n" + "\n" + "Utilizando método reverse:");
		System.out.println("Digite uma frase:");
		frase.append(sc.nextLine().toUpperCase());
		System.out.println("Frase invertida utilizando o método reverse: "
				+ frase.reverse());

	}

}
