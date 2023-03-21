package Aula03;

import java.util.Scanner;
public class Exercicio09 {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int num, count = 0;
	        for (int i = 1; i <= 20; i++) {
	            System.out.print("Digite o " + i + "º número: ");
	            num = input.nextInt();
	            if (num >= 10 && num <= 150) {
	                count++;
	            }
	        }
	        System.out.println("Total de números no intervalo [10, 150]: " + count);
	        input.close();
	    }
	}



