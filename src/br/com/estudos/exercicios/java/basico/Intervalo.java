package br.com.estudos.exercicios.java.basico;

public class Intervalo {

	/* Escreva uma classe com o nome Intervalo, cujo m�todo main � respons�vel por imprimir 
	 * na tela todos os n�meros impares de 299 a 101  em ordem decrescente.
	 */
	
	public static void main (String[] args){
		
		for(int i=300; i>=101; i--){
			if(i % 2 != 0){
				System.out.print(i + ",");
			}
			
		}
		
	}
}
