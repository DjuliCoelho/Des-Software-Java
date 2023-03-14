package Aula01;

import java.util.Scanner;
public class Exercicio11 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escreve aqui seu melhor N°: ");
		int valor1 = leitor.nextInt();
		System.out.println("Agora escreve outro N°: ");
		int valor2 = leitor.nextInt();
		System.out.println("Só mais um N°: ");
		int valor3 = leitor.nextInt();
		
		 int menor, medio, maior;

	        if (valor1 < valor2 && valor1 < valor3) {
	            menor = valor1;
	            if (valor2 < valor3) {
	                medio = valor2;
	                maior = valor3;
	            } else {
	                medio = valor3;
	                maior = valor2;
	            }
	        } else if (valor2 < valor3) {
	            menor = valor2;
	            if (valor1 < valor3) {
	                medio = valor1;
	                maior = valor3;
	            } else {
	                medio = valor3;
	                maior = valor1;
	            }
	        } else {
	            menor = valor3;
	            if (valor1 < valor2) {
	                medio = valor1; 
	                maior = valor2;
	            } else {
	                medio = valor2;
	                maior = valor1;
	            }
	        }

	        System.out.println("Os nums em ordem crescente são: " + menor + ", " + medio + ", " + maior + ".");
	}
}


