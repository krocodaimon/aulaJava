package exercicio_decisao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		//variaveis 
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		Scanner leia = new Scanner (System.in);
		//entrada
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? (true ou false):");
		primeiraDoacao = leia.nextBoolean();
		
		
		
		
		//Saída
		
		if (idade >= 18 && idade <= 69) { // Se a pessoa tiver entre 18 / 69 anos
			if (idade >=60 && primeiraDoacao) { // Se a pessoa tiver entre 60/69 anos e verificiar se foi 1 doação ou não
				System.out.println(nome +", você não está apto para doar sangue!");
				

			}else { // se a pessoa tiver nas regras.
				System.out.println(nome +", Você está apto para doar sangue!");

			}
			
		} else { // se a pessoa nao tiver entre 18/69 anos
			System.out.println(nome +", você não está apto para doar sangue!Por conta da idade.");

		}
		

		
	}
	

}
