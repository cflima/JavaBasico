package br.com.estudos.exercicios.java.basico;

import java.util.Scanner;

public class Eleicao {
	
	/* A partir da idade informada de um cidad�o diga se ele n�o pode votar (idade inferior a 16),
	 * ou se o voto � facultativo (idade igual a 16 ou 17 ou ainda maior do que 70),
	 *  ou ainda se o voto � obrigat�rio para idades entre 18 e 70 (incluindo estes valores). 
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade;
		
		System.out.println("Por favor digite sua idade:");
		idade = sc.nextInt();
		
		if(idade < 16 ){
			System.out.println("n�o � obrigado!");
		}
		else if(idade>= 18 && idade <= 70){
			System.out.println("Voto obrigat�rio!");
		}
		else{
			System.out.println("Seu voto � facultativo!");
		}
	}
}
