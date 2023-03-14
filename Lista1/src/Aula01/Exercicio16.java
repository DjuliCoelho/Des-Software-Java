package Aula01;

import java.util.Scanner;
public class Exercicio16 {
	
	    public static void main(String[] args) {
	        Scanner leitor = new Scanner(System.in);

	        System.out.print("Digite a primeira nota: ");
	        double nota1 = leitor.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        double nota2 = leitor.nextDouble();

	        System.out.print("Digite a terceira nota: ");
	        double nota3 = leitor.nextDouble();

	        double media = (nota1 + nota2 + nota3) / 3.0;

	        System.out.printf("Média: %.2f", media);

	        leitor.close();
	    }
	}





