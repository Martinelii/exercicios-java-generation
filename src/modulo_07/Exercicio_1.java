package modulo_07;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		int valorA, valorB, valorC;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Infome o valor do numero A: ");
		valorA = scanner.nextInt();
		
		System.out.println("Informe o valor do numero B: ");
		valorB = scanner.nextInt();
		
		System.out.println("Informe o valor do numero C: ");
		valorC = scanner.nextInt();
		
		scanner.close();
		
		if((valorA + valorB) > valorC){
			System.out.printf("%d + %d = %d > %d", valorA, valorB,(valorA+valorB),valorC);
			System.out.println("\nValor de A + B é Maior do que C");
		}else if((valorA + valorB) == valorC){
			System.out.printf("%d + %d = %d = %d", valorA, valorB, (valorA+valorB), valorC);
			System.out.println("\nValor de A + B é Igual a C");
		}else {
			System.out.printf("%d + %d = %d < %d", valorA, valorB, (valorA+valorB), valorC);
			System.out.println("\nValor de A + B é Menor do que C");
		}
	}

}
