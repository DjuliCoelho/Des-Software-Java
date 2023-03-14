package Aula01;

import java.util.Scanner;
public class Exercicio02 {
	public static void main(String[] args) {
		
		/*
	Ex 2. Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o resultado da sua soma
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int num1;
		int num2;
		System.out.println("Digite um número: ");
		num1 = leitor.nextInt();
		
		System.out.println("Digite outro: ");
		num2 = leitor.nextInt();
		
		int total = num1 + num2;
		
		System.out.println("DEU: " + total);
		
		leitor.close();
		
	}
	

}


