package Aula02;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        
        // lendo os valores do vetor A
        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = leitor.nextInt();
        }
        
        // copiando os valores de A em B de forma invertida
        for (int i = 0; i < 5; i++) {
            vetorB[i] = vetorA[4 - i];
        }
        
        // exibindo o vetor B
        System.out.println("Vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetorB[i] + " ");
        }
        leitor.close();
    }
		
	}


