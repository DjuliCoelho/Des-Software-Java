package Aula01;

import java.util.Scanner;

public class Exercicio18 {
	

	public class MediaHarmonica {
	    public static void main(String[] args) {
	        Scanner leitor = new Scanner(System.in);
	        
	        System.out.print("Digite a primeira nota: ");
	        double nota1 = leitor.nextDouble();
	        
	        System.out.print("Digite a segunda nota: ");
	        double nota2 = leitor.nextDouble();
	        
	        System.out.print("Digite a terceira nota: ");
	        double nota3 = leitor.nextDouble();
	        
	        double mediaHarmonica = 3 / ((1/nota1) + (1/nota2) + (1/nota3));
	        
	        System.out.println("A média harmônica é: " + mediaHarmonica);
	    }
	}


}
