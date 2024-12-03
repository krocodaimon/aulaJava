package exercicio_decisao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		//Variaveis
		float a;
		float b;
		float c;
		
		Scanner leia = new Scanner (System.in);
		//Processo
		System.out.println("Digite o número A: ");
		a = leia.nextFloat();
		System.out.println("Digite o número B: ");
		b = leia.nextFloat();
		System.out.println("Digite o número C: ");
		c = leia.nextFloat();
		
		float soma = a + b;

		//Saída
		
		if (soma > c) {
			System.out.println("A soma de A + B é maior do que C ");

		} else if (soma == c){
			System.out.println("A soma de A + B é igual a C ");

		} else {
			System.out.println("A soma de A + B é menor do que C ");

		}
	}

}
