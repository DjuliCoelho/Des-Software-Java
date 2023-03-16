package Aula02;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
        
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];
        int[] vetorC = new int[5];
        
        // lendo os valores do vetor A
        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = leitor.nextInt();
        }
        
        // lendo os valores do vetor B
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < 5; i++) {
            vetorB[i] = leitor.nextInt();
        }
        
        // gerando o vetor C
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) { // posição par
                vetorC[i] = vetorA[i];
            } else { // posição ímpar
                vetorC[i] = vetorB[i];
            }
        }
        
        // exibindo o vetor C
        System.out.println("Vetor C:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetorC[i] + " ");
        }
    leitor.close();
	}

}
