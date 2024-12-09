package exercicios_collections;

import java.util.Scanner;
import java.util.Stack;

public class Ex5Pilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        Scanner leia = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Finalizar o programa");
            System.out.print("Digite uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1: // Adicionar livro na pilha
                    System.out.print("Digite o nome do livro: ");
                    String livro = leia.nextLine();
                    pilha.push(livro);
                    System.out.println("Livro \"" + livro + "\" adicionado à pilha!");
                    break;

                case 2: // Listar livros na pilha
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        System.out.println("Lista de Livros na Pilha:");
                        for (String l : pilha) {
                            System.out.println(l);
                        }
                    }
                    break;

                case 3: // Retirar livro da pilha
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia!");
                    } else {
                        String livroRetirado = pilha.pop();
                        System.out.println("Livro \"" + livroRetirado + "\" foi retirado da pilha!");
                        System.out.println("Pilha atual: " + pilha);
                    }
                    break;

                case 0: // Finalizar o programa
                    System.out.println("Programa Finalizado!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        leia.close();
    }
}
