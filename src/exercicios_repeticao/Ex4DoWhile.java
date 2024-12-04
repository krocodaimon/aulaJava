package exercicios_repeticao;

import java.util.Scanner;

public class Ex4DoWhile {

    public static void main(String[] args) {
        int numeros, soma = 0; 

        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("Digite um número inteiro (ou um número negativo para sair):");
            numeros = leia.nextInt(); 

            // soma dos numeros positivos
            if (numeros > 0) {
                soma += numeros; // Adiciona à soma
            }

        } while (numeros !=0); // para quando for 0

        
        System.out.println("A soma dos números positivos é: " + soma);

    }
}

		
		
	


