package modulo_09;

import java.util.Scanner;

/*
 * Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, 
 * construa um algoritmo que consiga pesquisar dados no vetor, 
 * onde o usuário irá digitar um número e o programa deve exibir na tela 
 * a posição deste número no vetor. Caso o número não seja encontrado, 
 * a mensagem: “Não foi encontrado!” deve ser exibida na tela. 
 */
public class Exercicio_1 {

	public static void main(String[] args) {
		
		int vetorInteiro[] = {2,5,1,3,4,9,7,8,10,6};
		int numeroPesquisa;
		boolean encontrado = false; //variavel de verificação
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o numero que deseja pesquisar: ");
		numeroPesquisa = leia.nextInt();
		
		leia.close();
		
		for(int i=0; i<vetorInteiro.length; i++){
			if(numeroPesquisa == vetorInteiro[i]){ //comparando entrada com valores do vetor
				System.out.printf("O numero %d está localizado na posição: %d\n", numeroPesquisa, i);
				encontrado = true; //ao localizar sinaliza que foi encontrada.
			}
		}
		if(encontrado == false){ //verifica se não foi encontrada.
			System.out.printf("O numero %d não foi encontrado!!", numeroPesquisa);
		}
		
	}

}
