package exercicios_collections;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;


public class Ex3HashSet {

	public static void main(String[] args) {
		//Armazena sem poder repetir
		Set<Integer> setNumeros = new HashSet<>();
		Scanner leia = new Scanner (System.in);
		
		
		//SOlicita 10 numeros pro usuario
		System.out.println("\nDigite 10 números sem repetir: ");
		
		for (int i = 0; i < 10; i++) {
			int numero;

			//Solicita o numero ao usuario
			System.out.println("\nDigite o " + (i+1) + "º número");
			numero = leia.nextInt();
			
			
			//add o numero no set 
			setNumeros.add(numero);
			
		}
		
		
		//Exibir set
		System.out.println("\nListar dados do Set: ");
		for (Integer numero : setNumeros) {
			System.out.println(numero);
		}
	}
}


