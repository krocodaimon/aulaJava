package exercicios;

import java.util.Scanner;
// Esse exercicio eu fiz para ler a entrada que a pessoa digitar. O 1_5 é com a entrada que está no exercicio.
public class exercicio1 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in)) {
			float salarioInicial ;
			float abono ;
			
			
			
			System.out.println("Digite seu Sálario: " );
			salarioInicial = leia.nextFloat();
			
			System.out.println("Digite o seu Abono: ");
			abono = leia.nextFloat();
			
			float salarioFinal = salarioInicial + abono;

			
			System.out.println("Seu Sálario agora é:  " + salarioFinal);
		}
	}

}
