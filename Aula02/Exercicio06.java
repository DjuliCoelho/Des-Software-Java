package Aula02;

import java.util.Scanner;


public class Exercicio06 {
	public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
        
        double[] notas = new double[5];
        double[] pesos = new double[5];
        double somaNotas = 0, somaPesos = 0;
        
        // lendo as notas do aluno
        System.out.println("Digite as notas do aluno:");
        for (int i = 0; i < 5; i++) {
            notas[i] = leitor.nextDouble();
        }
        
        // lendo os pesos das notas
        System.out.println("Digite os pesos das notas:");
        for (int i = 0; i < 5; i++) {
            pesos[i] = leitor.nextDouble();
            somaPesos += pesos[i];
        }
        
        // calculando a média ponderada
        for (int i = 0; i < 5; i++) {
            somaNotas += notas[i] * pesos[i];
        }
        double mediaPonderada = somaNotas / somaPesos;
        
        // exibindo a média ponderada
        System.out.println("A média ponderada do aluno é: " + mediaPonderada);
        
        leitor.close();
    }
	
	}


