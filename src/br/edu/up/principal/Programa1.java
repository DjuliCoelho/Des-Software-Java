package br.edu.up.principal;

import java.util.Scanner;
import br.up.edu.Biblioteca;

public class Programa1 {
    public static void main(String[] args) {
    	
    	int num1 = 0;
    	int num2 = 0;
    	
    	//A criação de um objeto chamado "leitor"
    	Scanner leitor = new Scanner(System.in);
    	
    	//Usando um método "nextInt();
    	System.out.println("Informe o número 1: ");
    	num1 = leitor.nextInt();
    	
    	System.out.println("Informe o número 2: ");
    	num2 = leitor.nextInt();
    	
    	//int result = num1 + num2;
    	//Usando a função de soma()
    	//int result = somar(num1 , num2);
    	//System.out.println("O resultado é:" + result);
    	
    	int result = Biblioteca.somar(num1, num2);
    	System.out.println("O resultado da soma é:" + result);
    	
    	int result = Biblioteca.subtrair(num1, num2);
    	System.out.println("O resultado da subtração é:" + result);
    	
    	int result = Biblioteca.multi(num1, num2);
    	System.out.println("O resultado da multiplicação é:" + result);
    	
    	int result = Biblioteca.dividir(num1, num2);
    	System.out.println("O resultado da divisão é:" + result);
    	 	
		
	}
    
    public static int somar(int a, int b) {
    	return a + b;
    }
    
    
}
