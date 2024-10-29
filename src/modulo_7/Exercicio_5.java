package modulo_7;

import java.util.Scanner;

public class Exercicio_5 {
	public static void main(String[] args) {
		int codigo, quantidade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código do Produto: ");
		codigo = leia.nextInt();
		
		System.out.println("Quantidade: ");
		quantidade = leia.nextInt();
		
		leia.close();
		
		switch(codigo) {
			case 1:
				System.out.println("Produto: Cachorro Quente");
				System.out.printf("Valor total: R$%d", quantidade * 10);
				break;
			case 2:
				System.out.println("Produto: X-Salada");
				System.out.printf("Valor total: R$%d", quantidade * 15);
				break;
			case 3:
				System.out.println("Produto: X-Bacon");
				System.out.printf("Valor total: R$%d", quantidade * 18);
				break;
			case 4:
				System.out.println("Produto: Bauru");
				System.out.printf("Valor total: R$%d", quantidade * 12);
				break;
			case 5:
				System.out.println("Produto: Refrigerante");
				System.out.printf("Valor total: R$%d", quantidade * 8);
				break;
			case 6:
				System.out.println("Produto: Suco de Laranja");
				System.out.printf("Valor total: R$%d", quantidade * 13);
				break;
		}
			
		
	}
}
