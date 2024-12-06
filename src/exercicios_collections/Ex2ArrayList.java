package exercicios_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2ArrayList {

	public static void main(String[] args) {
		// armazena numeros
		ArrayList<Integer> numeros = new ArrayList<>();
		// numeros armazenados no array
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		Scanner leia = new Scanner(System.in);
		// verificar se o numero fo iencontrado
		boolean encontrado = false;

		// usuario digita o numero.
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		int numeroSearch = leia.nextInt();
		
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == numeroSearch ) {
				System.out.println("\nO número " + numeroSearch + " está localizado na posição " +i);
				encontrado = true;
				break;
			}
			
		}
		// se o numero n foi encontrado
		if (!encontrado) {
			System.out.println("\nO número " + numeroSearch + " não foi encontrado!");
		}
	}

}
