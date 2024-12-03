package exercicios_introducao;

import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		
		
		System.out.println("Digite seu Salário Bruto");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite seu Adicional Noturno");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Digite suas Horas Extras");
		horasExtras = leia.nextFloat();

		System.out.println("Digite seus Descontos");
		descontos = leia.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("Seu Salário Líquido é : " + salarioLiquido);


		

	}

}
