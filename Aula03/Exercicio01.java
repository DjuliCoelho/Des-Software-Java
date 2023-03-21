package Aula03;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		        Scanner leitor = new Scanner(System.in);

		        // leitura do nome do aluno
		        System.out.print("Digite o nome do aluno: ");
		        String nome = leitor.nextLine();

		        // leitura das notas
		        System.out.print("Digite a primeira nota: ");
		        double nota1 = leitor.nextDouble();

		        System.out.print("Digite a segunda nota: ");
		        double nota2 = leitor.nextDouble();

		        System.out.print("Digite a terceira nota: ");
		        double nota3 = leitor.nextDouble();

		        // cálculo da média aritmética
		        double media = (nota1 + nota2 + nota3) / 3;

		        // exibição do resultado
		        System.out.printf("A média do aluno %s é %.2f\n", nome, media);

		        leitor.close();
		    }
	

	}


