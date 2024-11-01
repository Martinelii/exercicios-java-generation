package modulo_10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_3 {

	public static void main(String[] args) {
		Set<Integer> setNumeros = new HashSet<Integer>();

		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<10;i++) {
			System.out.println("Informe um numero: ");
			setNumeros.add(scanner.nextInt());
		}
		scanner.close();
		
		Iterator<Integer> iSetNumero = setNumeros.iterator(); //Declarar após popular o Set.
		while(iSetNumero.hasNext()) {
			System.out.println(iSetNumero.next());
		}
	}

}
