package Aula01;

import java.lang.Math;
public class Exercicio15 {
	

	    public static void main(String[] args) {
	        // Definindo os pontos P1 e P2
	        double x1 = 0, y1 = 5;
	        double x2 = 10, y2 = 20;

	        // Calculando a distância entre os pontos
	        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

	        // Imprimindo o resultado
	        System.out.printf("A distância entre os pontos P1(%.2f, %.2f) e P2(%.2f, %.2f) é %.2f\n",
	                x1, y1, x2, y2, distancia);
	    }
	}




