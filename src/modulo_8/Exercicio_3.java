package modulo_8;

import java.util.Scanner;

public class Exercicio_3 {

/*
 * Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), 
 * via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos 
 * e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser 
 * finalizada ao digitar uma idade negativa. Veja o exemplo abaixo: 
 */
	public static void main(String[] args) {
		int idade = 0;
		int menorVinteUm = 0, maiorCinqueta = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while(idade < 0 == false) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade > 0) {
				menorVinteUm++;
			}else if(idade > 50){
				maiorCinqueta++;
			}
		}
		System.out.printf("Total de pessoas menores de 21 anos: %d\n", menorVinteUm);
		System.out.printf("Total de pessoas maiores de 50 anos: %d", maiorCinqueta);
		
		leia.close();
	}

}
