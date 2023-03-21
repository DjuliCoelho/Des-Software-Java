package Aula03;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
	
		  Scanner leitor = new Scanner(System.in);

		   // leitura da distância percorrida e do combustível gasto
		   System.out.print("Digite a distância percorrida (em km): ");
		   double distancia = leitor.nextDouble();

		   System.out.print("Digite o total de combustível gasto (em litros): ");
		   double combustivel = leitor.nextDouble();

		   // cálculo do consumo médio
		   double consumo = distancia / combustivel;

		   // exibição do resultado
		   System.out.printf("O consumo médio do automóvel foi de %.2f km/l\n", consumo);

		   leitor.close();
		    
		}

	}


