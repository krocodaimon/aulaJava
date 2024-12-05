package exercicios_vetor;

import java.util.Scanner;

public class Ex1Vetor {
    public static void main(String[] args) {
        // vetor com os 10 num
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o número que você deseja encontrar: ");
        int numero = leia.nextInt();
        
        boolean encontrado = false;
        
        // laço for
        for (int i = 0; i < 10;i++)
            if (vetor[i] == numero) {
                System.out.println("O número " + numero + " está localizado na posição: " + i);
                encontrado = true;
                break; // Num encontrado
            }
        
        
        // numero não encontrado
        if (!encontrado) {
            System.out.println("O número " + numero + " não foi encontrado!");
        }
        
    
    }
}

