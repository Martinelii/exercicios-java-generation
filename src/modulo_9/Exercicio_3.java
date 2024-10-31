package modulo_9;

import java.util.Scanner;

public class Exercicio_3 {
/*
 * Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
 * Todos os elementos da Diagonal Principal
 * Todos os elementos da Diagonal Secundária
 * A Soma de todos os elementos da Diagonal Principal
 * A Soma de todos os elementos da Diagonal Secundária
 */
	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;
		
		//variaveis auxiliares
		int i, j, espaco =0;
		Scanner scanner = new Scanner(System.in);
		
		//Populando Matriz
		for( i=0; i<3;i++) {
			for( j=0; j<3; j++){
				System.out.println("Informe o numero: ");
				matriz[i][j] = scanner.nextInt();
			}
			scanner.close();
		}
		
		//Percorrendo Matriz e Exibindo matriz
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(espaco < 3) {
					System.out.printf("[%d] ", matriz[i][j]);
					espaco ++;
				}else {
					System.out.printf("\n[%d] ", matriz[i][j]);
					espaco = 1;
				}
			}
		}
		
		//Exibindo Diagonal Principal e Somando
		System.out.println("\nElementos da Diagonal Principal: ");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(i==j){
					System.out.printf("%d ", matriz[i][j]);
					somaDiagonalPrincipal += matriz[i][j];
				}
			}
		}
		
		//Exibindo Diagonal Secundaria e Somando
		System.out.println("\nElementos da Diagonal Secundaria: ");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(i+j == 2){
					System.out.printf("%d ", matriz[i][j]);
					somaDiagonalSecundaria += matriz[i][j];
				}
			}
		}
		
		System.out.println("\nSoma dos Elementos da Diagonal Principal: "+ somaDiagonalPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundaria: "+ somaDiagonalSecundaria);
	}

}
