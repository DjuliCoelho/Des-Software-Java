package Aula03;

import java.util.Scanner;
public class Exercicio07 {
	public static void main(String[] args) {
		
		        Scanner leitor = new Scanner(System.in);

		        // leitura do custo de fábrica
		        System.out.print("Digite o custo de fábrica do carro: R$ ");
		        double custoFabrica = leitor.nextDouble();

		        // cálculo dos impostos
		        double impostos = custoFabrica * 0.45;

		        // cálculo da percentagem do distribuidor
		        double percentualDistribuidor = 0.28;
		        double custoDistribuidor = (custoFabrica + impostos) * percentualDistribuidor;

		        // cálculo do custo ao consumidor
		        double custoConsumidor = custoFabrica + impostos + custoDistribuidor;

		        // exibição do resultado
		        System.out.printf("O custo ao consumidor do carro é de R$ %.2f\n", custoConsumidor);

		        leitor.close();
		    }
		

	}


