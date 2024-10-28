package exercicios_gen;
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do salario: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o valor do abono: ");
		abono = leia.nextFloat();
		leia.close();
		
		novoSalario = salario + abono;
		
		System.out.printf("Valor Atualizado do Salario R$%.2f", novoSalario);
		
	}

}