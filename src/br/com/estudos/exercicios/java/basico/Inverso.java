package br.com.estudos.exercicios.java.basico;

import java.util.Scanner;

public class Inverso {

	/*
	 * Escreva uma classe com o nome Inverso,cujo m�todo main � repons�vel por
	 * receber uma palavra ou frase e exibila em caracteres mai�sculas e
	 * invertidas.Exemplo para a entrada CEFET-PHB exibir a sa�da BHP-TEFEC.
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
	
		//Utilizando m�todo reverse.
		StringBuffer frase = new StringBuffer();

		System.out.println("\n" + "\n" + "Utilizando m�todo reverse:");
		System.out.println("Digite uma frase:");
		frase.append(sc.nextLine().toUpperCase());
		System.out.println("Frase invertida utilizando o m�todo reverse: "
				+ frase.reverse());

	}

}
