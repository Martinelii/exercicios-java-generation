package modulo_7;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean doador;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Nome do Doador: ");
		nome = scanner.nextLine(); //Line para ler com espaços.
		
		System.out.println("Digite a Idade do Doador: ");
		idade = scanner.nextInt();
		
		System.out.println("Primeira doação de sangue?");
		doador = scanner.nextBoolean();
		
		scanner.close();
		
		if(idade >= 18 && idade < 60){
			System.out.println(nome + " está apto para doar sangue!");
		}else if(idade >= 60 && idade <= 69 && doador == false){
			System.out.println(nome + " está apto para doar sangue!");
		}else {
			System.out.println(nome + " não está apto para doar sangue!");
		}
		
	}

}
