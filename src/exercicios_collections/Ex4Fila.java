package exercicios_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex4Fila {
    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();
        Scanner leia = new Scanner(System.in);
        int opcao;

        do {
            // menu
            System.out.println("\nMenu:");
            System.out.println("1: Adicionar um novo Cliente na fila");
            System.out.println("2: Listar todos os Clientes na fila");
            System.out.println("3: Chamar (retirar) uma pessoa da fila");
            System.out.println("0: Finalizar o programa");
            System.out.print("Digite uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1: // Adicionar cliente
                    System.out.print("Digite o nome do Cliente: ");
                    String nome = leia.nextLine();
                    filaClientes.add(nome);
                    System.out.println("\nCliente Adicionado!");
                    System.out.println("Fila: " + filaClientes);
                    break;

                case 2: // Listar clientes na fila
                    if (filaClientes.isEmpty()) {
                        System.out.println("\nA Fila está vazia!");
                    } else {
                        System.out.println("\nLista de Clientes na Fila:");
                        for (String cliente : filaClientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;

                case 3: // Chamar cliente
                    if (filaClientes.isEmpty()) {
                        System.out.println("\nA Fila está vazia!");
                    } else {
                        String clienteChamado = filaClientes.poll();
                        System.out.println("\nO Cliente foi Chamado: " + clienteChamado);
                        System.out.println("Fila: " + filaClientes);
                    }
                    break;

                case 0: // Finalizar programa
                    System.out.println("\nPrograma Finalizado!");
                    break;

                default: // Opção inválida
                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        leia.close();
    }
}
