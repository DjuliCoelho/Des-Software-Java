package Aula01;

import java.util.Scanner;
public class Exercicio03 {

		public static void main(String[] args) {
			
			/*
			 * Ex 3. Escreva um algoritmo que leia os valores de dois números inteiros 
			 * dis�ntos nas variáveis A e B e informequal deles é o maior. Caso os números 
			 * sejam iguais informar ao usuário que a sequência de números informados éinválida
			 */
			
			
			Scanner leitor = new Scanner(System.in);
			
			int a;
			int b;
			
			System.out.println("Informe o número A: ");
			a = leitor.nextInt();
			
			System.out.println("Informe o número B: ");
			b = leitor.nextInt();
			
			if (a == b) {
				
				System.out.println("Não números iguais ");
			} else {
				if (a > b) {
					System.out.println(" A maior que B");
				}
				if (a < b) {
					System.out.println(" A menor que B");
				}
			}
		}
		
	}


