package exercicios_repeticao;

import java.util.Scanner;

public class Ex3While {

	public static void main(String[] args) {
		int idade, genero = 6, totalBack = 0, mtFront = 0, htMobile = 0, nbFullstack = 0, totalPessoas = 0;
		int desenvolvedora, somaIdade = 0;
		String res = "S";
		Scanner leia = new Scanner(System.in);

		// entrada

		while (res.equalsIgnoreCase("S")) {
			System.out.println("Digite a idade do colaborador: ");
			idade = leia.nextInt();

			System.out.println(
					"Identidade de gênero : (1-Mulher Cis, 2-Homem Cis, 3-Não Binário, 4-Mulher Trans, 5-Homem Trans, 6-Outros)");
			genero = leia.nextInt();

			System.out.println("Pessoa Desenvolvedora: (1-Backend, 2-Frontend, 3-Mobile, 4-FullStack): ");
			desenvolvedora = leia.nextInt();
			// processo e saida.

			totalPessoas++;
			somaIdade += idade;

			if (desenvolvedora == 1) {
				totalBack++;
			} else if (desenvolvedora == 2 && (genero == 1 || genero == 4)) {
				mtFront++;
			} else if (desenvolvedora == 3 && (genero == 2 || genero == 5) && idade > 40) {
				htMobile++;
			} else if (desenvolvedora == 4 && genero == 3 && idade < 30) {
				nbFullstack++;
			}

			System.out.println("Deseja continuar? (S/N)");
			res = leia.next();
		}
		float mediaIdade = somaIdade / totalPessoas;
		System.out.println("Número de pessoas desenvolvedoras Backend: " + totalBack);
		System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + mtFront);
		System.out.println("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + htMobile);
		System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + nbFullstack);
		System.out.println("Número total de pessoas que responderam à pesquisa: " + totalPessoas);
		System.out.printf("Média de idade das pessoas que responderam à pesquisa: %.2f\n", mediaIdade);
	}
}
