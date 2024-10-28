package exercicios_gen;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		float salarioBruto, salarioLiquido, adicionalNoturno, horasExtras, descontos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o Salario Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Informe o Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Informe a Quantidade de Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Informe o Valor dos Descontos: ");
		descontos = leia.nextFloat();
		
		leia.close();
		
		salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras*5)) - descontos;
		
		System.out.printf("Salario liquido: R$%.2f", salarioLiquido);
		
		}

}
