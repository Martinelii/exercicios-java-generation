package modulo_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_2 {
	public static void main(String[] args) {
		int numeroDigitado;
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);

		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite um numero Inteiro: ");
		numeroDigitado = scanner.nextInt();
		
		scanner.close();
		
		if(numeros.contains(numeroDigitado)) {
			System.out.printf("O número %d está localizado na posição: %d", numeroDigitado, numeros.indexOf(numeroDigitado));
		}else {
			System.out.printf("O número %d não foi encontrado!", numeroDigitado);
		}
		
	}
}


