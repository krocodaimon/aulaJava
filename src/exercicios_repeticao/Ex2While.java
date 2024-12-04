package exercicios_repeticao;

import java.util.Scanner;

public class Ex2While {

	public static void main(String[] args) {
		//Variaveis
		int idade = 0, contador21 = 0, contador50 = 0;
		Scanner leia = new Scanner(System.in);
		
		//Entrada
		
		while (idade >=0) {
			System.out.println("Digite uma idade:");
			idade = leia.nextInt();
		
			if (idade <21 && idade  >=0) {
				contador21++;
			} else if (idade >50) {
				contador50++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: " +contador21);
		System.out.println("Total de pessoas maaiores de 50 anos: " +contador50);
	}
	
	
}

		
	
	


