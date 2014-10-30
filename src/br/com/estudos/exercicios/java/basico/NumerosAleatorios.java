package br.com.estudos.exercicios.java.basico;

import java.util.Random;

public class NumerosAleatorios {
	
	/* Exiba 50 números sorteados de 1 a 100 para o usuário
	 * 
	 */
	
	public static void main(String[] args) {
		
		Random rad = new Random();
		
		for(int i=0;i<50;i++){
			
			//gera um numero aleatório de 0 à 99.
			int num =  rad.nextInt(99);
			// +1 pra obter números de 1 à 100.
			System.out.print(num + 1 + ",");
		}
	}

}
