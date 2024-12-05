package exercicios_vetor;

import java.util.Scanner;

public class Ex2Vetor {
	public static void main(String[] args) {
		int[] vetor = new int[10];

		Scanner leia = new Scanner(System.in);

		// Entrada
		System.out.println("Digite 10 números inteiros:");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = leia.nextInt();
		}

		int soma = 0; // soma
		double media; // média
		int contPares = 0; // pares

		System.out.print("\nElementos nos índices ímpares:\n");
		for (int i = 1; i < vetor.length; i += 2) {
			System.out.print(vetor[i] + " ");
		}

		System.out.print("\n\nElementos pares:\n");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) { // Verifica se o número é par
				System.out.print(vetor[i] + " "); // Exibe o número par
			}
			soma += vetor[i]; // Soma todos os elementos do vetor apenas uma vez
		}

		// Exibição da soma total de todos os elementos do vetor
		System.out.println("\n\nSoma: " + soma);

		// Cálculo da média dos elementos do vetor
		media = (double) soma / vetor.length;
		System.out.printf("Média: %.2f\n", media);
	}
}
