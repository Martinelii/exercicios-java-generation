package modulo_07;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		int numero;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = scanner.nextInt();
		
		scanner.close();
		
		if((numero % 2) == 0 && numero >= 0) {
			System.out.printf("O Número %d é par e positivo!", numero);
		}else if((numero % 2) == 0 && numero < 0){
			System.out.printf("O Número %d é par e negativo!", numero);
		}else if (numero > 0) {
			System.out.printf("O Número %d é impar e positivo!", numero);
		}else {
			System.out.printf("O Número %d é impar e negativo!", numero);
		}
	}

}
