package exercicios_gen;
import java.util.Scanner;

public class Exercicio_4 {
	public static void main(String[] args) {
		
		float num1, num2, num3, num4, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o valor do primeiro numero: ");
		num1 = leia.nextFloat();
		
		System.out.println("Informe o valor do segundo numero: ");
		num2 = leia.nextFloat();
		
		System.out.println("Informe o valor do terceito numero: ");
		num3 = leia.nextFloat();
		
		System.out.println("Informe o valor do quarto numero: ");
		num4 = leia.nextFloat();
		
		leia.close();
		
		diferenca = (num1 * num2)-(num3 * num4);
		
		System.out.printf("Diferenca: %.1f", diferenca);
		
	}
}
