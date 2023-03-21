package Aula03;

import java.util.Scanner;
public class Exercicio04 {
	public static void main(String[] args) {
		
		        Scanner leitor = new Scanner(System.in);

		        // leitura dos dados
		        System.out.print("Digite a cotação do dólar (em reais): ");
		        double cotacaoDolar = leitor.nextDouble();

		        System.out.print("Digite a quantidade de dólares disponíveis: ");
		        double quantidadeDolar = leitor.nextDouble();

		        // cálculo da conversão
		        double valorReal = quantidadeDolar * cotacaoDolar;

		        // exibição do resultado
		        System.out.printf("%.2f dólares equivalem a R$ %.2f\n", quantidadeDolar, valorReal);

		        leitor.close();
		    }
		

	}


