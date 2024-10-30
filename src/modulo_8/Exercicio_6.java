package modulo_8;

import java.util.Scanner;

public class Exercicio_6 {
/*
 * Escreva um algoritmo em Java, que leia números inteiros via teclado,
 * até que o número zero seja digitado. Ao final, mostre na tela a média de todos 
 * os números digitados, que sejam múltiplos de 3. Veja o exemplo abaixo:
 */
	public static void main(String[] args) {
		
		int numero, multiplo = 0;
		float media = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			
			if(numero%3 == 0 && numero>0){
				multiplo++;
				media += numero;
			}
			
		}while(numero!=0);
	
		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", media/multiplo);
		leia.close();
	}

}
