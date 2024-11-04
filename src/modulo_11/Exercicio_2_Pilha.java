package modulo_11;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio_2_Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilhaLivros = new Stack<String>();
		Scanner scanner = new Scanner(System.in);
		
		String nomeLivro;
		int opcao;
		
		System.out.println("********************************************");
		System.out.println("[1] - Adicionar Livro na pilha");
		System.out.println("[2] - Listar todos os Livros");
		System.out.println("[3] - Retirar Livro da pilha");
		System.out.println("[0] - Sair");
		System.out.println("********************************************");
		System.out.println("Entre com a opção desejada: ");
		
		do {
			opcao = scanner.nextInt();
			scanner.skip("\\R?"); //consome o caracter \n do
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome: ");
				nomeLivro = scanner.nextLine();
				Adicionar_Fila_Pilha.adicionar(pilhaLivros, nomeLivro);
				//pilhaLivros.push(nomeLivro);
				
				System.out.println("Livro Adicionado!");
				break;
			case 2:
				System.out.println("Lista de Livros: ");
				Listar_Fila_Pilha.listar(pilhaLivros);
				break;
			case 3:
				if(pilhaLivros.isEmpty()) {
					System.out.println("Pilha está vazia!!");
				}else {
					Remover_Fila_Pilha.remover(pilhaLivros);
					//pilhaLivros.pop();
					System.out.println("Um livro retirado da pilha");
					System.out.println("Pilha atual: ");
					Listar_Fila_Pilha.listar(pilhaLivros);
				}
				break;
				
			default:
				System.out.println("Opção Invalida!!");
				break;
		}
		
		System.out.println("********************************************");
		System.out.println("Selecione nova opção: ");
			
		}while(opcao != 0);
		scanner.close();
	}
}
