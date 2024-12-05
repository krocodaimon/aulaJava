package exercicios_repeticao;

import java.util.Scanner;

public class Ex1For {

	public static void main(String[] args) {
		// Variaveis
		int numero1, numero2, contador;
		Scanner leia = new Scanner(System.in);
		// Entrada
		System.out.println("números que são múltiplos de 3 e 5 no intervalo informado!");
		System.out.println("Digite o primeiro número do intevalo");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo número do intervalo");
		numero2 = leia.nextInt();
		// Verificação do intervalo

		if (numero1 >= numero2) {
			System.out.println("Intervalo inválido!");

		} else {
			System.out.println("No intervalo entre " + numero1 + " e " + numero2);

			for (contador = numero1; contador <= numero2; contador++) {
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador + " é multiplo de 3 e 5");
				}
			}

		}
	}

}
