package Aula03;

import java.util.Scanner;
public class Exercicio05 {
	public static void main(String[] args) {
		
		        Scanner leitor = new Scanner(System.in);

		        // leitura do valor da compra
		        System.out.print("Digite o valor da compra: R$ ");
		        double valorCompra = leitor.nextDouble();

		        // cálculo das prestações
		        double valorPrestacao = valorCompra / 5;

		        // exibição do resultado
		        System.out.printf("O valor de cada prestação é de R$ %.2f\n", valorPrestacao);

		        leitor.close();
		    }
	}


//A Loja do prof Geucelove O Brilhador está vendendo seus produtos em 5 (cinco) prestações
//sem juros.Faça um programa que receba um valor de uma compra e mostre o valor das prestaçõe