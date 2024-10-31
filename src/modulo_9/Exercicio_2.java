package modulo_9;

import java.util.Scanner;

public class Exercicio_2 {
/*
 * Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
 *  - Todos os elementos dos índices ímpares do vetor 
 *  - Todos os elementos do vetor que são números pares
 *  - A Soma de todos os elementos do vetor
 *  - A Média de todos os elementos do vetor, armazenada em uma variável do tipo real
 */

	public static void main(String[] args) {
		int vetorInteiros[] = new int[10];
		int soma = 0,i;
		float media;
		
		Scanner scanner = new Scanner(System.in);
		
		//Laço para popular o Vetor
		for(i=0;i<vetorInteiros.length;i++) { 
			System.out.printf("\nInforme o %dº numero: ", (i+1));
			vetorInteiros[i] = scanner.nextInt();
		}
		scanner.close();
		
		//Exibindo elementos nos INDICES impares
		System.out.println("\nElementos nos indices ímpares: ");
		for(i=0;i<vetorInteiros.length;i++) {
			soma += vetorInteiros[i]; //Aproveintando percorrer do vetor e somando elementos.
			if(i%2 !=0) {
				System.out.printf("%d ",vetorInteiros[i]);
			}
		}

		//Exibindo todos os ELEMENTOS pares
		System.out.println("\nElementos pares: ");
		for(i=0;i<vetorInteiros.length;i++) {
			if(vetorInteiros[i] % 2 == 0) {
				System.out.printf("%d ",vetorInteiros[i]);
			}
		}
		
		System.out.printf("\nSoma: %d",soma);
		//calculando media
		media = (float) soma/vetorInteiros.length; 		/*divisão de dois inteiros o Java descarta a resto da divisão.
		  												  usado (float) após o = para "forcar" o calculo com uma variavel sendo float*/
		System.out.printf("\nMédia: %.2f",media);
		

	}
}
