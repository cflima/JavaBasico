package br.com.estudos.exercicios.java.basico;

import java.util.Random;
import java.util.Scanner;

public class NumerosSorteados {
	
	/* Crie um jogo para o usuário descobrir um número sorteado de 1 a 100.
	 * A cada tentativa dele, forneça uma dica mostrando se o número é maior ou menor. 
	 * Quando ele descobrir exiba uma mensagem de parabéns e mostre em quantas tentativas ele conseguiu. 
	 * 
	 */
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int x = rand.nextInt(99);
		int tentativas = 0;
		
		System.out.println("Descuba o número correto, Digite um número:");
		
		while(x+1 != x ){
			
			int numEscolhido = sc.nextInt(); 
			
			if(x+1 > numEscolhido){
				System.out.println("Digite um número maior, tente outra vez!");
				tentativas++;
			}
			else if(x+1 < numEscolhido){
				System.out.println("Digite um número menor, tente outra vez!");
				tentativas++;
			}
			else{
				tentativas++;
				System.out.println("Parabéns você acertou o número correto com apenas: " 
				+ tentativas + " tentativas.");
			}
	  }
	}
}
