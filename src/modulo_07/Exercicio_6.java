package modulo_07;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {

		String nome;
		int codigoCargo;
		float salario;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Nome do Colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("Código do Cargo: ");
		codigoCargo = leia.nextInt();
		
		System.out.println("Informe o seu Salario: ");
		salario = leia.nextFloat();
		
		leia.close();
		
		switch(codigoCargo) {
		case 1:
			System.out.println("Nome Colaborador: " + nome);
			System.out.printf("Cargo: Gerente");
			System.out.printf("\nSalario: R$%.2f", salario+(0.10*salario));
			break;
		case 2:
			System.out.println("Nome Colaborador: " + nome);
			System.out.printf("Cargo: Vendedor");
			System.out.printf("\nSalario: R$%.2f", salario+(0.07*salario));
			break;
		case 3:
			System.out.println("Nome Colaborador: " + nome);
			System.out.printf("Cargo: Supervisor");
			System.out.printf("\nSalario: R$%.2f", salario+(0.09*salario));
			break;
		case 4:
			System.out.println("Nome Colaborador: " + nome);
			System.out.printf("Cargo: Motorista");
			System.out.printf("\nSalario: R$%.2f", salario+(0.06*salario));
			break;
		case 5:
			System.out.println("Nome Colaborador: " + nome);
			System.out.printf("Cargo: Estoquista");
			System.out.printf("\nSalario: R$%.2f", salario+(0.05*salario));
			break;
		case 6:
			System.out.println("Nome Colaborador: " + nome);
			System.out.printf("Cargo: Tecnico de TI");
			System.out.printf("\nSalario: R$%.2f", salario+(0.08*salario));
			break;
	}

	}

}
