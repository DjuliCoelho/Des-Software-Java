package Aula02;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
        
        int[] vetor = new int[5];
        int n, contador = 0;
        
        // lendo os valores do vetor
        System.out.println("Digite os valores do vetor:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = leitor.nextInt();
        }
        
        // lendo o valor de n
        System.out.println("Digite o valor de n:");
        n = leitor.nextInt();
        
        // contando a quantidade de vezes que n aparece no vetor
        for (int i = 0; i < 5; i++) {
            if (vetor[i] == n) {
                contador++;
            }
        }
        
        // exibindo a quantidade de vezes que n aparece no vetor
     
        System.out.println("O número " + n + " aparece " + contador + " vezes no vetor.");
        
        leitor.close();
    }

	}



