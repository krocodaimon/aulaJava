package exercicios_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex1ArrayList {

	public static void main(String[] args) {
		//armazena cores
		ArrayList<String> cores = new ArrayList<>();
		
		Scanner leia = new Scanner (System.in);
		
		// vai ler as cores
		System.out.println("\nDigite 5 cores: ");
		
		for (int i = 0; i < 5; i++){
			System.out.println("\nCor " +(i+1) + ":");
			String cor = leia.nextLine();
			cores.add(cor); //add cor no arrayList
		}
		
		System.out.println("\nCores adicionadas:");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		//ordem crescente a,b,c
		Collections.sort(cores);
		
		System.out.println("\nCores ordenadas");
		for (String cor : cores) {
			System.out.println(cor);
		}
	}

}
