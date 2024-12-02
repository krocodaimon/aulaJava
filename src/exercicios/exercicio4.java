package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);

		float n1;
		float n2;
		float n3;
		float n4;
		
		System.out.println("Digite o primeiro número " );
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número " );
		n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro número" );
		n3 = leia.nextFloat();
		
		System.out.println("Digite o quarto número " );
		n4 = leia.nextFloat();
		
		
		float diferenca = (n1*n2) - (n3*n4);
		
		System.out.println("A diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4 é: "+ diferenca);

	}

}
