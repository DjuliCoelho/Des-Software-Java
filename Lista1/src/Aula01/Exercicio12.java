package Aula01;

import java.util.Scanner;
public class Exercicio12 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escreve aqui o número do seu mês favorito: ");
		int mes = leitor.nextInt();
		
		switch (mes) {
        case 1:
        	System.out.println("Janeiro");
            break;
        case 2:
        	System.out.println("FEV");
            break;
        case 3:
        	System.out.println("MAR");
            break;
        case 4:
        	System.out.println("ABR");
            break;
        case 5:
        	System.out.println("MAIO");
            break;
        case 6:
        	System.out.println("JUN");
            break;
        case 7:
        	System.out.println("JUL");
            break;
        case 8:
        	System.out.println("AGO");
            break;
        case 9:
        	System.out.println("SEP");
            break;
        case 10:
        	System.out.println("OUT");
            break;
        case 11:
        	System.out.println("NOV");
            break;
        case 12:
        	System.out.println("DEZ");
            break;
        default:
            System.out.println("Mês inválido! Escreva 1 até 12");
            return;
    }
		
	}


}
