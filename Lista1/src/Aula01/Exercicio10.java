package Aula01;

import java.util.Scanner;
public class Exercicio10 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite o número A: ");
        int a = leitor.nextInt();

        System.out.print("Digite o número B: ");
        int b = leitor.nextInt();
        
        if(a==b) {
        	System.out.print("São iguais sua tonta");
        }else if (a>b) {
        	System.out.print("Se liga  A é maior que o número B");
        }else  {
            System.out.println("O número A é menor q o número B");
        }
	}
}



