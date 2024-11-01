package modulo_08;

import java.util.Scanner;

public class Exercicio_1 {
/*
 * Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, 
 * onde o primeiro número deve ser menor do que o segundo número. Caso contrário,
 *  deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. 
No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5. Veja os exemplos abaixo:
 */
	public static void main(String[] args) {
		int numero1, numero2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o 1º numero: ");
		numero1 = scanner.nextInt();
		
		System.out.println("Informe um numero maior que o 1º: ");
		numero2 = scanner.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("Intervalo Invalido!!");
		}else {
			for(int i= numero1;i<=numero2;i++) {
				if(i%3 == 0 && i%5 == 0) {
					System.out.printf("%d é multiplo de 3 e 5\n", i);
				}
			}
		}
		
		scanner.close();
	}

}
