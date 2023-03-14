package Aula01;

import java.util.Scanner;
public class Exercicio08 {
	
public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número ai: ");
		int num = leitor.nextInt();
		
		if(num >= 50) {
			System.out.println("Esse número " +num + " é maior ou igual a 50");
		} else {
			System.out.println("Esse número " +num + " é menor que 50");
		}
		
	}

}


