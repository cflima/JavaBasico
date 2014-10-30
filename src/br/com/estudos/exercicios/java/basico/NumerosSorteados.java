package br.com.estudos.exercicios.java.basico;

import java.util.Random;
import java.util.Scanner;

public class NumerosSorteados {
	
	/* Crie um jogo para o usu�rio descobrir um n�mero sorteado de 1 a 100.
	 * A cada tentativa dele, forne�a uma dica mostrando se o n�mero � maior ou menor. 
	 * Quando ele descobrir exiba uma mensagem de parab�ns e mostre em quantas tentativas ele conseguiu. 
	 * 
	 */
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int x = rand.nextInt(99);
		int tentativas = 0;
		
		System.out.println("Descuba o n�mero correto, Digite um n�mero:");
		
		while(x+1 != x ){
			
			int numEscolhido = sc.nextInt(); 
			
			if(x+1 > numEscolhido){
				System.out.println("Digite um n�mero maior, tente outra vez!");
				tentativas++;
			}
			else if(x+1 < numEscolhido){
				System.out.println("Digite um n�mero menor, tente outra vez!");
				tentativas++;
			}
			else{
				tentativas++;
				System.out.println("Parab�ns voc� acertou o n�mero correto com apenas: " 
				+ tentativas + " tentativas.");
			}
	  }
	}
}
