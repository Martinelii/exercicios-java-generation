package modulo_10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_4 {

	public static void main(String[] args) {
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		Scanner scanner = new Scanner(System.in);
		
		int numeroLido;
		
		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numeroLido = scanner.nextInt();
		
		scanner.close();
		
		if(setNumeros.contains(numeroLido)) {
			System.out.printf("O número %d foi encontrado", numeroLido);
		}else {
			System.out.printf("O número %d não foi encontrado!", numeroLido);
		}

	}

}
