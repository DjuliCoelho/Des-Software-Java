package Aula01;

import java.util.Scanner;
public class Exercicio07 {

		
		public static void main(String[] args) {
			
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("Digite um número ai: ");
			int num = leitor.nextInt();
			
			if(num >= 100 && num <= 200) {
				System.out.println("Esse número " +num + " tá no meio ");
			} else {
				System.out.println("Esse número " +num + " tá aqui no meio não");
			}
			
		}

	}

