package modulo_09;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		float matrizNotas[][] = new float[10][4]; //10 linha 4 elementos
		
		float vetorMediaFinal[] = new float [10];
		float somaNota;
		//Auxiliares
		int i,j;
		Scanner scanner = new Scanner(System.in);
		
		for(i=0;i<10;i++) {
			for(j=0;j<4;j++){
				System.out.printf("Informe a %dº nota do %dº aluno: ", j+1, i+1);
				matrizNotas[i][j] = scanner.nextFloat();
				
			}
			System.out.println("________________________________________________");
		}
		scanner.close();
		
		//exibindo matriz
		//Apenas verificando as saidas e estrutura da matriz de forma visual.
		for(i=0;i<10;i++){
			System.out.printf("Notas %dº Aluno: ", i+1);
			for(j=0;j<4;j++) {
				System.out.printf("[%.2f] ", matrizNotas[i][j]);
			}
			System.out.println("\n");
		}
		//calcular media e atribuir a vetor
		for(i=0;i<10;i++) { // i representas as linhas; j as colunas
			somaNota = 0;
			for(j=0;j<4;j++) {
				somaNota += matrizNotas[i][j];
			}
			vetorMediaFinal[i] = somaNota;
		}
		
		//exibindo vetor
		System.out.printf("Media Final dos alunos: ");
		for(i=0;i<10;i++) {
			System.out.printf("[%.1f] ", vetorMediaFinal[i]/4);
		}
		
	}

}
