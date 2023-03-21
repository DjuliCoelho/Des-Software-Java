package Aula03;

import java.util.Scanner;
public class Exercicio06 {
	public static void main(String[] args) {
		
		        Scanner leitor = new Scanner(System.in);

		        // leitura do preço de custo
		        System.out.print("Digite o preço de custo do produto: R$ ");
		        double precoCusto = leitor.nextDouble();

		        // leitura do percentual de acréscimo
		        System.out.print("Digite o percentual de acréscimo sobre o preço de custo (%): ");
		        double percentualAcrescimo = leitor.nextDouble();

		        // cálculo do preço de venda
		        double precoVenda = precoCusto * (1 + percentualAcrescimo / 100);

		        // exibição do resultado
		        System.out.printf("O preço de venda do produto é de R$ %.2f\n", precoVenda);

		        leitor.close();
		    }
	}

