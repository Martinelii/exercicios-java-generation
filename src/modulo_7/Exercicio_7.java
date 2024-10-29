package modulo_7;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		int codOperacao;
		float numero1, numero2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextFloat();
		
		System.out.println("____________________________________");
		System.out.println("[1] Soma");
		System.out.println("[2] Subtração");
		System.out.println("[3] Multiplicação");
		System.out.println("[4] Divisão");
		System.out.println("____________________________________");
		System.out.println("Selecione uma opção: ");
		codOperacao = leia.nextInt();
		
		leia.close();
		switch(codOperacao) {
		
			case 1:
				System.out.printf("%.1f + %.1f = %.1f", numero1, numero2, (numero1+numero2));
				break;
			case 2:
				System.out.printf("%.1f - %.1f = %.1f", numero1, numero2, (numero1-numero2));
				break;
			case 3:
				System.out.printf("%.1f * %.1f = %.1f", numero1, numero2, (numero1*numero2));
				break;
			case 4:
				System.out.printf("%.1f / %.1f = %.1f", numero1, numero2, (numero1/numero2));
				break;
			default:
				System.out.println("Opção Inválida!");
		}
	}

}
