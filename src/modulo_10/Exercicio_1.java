package modulo_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_1 {
/*
 * Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList. 
 * Em seguida, faça o que se pede:
 * Mostre na tela todas as cores que foram adicionadas. 
 * Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
 */
	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		//Populando o Array
		for(int i=0; i<5;i++){
			System.out.println("Informe uma Cor: ");
			cores.add(scanner.nextLine());
		}
		
		scanner.close();
		//Exibindo Vetor não Ordenado
		System.out.println("\nLista de cores: ");
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		//Ordenando o Array
		cores.sort(null);
		//Exibindo Vetor Ordenado
		System.out.println("\nLista de cores Ordenadas:");
		for(String cor : cores) {
			System.out.println(cor);
		}
		

	}

}
