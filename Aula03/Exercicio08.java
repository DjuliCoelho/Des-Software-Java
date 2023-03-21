package Aula03;

import java.util.Scanner;
public class Exercicio08 {
	
	public static void main(String[] args) {
		
		    Scanner leitor = new Scanner(System.in);

		    // leitura do nome do aluno
		    System.out.print("Digite o nome do aluno: ");
		    String nome = leitor.nextLine();

		    // leitura das notas do aluno
		    System.out.print("Digite a primeira nota: ");
		    double nota1 = leitor.nextDouble();
		    System.out.print("Digite a segunda nota: ");
		    double nota2 = leitor.nextDouble();
		    System.out.print("Digite a terceira nota: ");
		    double nota3 = leitor.nextDouble();

		     // cálculo da média aritmética
		     double media = (nota1 + nota2 + nota3) / 3;

		     // determinação da menção
		     String mencao;
		        if (media >= 7) {
		            mencao = "Aprovado";
		        } else if (media <= 5) {
		            mencao = "Reprovado";
		        } else {
		            mencao = "Recuperação";
		        }

		        // exibição do resultado
		        System.out.printf("O aluno %s obteve média %.2f e está %s.\n", nome, media, mencao);

		        leitor.close();
		    }
		

	}


