package Aula01;

import java.util.Scanner;
public class Exercicio06 {

	/*
	 * Ler uma temperatura em graus Celsius e apresentá-la conver�da em graus Fahrenheit.
	 */
	    public static void main(String[] args) {
	        Scanner leitor = new Scanner(System.in);

	        System.out.print("Digite a temperatura em graus Celsius: ");
	        double celsius = leitor.nextDouble();

	        double fahrenheit = (celsius * 1.8) + 32;

	        System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");
	    }
	}


