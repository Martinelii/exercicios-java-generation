package exercicios_gen;
import java.util.Scanner;


public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.println("Informe a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Informe a quarta nota: ");
		nota4 = leia.nextFloat();
		
		leia.close();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("Media Final: %.1f", mediaFinal);
	}

}
