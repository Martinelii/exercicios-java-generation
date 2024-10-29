package modulo_7;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		int codOperacao;
		float saldo = 1000.00f;
		float movimentacao;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("_______________________");
		System.out.println("[1] - Verificar Saldo");
		System.out.println("[2] - Efetuar Saque");
		System.out.println("[3] - Efetuar Deposito");
		System.out.println("_______________________");
		System.out.print("Escolha uma operação: ");
		codOperacao = scanner.nextInt();
		
		switch(codOperacao) {
			case 1:
				System.out.println("Operação - Saldo: ");
				System.out.printf("Saldo R$%.2f\n",saldo);
				break;
			case 2:
				System.out.print("Valor do Saque: ");
				movimentacao = scanner.nextFloat();
				if(movimentacao > saldo) {
					System.out.println("Saldo Insuficiente!");
				}else {
					System.out.println("Operação - Saque:");
					System.out.printf("Novo Saldo R$%.2f\n", (saldo-movimentacao));
				}
				break;
			case 3:
				System.out.print("Valor do Deposito: ");
				movimentacao = scanner.nextFloat();
				System.out.println("Operação - Deposito:");
				System.out.printf("Novo Saldo R$%.2f\n", (saldo+movimentacao));
				break;
			default:
				System.out.println("Operação Invalida!");
		}
		
		scanner.close();
	}

}
