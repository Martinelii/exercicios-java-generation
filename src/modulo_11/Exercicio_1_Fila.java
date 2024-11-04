package modulo_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_1_Fila {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		int opcao;
		
		Queue<String> filaClientes = new LinkedList<String>();
		
		System.out.println("********************************************");
		System.out.println("[1] - Adicionar Cliente na fila");
		System.out.println("[2] - Listar todos os Clientes");
		System.out.println("[3] - Retirar Cliente da fila");
		System.out.println("[0] - Sair");
		System.out.println("********************************************");
		
		System.out.println("Entre com a opção desejada: ");

		do {
			opcao = scanner.nextInt();
			
			if(opcao == 1) {
				System.out.println("Digite o nome: ");
				nome = scanner.next();
				Adicionar_Fila_Pilha.adicionar(filaClientes, nome);
				//filaClientes.add(nome);
				System.out.println("Cliente adicionado!!\n");
			}else if(opcao == 2) {
				System.out.println("Lista de Clientes: \n");
				Listar_Fila_Pilha.listar(filaClientes);
			}else if(opcao == 3){
				if(filaClientes.isEmpty()) {
					System.out.println("A fila está Vazia!!");
				}else {
					Remover_Fila_Pilha.remover(filaClientes);
					//filaClientes.poll();
					System.out.println("Cliente Chamado!!");
					System.out.println("\nFila atual: \n");
					Listar_Fila_Pilha.listar(filaClientes);
				}
			}else {
				System.out.println("Selecione Opção Valida!!");
			}
			System.out.println("********************************************");
			System.out.println("Selecione nova opção: ");
			
		}while(opcao != 0);

		scanner.close();
	}
	


}
