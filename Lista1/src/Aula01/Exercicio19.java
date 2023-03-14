package Aula01;

import java.util.Scanner;
public class Exercicio19 {
	

	public class VolumeCilindro {
	    public static void main(String[] args) {
	        Scanner leitor = new Scanner(System.in);

	        System.out.print("Digite o raio do cilindro: ");
	        double raio = leitor.nextDouble();

	        System.out.print("Digite a altura do cilindro: ");
	        double altura = leitor.nextDouble();

	        double volume = 3.14 * Math.pow(raio, 2) * altura;

	        System.out.println("O volume do cilindro é: " + volume);
	        leitor.close();
	    }
	}


}
