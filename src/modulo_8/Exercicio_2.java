package modulo_8;

import java.util.Scanner;

public class Exercicio_2 {
/*
 * Escreva um algoritmo em Java, que leia 10 números inteiros via teclado
 * e mostre na tela quantos números são pares e quantos número são ímpares.
 */
	public static void main(String[] args) {
		int numero;
		int par = 0, impar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i=1; i<=10; i++) {
			System.out.printf("Digite o %dº numero: ",i);
			numero = leia.nextInt();
			
			if(numero%2 == 0){
				par++;
			}else {
				impar++;
			}
		}
		leia.close();
		System.out.printf("Total de números pares: %d\n", par);
		System.out.printf("Total de números ímpares: %d", impar);
	}

}
