package Aula01;
import java.util.Scanner;
public class Exercicio20 {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o tempo de viagem em horas: ");
        double tempo = leitor.nextDouble();

        System.out.print("Digite a velocidade média da viagem em km/h: ");
        double velocidade = leitor.nextDouble();

        double distancia = tempo * velocidade;
        double litrosGastos = distancia / 12;

        System.out.printf("Distância percorrida: %.2f km\n", distancia);
        System.out.printf("Quantidade de litros de combustível gasta: %.2f L\n", litrosGastos);

        leitor.close();
    }


}
