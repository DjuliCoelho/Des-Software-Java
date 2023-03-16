package Aula02;

public class Exercicio08 {
	public static void main(String[] args) {
		int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = {6, 7, 8, 9, 10};
        int[] vetorC = new int[10];
        
        // copiando os elementos de A para C
        for (int i = 0; i < 5; i++) {
            vetorC[i] = vetorA[i];
        }
        
        // copiando os elementos de B para C
        for (int i = 0; i < 5; i++) {
            vetorC[i+5] = vetorB[i];
        }
        
        // exibindo o vetor C
        System.out.println("Vetor C:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorC[i] + " ");
        }
    
		
	}

}
