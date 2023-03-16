package Aula02;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int qnt = 5;
		String[] vetor1 = new String[qnt];
		String[] vetor2 = new String[qnt];
		
		for(int i = 0; i < vetor1.length; i++) {
		
		System.out.println("Digao numero: ");
		//int numero = leitor.nextInt();
		vetor1[i] = leitor.nextLine();
		}
		for(int i = 0; i < vetor1.length; i++) {
			String vlrVetor1 = vetor1[i];
			//int dobro = Integer.parseInt(vlrVetor1) * 2;
			Integer dobro = Integer.parseInt(vlrVetor1) * 2;
			vetor2[i] = dobro.toString();
		}
		
		for(int i = 0; i < vetor1.length; i++) {
			String valor = vetor2[i];
			System.out.println("Valor em dobro: " + valor);
		}
			
		//System.out.println("Valor digitado: " + numero);
		
		
		
		leitor.close();
	}
	}


