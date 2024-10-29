package modulo_7;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String categoria, familia, alimentacao;
		
		String vertebrado = "Vertebrado";
		String aves = "Ave";
		String onivoro = "Onivoro";
		String inseto = "Inseto";
		String hematofago = "Hematofago";
		
		System.out.println("Seu animal é Invertebrado ou Vertebrado? ");
		categoria = scanner.nextLine();
		
		if(categoria.equalsIgnoreCase(vertebrado) == true){
			System.out.println("Seu animal é uma Ave ou Mamífero?");
			familia = scanner.nextLine();
			if(familia.equalsIgnoreCase(aves) == true) {
				System.out.println("Ele é Onivoro ou Carnívoro?");
				alimentacao = scanner.nextLine();
				if(alimentacao.equalsIgnoreCase(onivoro) == true) {
					System.out.println("É uma Pomba");
				}else {
					System.out.println("É uma Aguia");
				}
				
			}else {
				System.out.println("Ele é Onivoro ou Herbivoro?");
				alimentacao = scanner.nextLine();
				if(alimentacao.equalsIgnoreCase(onivoro) == true) {
					System.out.println("É um Homem");
				}else {
					System.out.println("É uma Vaca");
				}
			}
			
		}else {
			System.out.println("É um Inseto ou Anelideo?");
			familia = scanner.nextLine();
			if(familia.equalsIgnoreCase(inseto) == true) {
				System.out.println("É Hematografo ou Herbivoro?");
				alimentacao = scanner.nextLine();
				if(alimentacao.equalsIgnoreCase(hematofago) == true) {
					System.out.println("É uma Pulga");
				}else {
					System.out.println("É uma Lagarta");
				}
				
			}else {
				System.out.println("É Hematografo ou Onivoro?");
				alimentacao = scanner.nextLine();
				if(alimentacao.equalsIgnoreCase(hematofago) == true) {
					System.out.println("É uma Sanguessuga");
				}else {
					System.out.println("É uma Minhoca");
				}
			}
			
		}
		scanner.close();
	}

}
