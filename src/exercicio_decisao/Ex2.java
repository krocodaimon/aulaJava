package exercicio_decisao;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int n1;
		
		
		Scanner leia = new Scanner (System.in);
		//Processo
		System.out.println("Digite um número: ");
		n1 = leia.nextInt();
		//par
		if (n1 >= 0) {
			if (n1 %2 == 0 ) {
				System.out.println("O número "+ n1 + " é par e positivo!");

			} else   {
				System.out.println("O número "+ n1 + " é impar e positivo!");

			} 
			
		} else {
			if (n1 %2 == 0 ) { //impar
				System.out.println("O número "+ n1 + " é par e negativo!");

			} else   {
				System.out.println("O número "+ n1 + " é impar e negativo!");

			} 
			
		}
			
		
		
		
	}

}
