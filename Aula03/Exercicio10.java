package Aula03;

import java.util.Scanner;
public class Exercicio10 {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int qtdPessoas, idade;
	        System.out.print("Digite a quantidade de pessoas: ");
	        qtdPessoas = input.nextInt();
	        for (int i = 1; i <= qtdPessoas; i++) {
	            System.out.print("Digite a idade da " + i + "ª pessoa: ");
	            idade = input.nextInt();
	            if (idade >= 18) {
	                System.out.println("A pessoa é maior de idade");
	            } else {
	                System.out.println("A pessoa é menor de idade");
	            }
	        }
	        input.close();
	    }
	}



