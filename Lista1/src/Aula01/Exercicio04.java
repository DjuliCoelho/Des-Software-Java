package Aula01;

import java.util.Scanner;
public class Exercicio04 {
	

		public static void main(String[] args) {
			/*
			 * Ex 4. Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração, mul�plicação e a divisãodos números lidos.
			 */
					
			Scanner leitor = new Scanner(System.in);
			
			int a;
			int b;
			
			System.out.println("Escreve um núm: ");
			a = leitor.nextInt();
			
			System.out.println("Escreve um núm: ");
			b = leitor.nextInt();
			
			int sub = a - b;
			int soma = a + b;
			int div = a / b;
			int mult = a * b;
			
			System.out.println("DEU: " + soma);
			System.out.println("DEU: " + sub);
			System.out.println("DEU: " + mult);
			System.out.println("DEU: " + div);
			
		}
	}


