package modulo_08;

import java.util.Scanner;

public class Exercicio_5 {
/*
 * Escreva um algoritmo em Java, que leia números inteiros via teclado,
 * até que o número zero seja digitado. Ao final, mostre na tela
 * a soma de todos os números digitados, que sejam positivos. 
 */

	public static void main(String[] args) {
		int numero, somaPositivos = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			
			if(numero > 0){
				somaPositivos += numero;
			}
			
		}while(numero!=0);
		
		System.out.printf("A soma dos numeros positivos é: %d", somaPositivos);
		leia.close();
	}

}
