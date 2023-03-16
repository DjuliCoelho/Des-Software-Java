package Aula02;

import java.util.Scanner;
//Elabore um programa que leia um vetor de 5 números digitados pelo
//usuário e uma variável de um número n qualquer, 
//depois mostre na tela o índice dos elementos que são inferiores a n.

public class Exercicio04 {
	public static void main(String[] args) {
		 Scanner leitor = new Scanner(System.in);
	        
	        int[] vetor = new int[5];
	        int n;
	        
	        // lendo os valores do vetor
	        System.out.println("Digite os valores do vetor:");
	        for (int i = 0; i < 5; i++) {
	            vetor[i] = leitor.nextInt();
	        }
	        
	        // lendo o valor de n
	        System.out.println("Digite o valor de n:");
	        n = leitor.nextInt();
	        
	        // exibindo os índices dos elementos inferiores a n
	        System.out.println("Os índices dos elementos inferiores a " + n + " são:");
	        for (int i = 0; i < 5; i++) {
	            if (vetor[i] < n) {
	                System.out.println(i);
	            }
	        }
	        leitor.close();
	    }
	}


