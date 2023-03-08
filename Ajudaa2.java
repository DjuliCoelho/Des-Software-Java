package scrr2;
import java.util.Scanner;

public class Ajudaa2 {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int qtde = 5;
        String[] vetor1 = new String[qtde];
        String[] vetor2 = new String[qtde];
        
        
        for(int i = 0; i < vetor1.length;i++) {
        	System.out.println("Digite um número");
        	vetor1[i] = leitor.nextLine();
        }
        
        for (int i = 0; i <vetor1.length; i++) {
        	String vlrvetor1 = vetor1[i];
        	//int dobro = Integer.parseInt(vlrvetor1) * 2;
        	Integer dobro = Integer.parseInt(vlrvetor1) * 2;

        	vetor2[i] = dobro.toString();
        }
        
        for (int i = 0; i <vetor1.length; i++) {   
        	String valor = vetor2[i];
        	System.out.println("Valor em dobro: " + valor);
        }
        
        
       System.out.println("Digite um número: ");
       int numero = leitor.nextInt();
       
       System.out.println("Valor digitado " + numero);
       
       
        leitor.close();
        
    }
	
}
