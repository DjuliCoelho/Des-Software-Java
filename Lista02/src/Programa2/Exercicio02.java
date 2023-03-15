package Programa2;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
    
    int qtde = leitor.nextInt();
    //int[] vetor = {8, 5, -3};
   
    int[] vetor = new int[qtde];
   
    //repetidor para preencher o vetor
    int contador = 0;
    while (contador < qtde) {
        System.out.println("Informe o núm: " + (contador + 1) + "de" + qtde + ":");
        vetor[contador] = leitor.nextInt();
        contador++;
    }
   
    //repetidor para mostrar o tipo de num
    for(int i = 0; i < qtde; i++) {
       
        int num = vetor[i];
        if (num < 0) {
            System.out.println("Negativo");
        } else if(num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positivo");
        }
   
    }
   
    leitor.close();
  
}

}
