package Aula02;

import java.util.Scanner;

/*Faça um programa que leia dois vetores de 5 elementos cada e verifique se
elessão iguais ou não. Para serem iguais, todos os elementos
dos dois vetores devemcoincidir*/

public class Exercicio07 {
	public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
        
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        boolean iguais = true;
        
        // lendo os valores do vetor 1
        System.out.println("Digite os valores do vetor 1:");
        for (int i = 0; i < 5; i++) {
            vetor1[i] = leitor.nextInt();
        }
        
        // lendo os valores do vetor 2
        System.out.println("Digite os valores do vetor 2:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = leitor.nextInt();
        }
        
        // verificando se os vetores são iguais
        for (int i = 0; i < 5; i++) {
            if (vetor1[i] != vetor2[i]) {
                iguais = false;
                break;
            }
        }
        
        // exibindo o resultado
        if (iguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }
    leitor.close();
	}

}
