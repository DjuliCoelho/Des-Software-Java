package Aula01;

import java.util.Scanner;
public class Exercicios {
public static void main(String[] args) {
		
		/*
		Ex 1. Escreva um algoritmo que leia um número digitado
		pelo usuário e mostre a mensagem "Número maior doque 10! ”,
		caso este número seja maior, ou “Número menor ou igual a 10! ”,
		caso este número seja menor ou igual.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		
		int numero;
		System.out.println("Digite um número: ");
		numero = leitor.nextInt();
		
		if (numero > 10) {
			System.out.println("Numero é maior que 10!");
		} else {
			System.out.println("Numero menos que 10!");
		}
		
		leitor.close();
		
	}

}


