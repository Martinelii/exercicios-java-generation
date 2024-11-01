package modulo_08;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		int idade, genero, funcao;
		char continuar = 'S';
		
		int totalBack = 0;
		int mulherCisTransFront = 0;
		int homemCisTransMobile = 0;
		int naoBinarias = 0;
		int pessoas = 0;
		float mediaIdade = 0.0f;
		
		Scanner leia = new Scanner(System.in);
		
		while(continuar != 'N'){
			System.out.println("Informe sua Idade: ");
			idade = leia.nextInt();
			
			mediaIdade += idade;
			
			System.out.println("_________________________");
			System.out.println("[1]- Mulher Cis");
			System.out.println("[2]- Homem Cis");
			System.out.println("[3]- Não Binario");
			System.out.println("[4]- Mulher Trans");
			System.out.println("[5]- Homem Trans");
			System.out.println("[6]- Outros");
			System.out.println("_________________________");
			genero = leia.nextInt();
			
			System.out.println("_________________________");
			System.out.println("[1]- Backend");
			System.out.println("[2]- Frontend");
			System.out.println("[3]- Mobile");
			System.out.println("[4]- FullStack");
			System.out.println("_________________________");
			funcao = leia.nextInt();
			
			pessoas++;
			
			if((genero == 1 || genero == 4) && funcao == 2 ){
				mulherCisTransFront++;
			}
			if((genero == 2 || genero == 5) && funcao == 3 && idade > 40 ){
				homemCisTransMobile++;
			}
			if(genero == 3 && funcao == 4 && idade<30 ){
				naoBinarias++;
			}
			if(funcao == 1 ){
				totalBack++;
			}
			
			
			System.out.println("Deseja continuar (S/N): ");
			continuar = leia.next().charAt(0);
		}
		leia.close();
		mediaIdade /= pessoas;
		
		System.out.printf("Total de pessoas desenvolvedoras Backend: %d\n",totalBack);
		System.out.printf("Total de Mulheres Cis e Trans desenvolvedoras Frontend: %d\n",mulherCisTransFront);
		System.out.printf("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d\n",homemCisTransMobile);
		System.out.printf("Total de pessoas não binarias desenvolvedoras FullStack menores de 30 ano: %d\n",naoBinarias);
		System.out.printf("O numero total de pessoas que responderam a pesquisa: %d\n",pessoas);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f\n",mediaIdade);
	
	
	}

}
