package br.com.estudos.exercicios.java.basico;

import java.util.Random;

public class NumerosAleatorios {
	
	/* Exiba 50 n�meros sorteados de 1 a 100 para o usu�rio
	 * 
	 */
	
	public static void main(String[] args) {
		
		Random rad = new Random();
		
		for(int i=0;i<50;i++){
			
			//gera um numero aleat�rio de 0 � 99.
			int num =  rad.nextInt(99);
			// +1 pra obter n�meros de 1 � 100.
			System.out.print(num + 1 + ",");
		}
	}

}
